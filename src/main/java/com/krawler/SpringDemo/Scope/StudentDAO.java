package com.krawler.SpringDemo.Scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class StudentDAO {
	
	public void getDBConnection() {
		System.out.println(" *** Connection Created with DB *** ");
	}
}
