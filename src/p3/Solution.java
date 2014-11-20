package p3;

public class Solution {

	/**
	 * The prime factors of 13195 are 5, 7, 13 and 29.
	 * 
	 * What is the largest prime factor of the number 600851475143 ?
	 */
	public static void main(String[] args) {
		long num = 600851475143L;
		if (isPrime(num)) {
			System.out.println(num);
			return;
		}
		long root = (long) Math.sqrt(num);
		for (long i = root; i > 1; i--) {
			if (isPrime(i) && (num % i == 0)) {
				System.out.println(i);
				return;
			}
		}
	}

	/**
	 * Better solution by mahmutacar Wed, 19 Nov 2014, 20:08
	 */
	public static void method() {
		long inputNum = 600851475143l;
		for (int i = 2; i < inputNum; i++) {
			if (inputNum % i == 0) {
				inputNum = inputNum / i;
			}
		}
		System.out.print(inputNum);
	}

	private static boolean isPrime(long num) {
		long root = (long) Math.sqrt(num);
		for (long i = 2; i <= root; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
