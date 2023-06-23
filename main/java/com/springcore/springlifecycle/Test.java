package com.springcore.springlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext contex = new ClassPathXmlApplicationContext("resources/Config1.xml");
//		Samosa obj = (Samosa) contex.getBean("samosa");
//		System.out.println(obj);
		// using registration hook
		contex.registerShutdownHook();

//		System.out.println("---------------");
//		// using inteface
//		Pepsi pepsi = (Pepsi) contex.getBean("pepsi");
//		System.out.println(pepsi);
//		contex.registerShutdownHook();
		// using Annotation
		System.out.println("---------------------");
		AnnotationUsing obj2 = (AnnotationUsing) contex.getBean("annotation");
		System.out.println(obj2);

	}
}
