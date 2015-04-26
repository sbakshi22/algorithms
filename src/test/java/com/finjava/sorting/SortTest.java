package com.finjava.sorting;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SortTest {

	private Sort sortInstance;
	private List<Integer> testList;

	@Before
	public void buildSort() {
		this.sortInstance = new EfficientBubbleSort();
		testList = new ArrayList<Integer>();
		
	}

	@Test
	public void testSort_1() {
		assertNotNull("sortInstance was null", sortInstance);
		assertNotNull("test list was null", testList);

		testList.add(4);
		testList.add(3);
		testList.add(2);
		testList.add(1);

		sortInstance.sort(testList);

		assertEquals(Integer.valueOf(1), (Integer) testList.get(0));
		assertEquals(Integer.valueOf(2), (Integer) testList.get(1));
		assertEquals(Integer.valueOf(3), (Integer) testList.get(2));
		assertEquals(Integer.valueOf(4), (Integer) testList.get(3));

	}

	@Test
	public void testSort_2() {
		assertNotNull("sortInstance was null", sortInstance);
		assertNotNull("test list was null", testList);

		testList.add(2);
		testList.add(3);
		testList.add(2);
		testList.add(3);

		sortInstance.sort(testList);
		
		assertEquals(Integer.valueOf(2), (Integer) testList.get(0));
		assertEquals(Integer.valueOf(2), (Integer) testList.get(1));
		assertEquals(Integer.valueOf(3), (Integer) testList.get(2));
		assertEquals(Integer.valueOf(3), (Integer) testList.get(3));

	}

	@After
	public void cleanSort() {
		this.sortInstance = null;
		this.testList = null;
	}

}
