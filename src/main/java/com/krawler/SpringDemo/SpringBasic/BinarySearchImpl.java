package com.krawler.SpringDemo.SpringBasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortingAlgo quickSortAlgo;
	
//	*************************************
//	Using NAME to resolve CONFLICTS
//	
//	private SortingAlgo quickSortAlgo;
//	private SortingAlgo mergeSortAlgo;
//	*************************************	
	
	
//	*************************************
//	AUTOWIRING BY CONSTRUCTOR
//	public BinarySearchImpl(SortingAlgo searchelement) {
//		super();
//		this.sort = searchelement;
//	}
//	**************************************

//	*************************************
//	AUTOWIRING BY SETTER
//	public void setSortingAlgo(SortingAlgo sort1) {
//		this.sort = sort1;
//	}
//	*************************************

	public int binarySearch(int list[], int searchelement) {
		/*
		 * TIGHT COUPLING
		 * 
		 * MergeSortAlgo merge = new MergeSortAlgo();
		 * QuickSortAlgo quick = new QuickSortAlgo();
		 *
		 * merge.sort(list);
		 */
		list = quickSortAlgo.sort(list);
		
		// Searching algorithm
		
		return 1; // Position of searched element returned
	}
	
}
