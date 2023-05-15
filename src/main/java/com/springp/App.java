package com.springp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springp/config.xml");
		Student s1 = (Student) con.getBean("s1");
		System.out.println(s1);

		Student s2 = (Student ) con.getBean("s2");
		System.out.println(s2);
	}
}