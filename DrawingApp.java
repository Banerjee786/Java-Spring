package org.priyam.sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

//@SuppressWarnings("deprecation")
public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BeanFactory b = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//ApplicationContext cont = new ClassPathXmlApplicationContext("spring.xml");
		
		AbstractApplicationContext cont = new ClassPathXmlApplicationContext("spring.xml");
		cont.registerShutdownHook();
		System.out.println(cont.getMessage("greeting", null, "Default Greeting",null)+"\n"); // Final null is locale
		Square s = (Square) cont.getBean("square2");
		Line l = (Line) cont.getBean("line");
		s.draw();
		l.draw();
		
		/*
		 * Following is the example of Coding to Interface 
		 */
		Shape sh = (Shape) cont.getBean("circle");
		sh.draw();
		
	}
}
