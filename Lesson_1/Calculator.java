public class Calculator {
	public static void main(String[] args) {
		int num1 = 8;
		int num2 = 2;
		char mathOperation = '+';

		if (mathOperation == '+') {
			System.out.println("num1 + num2 = " + (num1 + num2));
		} else if (mathOperation == '-') {
			System.out.println("num1 - num2 = " + (num1 - num2));
		} else if (mathOperation == '*') {
			System.out.println("num1 * num2 = " + (num1 * num2));
		} else if (mathOperation == '/') {
			System.out.println("num1 / num2 = " + (num1 / num2));
		} else if (mathOperation == '^') {
			int exponentiation = 1;
			for (int i = 1; i <= num2; i++) {
				exponentiation *= num1;
			}
			System.out.println("num1 ^ num2 = " + (exponentiation));
		} else if (mathOperation == '%') {
			System.out.println("num1 % num2 = " + (num1 % num2));
		}
	}
}
