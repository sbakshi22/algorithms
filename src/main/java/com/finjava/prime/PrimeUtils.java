package com.finjava.prime;

import java.util.ArrayList;
import java.util.List;

public class PrimeUtils {

	public static Boolean checkPrime(final Integer primeNumber) {
		int upLimit = (int) Math.floor(Math.sqrt(primeNumber));
		for (int i = 2; i <= upLimit; i++) {
			if (primeNumber % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static List<Integer> getNPrimes(int n) {
		List<Integer> primeList = new ArrayList<Integer>();
		int primeCounter = 0;
		int numberToCheck = 2;
		while (primeCounter < n) {
			if (checkPrime(numberToCheck)) {
				primeList.add(numberToCheck);
				primeCounter++;
			}
			numberToCheck++;
		}
		return primeList;
	}

}
