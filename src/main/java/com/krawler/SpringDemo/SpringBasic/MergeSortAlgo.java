package com.krawler.SpringDemo.SpringBasic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MergeSortAlgo implements SortingAlgo {
	public int[] sort(int array[]) {
		//logic for Merge Sort
		System.out.println("Merge Sort");
		return array;
	}
}
