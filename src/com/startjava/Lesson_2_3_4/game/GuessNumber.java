package com.startjava.Lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
	Scanner scan = new Scanner(System.in);
	private Player player1;
	private Player player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		System.out.println("imya pervogo igroka " + player1.getName());
		this.player2 = player2;
		System.out.println("imya vtorogo igroka " + player2.getName());
	}

	public void start() {
		int targetNumber = (int) (Math.random() * 101);

		while(true) {
			player1.setNumber(scan.nextInt());
			System.out.println("igrok " + player1.getName() + " vvodit chislo: " + player1.getNumber());
			if (player1.getNumber() > targetNumber) {
				System.out.println("vvedennoe xhislo igroka " + player1.getName() + " bolshe togo, chto zagadal computer");
			} else if (player1.getNumber() < targetNumber) {
				System.out.println("vvedennoe chislo igroka " + player1.getName() + " menshe togo, chto zagadal computer");
			} else if (player1.getNumber() == targetNumber) {
				System.out.println("igrok " + player1.getName() + " ugadal!");
				break;
			}

			player2.setNumber(scan.nextInt());
			System.out.println("igrok " + player2.getName() + " vvodit chislo: " + player2.getNumber());
			if (player2.getNumber() > targetNumber) {
				System.out.println("vvedennoe сhislo igroka " + player2.getName() + " bolshe togo, chto zagadal computer");
			} else if (player2.getNumber() < targetNumber) {
				System.out.println("vvedennoe сhislo igroka " + player2.getName() + " menshe togo, chto zagadal computer");
			} else if (player2.getNumber() == targetNumber) {
				System.out.println("igrok " + player2.getName() + " ugadal!");
				break;
			}
		}
	}
}