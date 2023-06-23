package com.springcore.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

		  public static void main(String[] args) {
		    System.out.println("Hello World!");
		     ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		      Student student = (Student) context.getBean("student1");
		     System.out.println(student);
		       
		       System.out.println(context.getBean("student2"));
		  }
		}

