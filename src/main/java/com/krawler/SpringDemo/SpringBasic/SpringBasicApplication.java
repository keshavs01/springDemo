package com.krawler.SpringDemo.SpringBasic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.krawler.SpringDemo")
public class SpringBasicApplication {

	public static void main(String[] args) {
		
//		NORMAL FLOW WITHOUT SPRING
//		MergeSortAlgo sortAlgo = new MergeSortAlgo();
//		BinarySearchImpl binarySearch = new BinarySearchImpl(sortAlgo);
		
		ApplicationContext appContext = SpringApplication.run(SpringBasicApplication.class, args);
		BinarySearchImpl binarySearch = appContext.getBean(BinarySearchImpl.class);
		
		binarySearch.binarySearch( new int[] {1,2,3,4}, 3);
				
	}
}
