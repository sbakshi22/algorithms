package com.finjava.prime;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPrimeUtils {

	@Test
	public void testcheckPrime(){
		assertEquals(true, PrimeUtils.checkPrime(53));
		assertEquals(true, PrimeUtils.checkPrime(350351));
		assertEquals(false, PrimeUtils.checkPrime(25));
		assertEquals(false, PrimeUtils.checkPrime(91));
	}
	
	@Test
	public void testgetNPrime(){
		assertEquals(3, (int)PrimeUtils.getNPrimes(3).size());
		assertEquals(2, (int) PrimeUtils.getNPrimes(1).get(0)); 
		assertEquals(113, (int) PrimeUtils.getNPrimes(30).get(29)); 
		 
	}
	
	
}
