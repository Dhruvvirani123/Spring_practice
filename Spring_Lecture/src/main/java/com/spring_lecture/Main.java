package com.spring_lecture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring_lecture/config.xml");
		Student s1 = (Student) context.getBean("s1");
		System.out.println(s1);
		
		Student s2 = (Student) context.getBean("s2");
		System.out.println(s2);
		
		Student s3 = (Student) context.getBean("s3");
		System.out.println(s3);
	}

}
