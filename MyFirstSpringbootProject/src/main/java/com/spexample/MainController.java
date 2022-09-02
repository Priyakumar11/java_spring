package com.spexample;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class MainController {
@GetMapping("/Hello")
public String message( ) {
	return "Hello All";
}

@GetMapping("/product/{id}")
public String getProduct(@PathVariable("id") String id) {
	if(id.equals("1"))
		throw new ProductException();
	else
		return "Product found";
}
}
