package com.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/ref/config.xml");
		A temp = (A) context.getBean("aref");
		System.out.println(temp.getX());
		System.out.println(temp.getOb().getY());
		System.out.println(temp);
		
		
		B temp1 = (B) context.getBean("bref");
		System.out.println(temp.getX());
		System.out.println(temp.getOb().getY());
		System.out.println(temp1);
	}

}
