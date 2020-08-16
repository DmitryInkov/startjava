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

	private Player player;
	private int a = 0;
	private int b = 0;
	private int k;
	private int targetNumber = (int) (Math.random() * 101);

	public void start() {

		while (a < 10 && b < 10) {
			player = player1;
			k = a;
			inputNumber();
			compareNumber();
			a++;
			if (player.getNumber() == targetNumber) {
				break;
			}
			finish();
			player = player2;
			k = b;
			inputNumber();
			compareNumber();
			b++;
			if (player.getNumber() == targetNumber) {
				break;
			}
			finish();
		}
		player = player1;
		k = a;
		outputNumbers();
		System.out.println("");
		player = player2;
		k = b;
		outputNumbers();
	}

	public void inputNumber() {
		player.setNumber(scan.nextInt());
		System.out.println("Игрок " + player.getName() + " вводит число: " + player.getNumber());
		player.setEnteredNumbers(k, player.getNumber());
	}

	public void compareNumber() {
		if (player.getNumber() > targetNumber) {
			System.out.println("Введенное число игрока " + player.getName() + " больше того, что загадал компьютер");
		} else if (player.getNumber() < targetNumber) {
			System.out.println("Введенное число игрока " + player.getName() + " меньше того, что загадал компьютер");
		} else if (player.getNumber() == targetNumber) {
			System.out.println("Игрок " + player.getName() + " угадал число " + targetNumber + " c " + (k + 1) + " попытки");
		}
	}

	public void finish() {
		if (k >= 10) {
			System.out.println("У " + player.getName() + " закончились попытки");
		}
	}

	public void outputNumbers() {
    	int[] enteredNumbersCopy = Arrays.copyOf(player.getEnteredNumbers(), k);

		for (int i = 0; i < enteredNumbersCopy.length; i++) {
			System.out.print(enteredNumbersCopy[i] + " ");
		}
	}
}