package com.krawler.SpringDemo.CDI;

import javax.inject.Named;


@Named
public class ProductDAO {
	private String productName;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
}
