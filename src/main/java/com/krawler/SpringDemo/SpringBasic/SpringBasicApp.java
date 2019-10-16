package com.krawler.SpringDemo.SpringBasic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan("com.krawler.SpringDemo.SpringBasic")
public class SpringBasicApp {
	public static void main(String[] args) {
		
		int list[] = {1,2,3,4};
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		BinarySearchImpl search = appContext.getBean(BinarySearchImpl.class);
		
		System.out.println(search);
		search.binarySearch(list, 2);
		
		((AbstractApplicationContext) appContext).close();
		
	}

}
