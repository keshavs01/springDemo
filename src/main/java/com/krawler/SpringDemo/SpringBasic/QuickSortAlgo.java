package com.krawler.SpringDemo.SpringBasic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class QuickSortAlgo implements SortingAlgo {
	public int[] sort(int array[]) {
		//logic for Quick Sort
		System.out.println("Quick Sort");
		return array;
	}

}
