package com.krawler.SpringDemo.SpringBasic;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.krawler.SpringDemo.ComponentScan.ProductBusiness;


@Configuration
@ComponentScan("com.krawler.SpringDemo.ComponentScan")
@PropertySource("classpath:application.properties")
public class SpringComponentScan {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringComponentScan.class);
//		BinarySearchImpl binarySearch = appContext.getBean(BinarySearchImpl.class);
		
		ProductBusiness product = appContext.getBean(ProductBusiness.class);
		
		product.printProduct();
				
	}
}
