package com.springcore.constructor;

import java.io.ObjectInputFilter.Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/ConfieConstructorInjection.xml");
		Person personObj = (Person) context.getBean("person");
		System.out.println(personObj);
		
	}
}
