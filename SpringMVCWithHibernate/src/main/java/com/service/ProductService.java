package com.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductDao;

@Service
public class ProductService {
	
	@Autowired
	ProductDao productDao;
	
	public String storeProduct(Product product) {
		if(product.getPrice()<1000) {
			return "product price must be greater than 1000";}
		else if(productDao.storeProductDetails(product)>0) {
			return "product details stored successfully";
		}
		else {
			return "product details didnot store";
			
		}
	}
	
	public String updateProduct(Product product)
	{
		if(productDao.updateProduct(product)>0)
		{
			return "record updated successfully";
		}
		else {
			return "record didnot update";
		}
	}
	public String searchProductById(int pid) {
		Product p = productDao.searchProductById(pid);
		if(p==null) {
			return "Record not present";
		}else {
			return p.toString();
		}
	}

}

