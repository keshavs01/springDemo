package com.krawler.SpringDemo.ComponentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductBusiness {
	
	@Autowired
	private ProductDAO productdao;

	public void printProduct() {
		System.out.println(productdao.getProductName());
	}
}
