package com.krawler.SpringDemo.ComponentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductBusiness {
	
	@Autowired
	private ProductDAO productdao;

	public void printProduct() {
		productdao.setProductName("Chocolate");
		System.out.println(productdao.getProductName());
	}
}
