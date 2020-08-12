package com.startjava.Lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		System.out.println("Калькулятор запущен");
		String answer = "да";
		while(answer.equals("да")) {
			System.out.print("Введите первое число: ");
			calculator.setNum1(scanner.nextInt());
			System.out.print("Введите знак математической операции: ");
			calculator.setOperation(scanner.next().charAt(0));
			System.out.print("Введите второе число: ");
			calculator.setNum2(scanner.nextInt());
			calculator.calculate();
			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				answer = scanner.next();
			} while(!answer.equals("да") && !answer.equals("нет"));
		}
		System.out.println("Калькулятор закрылся");
	}
}