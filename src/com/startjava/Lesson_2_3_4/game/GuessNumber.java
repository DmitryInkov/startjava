package com.startjava.Lesson_2_3_4.game;

import java.util.Scanner;
import java.util.Arrays;

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
	private int targetNumber = (int) (Math.random() * 101);

	public void start() {

		while (a < 10 && b < 10 && player1.getNumber() != targetNumber && player2.getNumber() != targetNumber) {
			enter();
			check();
			a++;
			b++;
			finish();
		}
		numbersPlayers();
	}

	public void enter() {
		player1.setNumber(scan.nextInt());
		System.out.println("Игрок " + player1.getName() + " вводит число: " + player1.getNumber());
		player1.enteredNumbers[a] = player1.getNumber();

		player2.setNumber(scan.nextInt());
		System.out.println("Игрок " + player2.getName() + " вводит число: " + player2.getNumber());
		player2.enteredNumbers[b] = player2.getNumber();
	}

	public void check() {
		if (player1.getNumber() > targetNumber) {
			System.out.println("Введенное число игрока " + player1.getName() + " больше того, что загадал компьютер");
		} else if (player1.getNumber() < targetNumber) {
			System.out.println("Введенное число игрока " + player1.getName() + " меньше того, что загадал компьютер");
		} else if (player1.getNumber() == targetNumber) {
			System.out.println("Игрок " + player1.getName() + " угадал число " + targetNumber + " c " + (b + 1) + " попытки");
		}

		if (player2.getNumber() > targetNumber) {
			System.out.println("Введенное число игрока " + player2.getName() + " больше того, что загадал компьютер");
		} else if (player2.getNumber() < targetNumber) {
			System.out.println("Введенное число игрока " + player2.getName() + " меньше того, что загадал компьютер");
		} else if (player2.getNumber() == targetNumber) {
			System.out.println("Игрок " + player2.getName() + " угадал число " + targetNumber + " c " + (b + 1) + " попытки");
		}
	}


	public void finish() {
		if (a >= 10) {
			System.out.println("У " + player1.getName() + " закончились попытки");
		}
		if (b >= 10) {
			System.out.println("У " + player2.getName() + " закончились попытки");
		}
	}

	public void numbersPlayers() {

        int[] enteredNumbersCopy1 = Arrays.copyOf(player1.enteredNumbers, a);
        int[] enteredNumbersCopy2 = Arrays.copyOf(player2.enteredNumbers, b);

		for (int i = 0; i < enteredNumbersCopy1.length; i++) {
			System.out.print(enteredNumbersCopy1[i] + " ");
		}
		System.out.println("");
		for (int i = 0; i < enteredNumbersCopy2.length; i++) {
			System.out.print(enteredNumbersCopy2[i] + " ");
		}
	}
}