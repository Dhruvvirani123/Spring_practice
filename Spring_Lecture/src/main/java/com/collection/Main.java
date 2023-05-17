package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/collection/config.xml");
		Student s1 = (Student) context.getBean("s1");
		System.out.println(s1);
	}
}