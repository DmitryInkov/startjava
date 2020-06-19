public class Cycle {
	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
		}

		int a = 6;
		while (a >= -6) {
			System.out.println(a);
			a -= 2;
		}

		int sumOdd = 0;
		int b = 10;
		do {
			if (b % 2 != 0) {
				sumOdd += b;
			}
			b++;
		} while (b <= 20);
		System.out.println(sum);
	}
}