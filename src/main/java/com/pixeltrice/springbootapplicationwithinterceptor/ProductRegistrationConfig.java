package com.pixeltrice.springbootapplicationwithinterceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class ProductRegistrationConfig extends WebMvcConfigurerAdapter {
	   
	 @Autowired
	 ProductInterceptor productInterceptor;
	   @Override
	   public void addInterceptors(InterceptorRegistry registry) {
		   
	      registry.addInterceptor(productInterceptor);
	   }
	}


