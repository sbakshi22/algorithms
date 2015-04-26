package com.finjava.sorting;

import java.util.List;

public class EfficientBubbleSort implements Sort {


	private Swap swap=new SwapImpl(); 
	
	@Override
	public void sort(List<Integer> list) {
	
		int size  = list.size();
		boolean swapDone = true; 
		int i = 0; 
		while (swapDone && i<size){
			swapDone = false;
			for (int j=i+1; j< size ; j++ ){
				
				if (list.get(i)  >= list.get(j)){
					if (list.get(i) > list.get(j)){
						swap.process(list, i , j); 
					}
					swapDone=true;
				}
			}
			i++;
		}
	}

}
