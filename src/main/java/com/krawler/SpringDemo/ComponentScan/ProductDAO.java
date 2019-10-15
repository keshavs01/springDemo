package com.krawler.SpringDemo.ComponentScan;

import org.springframework.stereotype.Component;

@Component
public class ProductDAO {
	private String productName;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
}
