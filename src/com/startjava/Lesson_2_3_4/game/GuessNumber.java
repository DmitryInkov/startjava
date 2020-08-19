package com.startjava.Lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private boolean compare;

    private int a = 0;
    private int targetNumber = (int) (Math.random() * 101);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        System.out.println("Имя первого игрока " + player1.getName());
        this.player2 = player2;
        System.out.println("Имя второго игрока " + player2.getName());
    }

    public void start() {
        while (a < 10 && compare != true) {
            inputNumber();
            compareNumber();
            a++;
            finish();
        }
        outputNumbers();
    }

    public void inputNumber() {
        player1.setEnteredNumber(a, scan.nextInt());
        System.out.println("Игрок " + player1.getName() + " вводит число: " + player1.getEnteredNumber(a));
    }

    public boolean compareNumber() {
        if (player1.getEnteredNumber(a) > targetNumber) {
            System.out.println("Введенное число игрока " + player1.getName() + " больше того, что загадал компьютер");
        } else if (player1.getEnteredNumber(a) < targetNumber) {
            System.out.println("Введенное число игрока " + player1.getName() + " меньше того, что загадал компьютер");
        } else if (player1.getEnteredNumber(a) == targetNumber) {
            System.out.println("Игрок " + player1.getName() + " угадал число " + targetNumber + " c " + (a + 1) + " попытки");
            compare = true;
        }
        return compare;
    }

    public void finish() {
        if (a >= 10) {
            System.out.println("У " + player1.getName() + " закончились попытки");
        }
    }

    public void outputNumbers() {
        for (int i:player1.getEnteredNumbers()) {
            System.out.print(i + " ");
        }
    }
}