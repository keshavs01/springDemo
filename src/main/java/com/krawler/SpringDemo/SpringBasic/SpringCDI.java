package com.krawler.SpringDemo.SpringBasic;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import com.krawler.SpringDemo.CDI.ProductBusinessCDI;


@Configuration
@ComponentScan("com.krawler.SpringDemo.CDI")
public class SpringCDI {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringCDI.class);
//		BinarySearchImpl binarySearch = appContext.getBean(BinarySearchImpl.class);
		
		ProductBusinessCDI product = appContext.getBean(ProductBusinessCDI.class);
		
		product.printProduct();
		((AbstractApplicationContext) appContext).close();
				
	}
}
