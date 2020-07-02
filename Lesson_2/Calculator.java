public class Calculator {
	int num1;
	int num2;
	char operation;

	void calculation() {
		switch (operation) {
			case '+': 
				System.out.println("num1 + num2 = " + (num1 + num2));
				break;
			case '-': 
				System.out.println("num1 - num2 = " + (num1 - num2));
				break;
			case '*': 
				System.out.println("num1 * num2 = " + (num1 * num2));
				break;
			case '/': 
				System.out.println("num1 / num2 = " + (num1 / num2));
				break;
			case '^': {
				int exponentiation = 1;
				for (int i = 1; i <= num2; i++) {
					exponentiation *= num1;
				}
				System.out.println("num1 ^ num2 = " + (exponentiation));
				}
				break;
			case '%': 
				System.out.println("num1 % num2 = " + (num1 % num2));
				break;
		}
	}
}