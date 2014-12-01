package p9;

public class Solution {

	/**
	 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
	 * which,
	 * 
	 * a2 + b2 = c2 For example, 32 + 42 = 9 + 16 = 25 = 52.
	 * 
	 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	 * Find the product abc.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 0;// how many steps taken to compute the result
		for (int c = 1; c < 500; c++) {
			int x = 1000 - c;
			int y = 500000 - 1000 * c;
			for (int a = 1; a < x / 2; a++) {
				i++;
				int b = x - a;
				if (a * b == y) {
					System.out.println(a);
					System.out.println(b);
					System.out.println(c);
					System.out.println(a * b * c);
					System.out.println(i);
					return;
				}
			}
		}
	}
}
