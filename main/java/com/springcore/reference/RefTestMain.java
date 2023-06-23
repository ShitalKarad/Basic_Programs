package com.springcore.reference;

import java.io.ObjectInputFilter.Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTestMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/Config.xml");
		FirstA firstAObj = (FirstA) context.getBean("firstA");
		System.out.println(firstAObj);
		System.out.println(firstAObj.getObj().getNum2());
	}
}
