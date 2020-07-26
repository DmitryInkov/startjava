package com.startjava.Lesson_1.game;

public class MyFirstGame {
	public static void main(String[] args) {
		int guessedNumber = 48;
		int playerNumber = 50;
		while (playerNumber > 0 && playerNumber <= 100) {
			if (playerNumber < guessedNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				playerNumber++;
			} else if (playerNumber > guessedNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				playerNumber--;
			} else {
				System.out.println("Вы угадали!");
				break;
			}
		}
	}
}
