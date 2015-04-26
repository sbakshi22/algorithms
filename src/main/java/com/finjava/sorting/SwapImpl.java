package com.finjava.sorting;

import java.util.List;

public class SwapImpl implements Swap {	
	
	public void process(List<Integer> list, int  lowIndex, int highIndex  ){
		int temp = list.get(lowIndex); 
		list.set(lowIndex, list.get(highIndex));
		list.set(highIndex, temp);
	}
	
}
