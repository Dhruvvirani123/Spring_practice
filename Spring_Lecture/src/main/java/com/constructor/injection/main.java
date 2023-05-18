package com.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/constructor/injection/config.xml");
	person p = (person) context.getBean("p1");
	System.out.println(p);
	
	Addition add = (Addition) context.getBean("add");
	add.sum();
	}

}
