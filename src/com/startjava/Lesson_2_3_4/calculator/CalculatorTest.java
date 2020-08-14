package com.startjava.Lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		System.out.println("Калькулятор запущен");
		String answer = "да";
		while(answer.equals("да")) {
			System.out.print("Введите математическое выражение: ");
			String expression = scanner.nextLine();
			String[] elements = expression.split(" ",3);
			calculator.setNum1(Integer.parseInt(elements[0]));
			calculator.setOperation(elements[1].charAt(0));
			calculator.setNum2(Integer.parseInt(elements[2]));
			calculator.calculate();
			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				answer = scanner.next();
			} while(!answer.equals("да") && !answer.equals("нет"));
		}
		System.out.println("Калькулятор закрылся");
	}
}