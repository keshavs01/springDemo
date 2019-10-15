package com.krawler.SpringDemo.Scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class StudentInfo {
	
	@Autowired
	private StudentDAO student;

	public void printProduct() {
		student.getDBConnection();
		
	}
}
