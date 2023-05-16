package com.infy.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infy.config.SpringConfig;

public class UserInterface {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		
//		Customer customer = (Customer)applicationContext.getBean("customerBean");
		Customer customer = applicationContext.getBean(Customer.class);
		
			customer.setCustomerName("Shital");
		System.out.println(customer.registerCutomerName(customer.getCustomerName()));
	}


}
