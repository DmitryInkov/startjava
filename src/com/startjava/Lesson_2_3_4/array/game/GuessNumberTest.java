package com.startjava.Lesson_2_3_4.array.game;

import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer;
		do {
			System.out.println("У вас 10 попыток");
			System.out.println("Игроки вводят свои имена");
			GuessNumber guessNumber = new GuessNumber(new Player(scan.nextLine()), new Player(scan.nextLine()));
			guessNumber.start();
			guessNumber.numbersPlayer1();
			System.out.println("");
			guessNumber.numbersPlayer2();
			answer = "";
			while (!answer.equals("да") && !answer.equals("нет")) {
				System.out.println("Хотите продолжить?");
				answer = scan.nextLine();
			}
		} while (answer.equals("да"));
	}
}