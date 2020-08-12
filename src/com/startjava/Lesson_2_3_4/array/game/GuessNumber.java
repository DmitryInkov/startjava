package com.startjava.Lesson_2_3_4.array.game;

import java.util.Scanner;

public class GuessNumber {
	Scanner scan = new Scanner(System.in);
	private Player player1;
	private Player player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		System.out.println("Имя первого игрока " + player1.getName());
		this.player2 = player2;
		System.out.println("Имя второго игрока " + player2.getName());
	}

	private int a = 0;
	private int b = 0;

	public void start() {
		int targetNumber = (int) (Math.random() * 101);

		while (a < 10 && b <10) {
			player1.setNumber(scan.nextInt());
			System.out.println("Игрок " + player1.getName() + " вводит число: " + player1.getNumber());
			player1.getEnteredNumbers().add(player1.getNumber());
			if (player1.getNumber() > targetNumber) {
				System.out.println("Введенное число игрока " + player1.getName() + " больше того, что загадал компьютер");
			} else if (player1.getNumber() < targetNumber) {
				System.out.println("Введенное число игрока " + player1.getName() + " меньше того, что загадал компьютер");
			} else {
				player1.getNumber();
			}
			a++;
			finishPlayer1();

			player2.setNumber(scan.nextInt());
			System.out.println("Игрок " + player2.getName() + " вводит число: " + player2.getNumber());
			player2.getEnteredNumbers().add(player2.getNumber());
			if (player2.getNumber() > targetNumber) {
				System.out.println("Введенное число игрока " + player2.getName() + " больше того, что загадал компьютер");
			} else if (player2.getNumber() < targetNumber) {
				System.out.println("Введенное число игрока " + player2.getName() + " меньше того, что загадал компьютер");
			} else if (player2.getNumber() == targetNumber) {
				System.out.println("Игрок " + player2.getName() + " угадал число " + targetNumber + " c " + (b + 1) + " попытки");
				break;
			}
			b++;
			finishPlayer2();
		}
	}
	public void finishPlayer1() {
		if (a >= 10) {
			System.out.println("У " + player1.getName() + " закончились попытки");
		}
	}

	public void finishPlayer2() {
		if (b >= 10) {
			System.out.println("У " + player2.getName() + " закончились попытки");
		}
	}

	public void numbersPlayer1() {
		for (int i = 0; i < player1.getEnteredNumbers().size(); i++) {
			System.out.print(player1.getEnteredNumbers().get(i) + " ");
		}
	}

	public void numbersPlayer2() {
		for (int i = 0; i < player2.getEnteredNumbers().size(); i++) {
			System.out.print(player2.getEnteredNumbers().get(i) + " ");
		}
	}
}