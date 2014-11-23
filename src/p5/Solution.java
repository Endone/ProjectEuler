package p5;

public class Solution {

	/**
	 * 2520 is the smallest number that can be divided by each of the numbers
	 * from 1 to 10 without any remainder.
	 * 
	 * What is the smallest positive number that is evenly divisible by all of
	 * the numbers from 1 to 20?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 20;
		int[] nums = new int[n + 1];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = 0;
		}
		nums[0] = 1;
		nums[1] = 1;
		for (int i = 2; i <= n; i++) {
			for (int j = 2 * i; j <= n; j += i) {
				nums[j] = 1;
			}
		}
		// nums with value 0 is prime
		long sum = 1;
		for (int i = 0; i < n; i++) {
			if (nums[i] == 0) {
				int tmp = n;
				while (tmp >= i) {
					System.out.println(tmp);
					tmp /= i;
					sum *= i;
				}
			}
		}
		System.out.println(sum);
	}
}
