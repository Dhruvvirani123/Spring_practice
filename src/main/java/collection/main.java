package collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("collection/collectionconfig.xml");
		student s1 = (student) con.getBean("s1");
		
//		System.out.println(s1.getName());
//		System.out.println(s1.getPhones());
//		System.out.println(s1.getAddress());
//		System.out.println(s1.getCourse());
		
		System.out.println(s1);
	}
}