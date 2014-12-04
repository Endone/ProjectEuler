package p10;

public class Solution {

	/**
	 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
	 * 
	 * Find the sum of all the primes below two million.
	 */
	public static void main(String[] args) {
		long sum = 0;
		int num = 2000000;
		for (int i = 2; i < num; i++) {
			if (isPrime(i)) {
				sum += i;
				// System.out.println(i);
			}
		}
		System.out.println(sum);
	}

	private static boolean isPrime(int i) {
		if (i < 2)
			return false;
		if (i < 4)
			return true;
		if (i % 2 == 0)
			return false;
		if (i < 9)
			return true;
		if (i % 3 == 0)
			return false;
		int limit = (int) (Math.sqrt(i));
		int factor = 5;
		while (factor <= limit) {
			if (i % factor == 0)
				return false;
			if (i % (factor + 2) == 0)
				return false;
			factor += 6;
		}
		return true;
	}
}
