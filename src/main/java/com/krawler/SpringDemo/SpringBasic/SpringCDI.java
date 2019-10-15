package com.krawler.SpringDemo.SpringBasic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.krawler.SpringDemo.CDI.ProductBusiness;


@SpringBootApplication
@ComponentScan("com.krawler.SpringDemo.CDI")
public class SpringCDI {

	public static void main(String[] args) {
		
		ApplicationContext appContext = SpringApplication.run(SpringCDI.class, args);
//		BinarySearchImpl binarySearch = appContext.getBean(BinarySearchImpl.class);
		
		ProductBusiness product = appContext.getBean(com.krawler.SpringDemo.CDI.ProductBusiness.class);
		
		product.printProduct();
				
	}
}
