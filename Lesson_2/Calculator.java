public class Calculator {
	private int num1;
	private int num2;
	private char operation;

	public int getNum1() {
		return num1;
	}

	void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	void setNum2(int num2) {
		this.num2 = num2;
	}

	public char getOperation() {
		return operation;
	}

	void setOperation(char operation) {
		this.operation = operation;
	}


	void calculate() {
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
			case '^':
				int exponentiation = 1;
				for (int i = 1; i <= num2; i++) {
					exponentiation *= num1;
				}
				System.out.println("num1 ^ num2 = " + (exponentiation));
				break;
			case '%': 
				System.out.println("num1 % num2 = " + (num1 % num2));
				break;
		}
	}
}