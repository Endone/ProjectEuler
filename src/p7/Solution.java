package p7;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	/**
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can
	 * see that the 6th prime is 13.
	 * 
	 * What is the 10 001st prime number?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		List<Long> primes = new ArrayList<>();
		primes.add(2L);
		long lastPrime = 2;
		for (int i = 1; i < 10001; i++) {
			for (long j = lastPrime + 1;; j++) {
				boolean isPrime = true;
				for (Long factor : primes) {
					if (j % factor == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					lastPrime = j;
					primes.add(lastPrime);
					break;
				}
			}
		}
		System.out.println(primes.get(primes.size() - 1));
	}
}
