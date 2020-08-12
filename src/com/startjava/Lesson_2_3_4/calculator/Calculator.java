package com.startjava.Lesson_2_3_4.calculator;

public class Calculator {
	private int num1;
	private int num2;
	char operation;

	void setNum1(int num1) {
		this.num1 = num1;
	}

	void setNum2(int num2) {
		this.num2 = num2;
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
				pow();
				break;
			case '%': 
				System.out.println("num1 % num2 = " + (num1 % num2));
				break;
		}
	}

	private void pow() {
		int exponentiation = 1;
		for (int i = 1; i <= num2; i++) {
			exponentiation *= num1;
		}
		System.out.println("num1 ^ num2 = " + (exponentiation));
	}
}