package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/ref/config.xml");
		A temp = (A) con.getBean("aref");
		System.out.println(temp.getX());

		System.out.println(temp.getOb().getY());
		
//		B temp1 = (B) con.getBean("bref");
//		System.out.println(temp1.getY());
	}
}
