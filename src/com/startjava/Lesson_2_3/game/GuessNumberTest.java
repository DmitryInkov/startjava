package com.startjava.Lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer;
		do {
			System.out.println("igroki vvodyat svoi imena");
			GuessNumber guessNumber = new GuessNumber(new Player(scan.nextLine()), new Player(scan.nextLine()));
			guessNumber.start();
			answer = "";
			while (answer != "da" && answer != "net") {
				System.out.println("Hotite prdolgit?");
				answer = scan.nextLine();
			}
		} while (answer == "da");
	}
}