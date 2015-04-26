package com.finjava.sorting;

import java.util.ArrayList;
import java.util.List;

import com.finjava.sorting.Swap;
import com.finjava.sorting.SwapImpl;

import junit.framework.TestCase;

public class SwapTest extends TestCase {
	private Swap swapInstance;

	public void setUp() {
		swapInstance = new SwapImpl();
	}

	public void testSort() {
		assertNotNull("swapInstance was null", swapInstance);

		List<Integer> swapList = new ArrayList<Integer>();
		swapList.add(20);
		swapList.add(15);

		swapInstance.process(swapList, 0, 1);

		assertNotNull(swapList);
		assertEquals(Integer.valueOf(15), (Integer) swapList.get(0));
		assertEquals(Integer.valueOf(20), (Integer) swapList.get(1));
	}

	@Override
	public void tearDown() {
		swapInstance = null;
	}
}
