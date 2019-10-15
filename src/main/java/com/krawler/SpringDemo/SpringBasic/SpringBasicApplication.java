package com.krawler.SpringDemo.SpringBasic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
public class SpringBasicApplication {

	public static void main(String[] args) {
		
		ApplicationContext appContext = AnnotationConfigApplicationContext(SpringBasicApplication.class);
		BinarySearchImpl binarySearch = appContext.getBean(BinarySearchImpl.class);
		
		
				
	}
}
