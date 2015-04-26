package com.finjava.sorting;

import java.util.ArrayList;
import java.util.List;

import com.finjava.sorting.EfficientBubbleSort;
import com.finjava.sorting.Sort;

import junit.framework.*;

public class EfficientBubbleSortTest extends TestCase{

	private Sort sortInstance; 
	
	public void setUp(){
		sortInstance= new EfficientBubbleSort(); 
	}
	
	public void testSort_1(){
		List<Integer> list = new ArrayList<Integer>(); 
		list.add(4);
		list.add(3); 
		list.add(2);
		list.add(1);
		assertNotNull("sortInstance was null", sortInstance);
		
		sortInstance.sort(list); 
		assertNotNull(list);
		assertEquals(Integer.valueOf(1), (Integer) list.get(0));
		assertEquals(Integer.valueOf(2), (Integer) list.get(1));
		assertEquals(Integer.valueOf(3), (Integer) list.get(2));
		assertEquals(Integer.valueOf(4), (Integer) list.get(3));
		
	}
	
	
	public void testSort_2(){
		List<Integer> list = new ArrayList<Integer>(); 
		list.add(2);
		list.add(3); 
		list.add(2);
		list.add(3);
		assertNotNull("sortInstance was null", sortInstance);
		
	 sortInstance.sort(list); 
		assertNotNull(list);
		assertEquals(Integer.valueOf(2), (Integer) list.get(0));
		assertEquals(Integer.valueOf(2), (Integer) list.get(1));
		assertEquals(Integer.valueOf(3), (Integer) list.get(2));
		assertEquals(Integer.valueOf(3), (Integer) list.get(3));
		
	}
	
	
	public void testSort_3(){
		List<Integer> list = new ArrayList<Integer>(); 
		list.add(-1);
		list.add(-2); 
		list.add(-5);
		list.add(3);
		assertNotNull("sortInstance was null", sortInstance);
		
		 sortInstance.sort(list); 
		assertNotNull(list);
		assertEquals(Integer.valueOf(-5), (Integer) list.get(0));
		assertEquals(Integer.valueOf(-2), (Integer) list.get(1));
		assertEquals(Integer.valueOf(-1), (Integer) list.get(2));
		assertEquals(Integer.valueOf(3), (Integer) list.get(3));
		
	}
	
	public void testSort_4(){
		List<Integer> list = new ArrayList<Integer>(); 
		list.add(5);
		list.add(2); 
		list.add(0);
		list.add(-3);
		list.add(11);
		assertNotNull("sortInstance was null", sortInstance);
		
		 sortInstance.sort(list); 
		assertNotNull(list);
		assertEquals(Integer.valueOf(-3), (Integer) list.get(0));
		assertEquals(Integer.valueOf(0), (Integer) list.get(1));
		assertEquals(Integer.valueOf(2), (Integer) list.get(2));
		assertEquals(Integer.valueOf(5), (Integer) list.get(3));
		assertEquals(Integer.valueOf(11), (Integer) list.get(4));

	}
	
	public void testSort_5(){
		List<Integer> list = new ArrayList<Integer>(); 
		list.add(0);
		list.add(1); 
		list.add(2);
		list.add(3);
		assertNotNull("sortInstance was null", sortInstance);
		
	 sortInstance.sort(list); 
		assertNotNull(list);
		assertEquals(Integer.valueOf(0), (Integer) list.get(0));
		assertEquals(Integer.valueOf(1), (Integer) list.get(1));
		assertEquals(Integer.valueOf(2), (Integer) list.get(2));
		assertEquals(Integer.valueOf(3), (Integer) list.get(3));
	}
	
	public void testSort_6(){
		List<Integer> list = new ArrayList<Integer>(); 
		list.add(1);
		list.add(1); 
		list.add(1);
		list.add(2);
		assertNotNull("sortInstance was null", sortInstance);
		
		sortInstance.sort(list); 
		assertNotNull(list);
		assertEquals(Integer.valueOf(1), (Integer) list.get(0));
		assertEquals(Integer.valueOf(1), (Integer) list.get(1));
		assertEquals(Integer.valueOf(1), (Integer) list.get(2));
		assertEquals(Integer.valueOf(2), (Integer) list.get(3));
	}

	@Override
	public void tearDown(){
		sortInstance=null;
	}
}
