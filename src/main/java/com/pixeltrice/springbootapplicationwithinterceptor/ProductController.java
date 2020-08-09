package com.pixeltrice.springbootapplicationwithinterceptor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@RequestMapping("/products")
	void getProduct(){
		System.out.println("Hey wonderful people I am from controller class");
	}
	

}
