package com.finjava.sorting;

import java.util.List;

public class BubbleSort implements Sort {

	private Swap swap=new SwapImpl(); 
	
	@Override
	public void sort(List<Integer> list) {
	
		int size  = list.size();
		for (int i = 0 ; i< size ; i++){
			for (int j=i+1; j< size ; j++ ){
				if (list.get(i)  > list.get(j)){
					swap.process(list, i , j); 
				}
			}
		}
	}

}
