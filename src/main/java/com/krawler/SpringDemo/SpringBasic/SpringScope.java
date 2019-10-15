package com.krawler.SpringDemo.SpringBasic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.krawler.SpringDemo.Scope.StudentDAO;
import com.krawler.SpringDemo.Scope.StudentInfo;

@Configuration
@ComponentScan("com.krawler.SpringDemo.Scope")
public class SpringScope {
	
	public static Logger LOGGER = LoggerFactory.getLogger(SpringScope.class);

	public static void main(String[] args) {
		
		
		
		ApplicationContext appContext = AnnotationConfigApplicationContext(SpringScope.class, args);
		
		StudentInfo student = appContext.getBean(StudentInfo.class);
		StudentDAO conn = appContext.getBean(StudentDAO.class);
		
		LOGGER.info("1 -> {}",student);		
		LOGGER.info("1 -> {}",conn);
		
		student = appContext.getBean(StudentInfo.class);
		conn = appContext.getBean(StudentDAO.class);
		
		LOGGER.info("2 -> {}",student);		
		LOGGER.info("2 -> {}",conn);
		
		
		student.printProduct();
				
	}
}
