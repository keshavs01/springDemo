package com.krawler.SpringDemo.CDI;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class ProductBusinessCDI {
	
	@Inject
	private ProductDAOCDI productdao;

	public void printProduct() {
		productdao.setProductName("Chocolate using CDI ");
		System.out.println(productdao.getProductName());
	}
}
