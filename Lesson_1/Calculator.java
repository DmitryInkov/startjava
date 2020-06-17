public class Calculator {
	public static void main(String[] args) {
		int a = 8;
		int b = 2;
		int c = 0;
		while (c <= 6) {
			if (c == 0) {
				System.out.print("a + b = ");
				System.out.println(a + b);
			}
			else if (c == 1) {
				System.out.print("a - b = ");
				System.out.println(a - b);
			}
			else if (c == 2) {
				System.out.print("a * b = ");
				System.out.println(a * b);
			}
			else if (c == 3) {
				System.out.print("a / b = ");
				System.out.println(a / b);
			}
			else if (c == 4) {
				System.out.print("a * a= ");
				System.out.println(a * a);
			}
			else if (c == 5) {
				System.out.print("a % b= ");
				System.out.println(a % b);
			}
			c++;
		}
	}
}