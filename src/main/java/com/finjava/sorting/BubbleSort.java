package com.finjava.sorting;

import java.util.List;

public class BubbleSort implements Sort {

	private Swap swap=new SwapImpl(); 
	
	@Override
	public void sort(List<Integer> unsortedList) {
	
		int size  = unsortedList.size();
		for (int i = 0 ; i< size ; i++){
			for (int j=i+1; j< size ; j++ ){
				if (unsortedList.get(i)  > unsortedList.get(j)){
					swap.process(unsortedList, i , j); 
				}
			}
		}
	}

}
