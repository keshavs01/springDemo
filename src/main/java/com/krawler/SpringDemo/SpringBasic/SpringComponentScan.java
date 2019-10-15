package com.krawler.SpringDemo.SpringBasic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.krawler.SpringDemo.ComponentScan.ProductBusiness;


@SpringBootApplication
@ComponentScan("com.krawler.SpringDemo")
public class SpringComponentScan {

	public static void main(String[] args) {
		
		ApplicationContext appContext = SpringApplication.run(SpringComponentScan.class, args);
//		BinarySearchImpl binarySearch = appContext.getBean(BinarySearchImpl.class);
		
		ProductBusiness product = appContext.getBean(ProductBusiness.class);
		
		product.printProduct();
				
	}
}
