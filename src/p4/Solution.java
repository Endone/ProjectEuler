package p4;

public class Solution {
	public static void main(String[] args) {
		int max = 0;
		for (int a = 1; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				for (int c = 0; c < 10; c++) {
					for (int x = 1; x < 10; x++) {
						for (int y = 0; y < 10; y++) {
							for (int z = 0; z < 10; z++) {
								if (digit1(c, y, z) == digit6(a, b, x, c, y, z)
										&& digit2(b, c, y, z) == digit5(a, b,
												x, c, y, z)
										&& digit3(a, b, x, c, y, z) == digit4(
												a, b, x, c, y, z)) {
									int product = (a * 100 + b * 10 + c)
											* (x * 100 + y * 10 + z);
									if (product > max) {
										max = product;
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(max);
	}

	public static int digit1(int c, int y, int z) {
		return (c * z) % 10;
	}

	public static int digit2(int b, int c, int y, int z) {
		return ((c * z) / 10 + b * z + c * y) % 10;
	}

	public static int digit3(int a, int b, int x, int c, int y, int z) {
		return (((c * z) / 10 + b * z + c * y) / 10 + c * x + b * y + a * z) % 10;
	}

	public static int digit4(int a, int b, int x, int c, int y, int z) {
		return ((((c * z) / 10 + b * z + c * y) / 10 + c * x + b * y + a * z)
				/ 10 + b * x + a * y) % 10;
	}

	public static int digit5(int a, int b, int x, int c, int y, int z) {
		return (((((c * z) / 10 + b * z + c * y) / 10 + c * x + b * y + a * z)
				/ 10 + b * x + a * y) / 10 + a * x) % 10;
	}

	public static int digit6(int a, int b, int x, int c, int y, int z) {
		return (((((c * z) / 10 + b * z + c * y) / 10 + c * x + b * y + a * z)
				/ 10 + b * x + a * y) / 10 + a * x) / 10;
	}
}
