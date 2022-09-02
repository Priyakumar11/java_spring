package com.springcrud.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springcrud.beans.Employee;
import com.springcrud.dao.EmployeeDao;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeDao dao;
	
	
	@RequestMapping(value="/empform",  method=RequestMethod.GET)
	public String showForm(Model m){
		m.addAttribute("emp", new Employee());
		//System.out.println("show Form");
		return "empform";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(@ModelAttribute("emp")Employee emp){
		//System.out.println(emp.getEid());
		dao.insert(emp);
		return "redirect:/viewemp";
	}
	@RequestMapping("/viewemp")
	public String viewemp(Model m){
		List<Employee> empList= dao.getEmployeesDetails();
		for(Employee e : empList){
			System.out.println(e.getPid());
		}
		m.addAttribute("empList",empList);
		return "viewemp";
	}
	
	@RequestMapping(value="/editemp/{pid}")
	public String edit(@PathVariable int pid, Model m){
		
		Employee emp=dao.getEmpId(pid);
		m.addAttribute("emp",emp);
		return "empeditform";
	}
	
	
	
	@RequestMapping(value="/searchemp/{pid}")
	public String search(@PathVariable int pid, Model m){
		
		Employee emp=dao.getEmpId(pid);
		m.addAttribute("emp",emp);
		return "viewemp";
	}
	
	@RequestMapping(value="/editsave",method=RequestMethod.POST)
	public String editSave(@ModelAttribute("emp") Employee emp){
		
		System.out.println(emp.getPid());
		dao.update(emp);
		return "redirect:/viewemp";
	}
	
	@RequestMapping(value="/deleteemp/{pid}")
	public String delete(@PathVariable int pid){
		dao.delete(pid);
		return "redirect:/viewemp";
	}
	
}
