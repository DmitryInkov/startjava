package com.startjava.Lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private Player player1;
    private Player player2;

    private int targetNumber = (int) (Math.random() * 101);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        System.out.println("Имя первого игрока " + player1.getName());
        this.player2 = player2;
        System.out.println("Имя второго игрока " + player2.getName());
    }

    public void start() {
        while (player1.getIndex() < 10 && player2.getIndex() < 10) {
            makeMove(player1);
            makeMove(player2);
        }
        outputNumbers(player1);
        System.out.println("");
        outputNumbers(player2);
    }

    public void inputNumber(Player player) {
        System.out.println("Игроку " + player.getName() + " нужно ввести число");
        player.setEnteredNumber(scan.nextInt());
        System.out.println("Игрок " + player.getName() + " вводит число: " + player.getEnteredNumber());
        player.setIndex(player.getIndex() + 1);
    }

    public boolean compareNumber(Player player) {
        boolean compare = false;

        if (player.getEnteredNumber() > targetNumber) {
            System.out.println("Введенное число игрока " + player.getName() + " больше того, что загадал компьютер");
        } else if (player.getEnteredNumber() < targetNumber) {
            System.out.println("Введенное число игрока " + player.getName() + " меньше того, что загадал компьютер");
        } else if (player.getEnteredNumber() == targetNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + targetNumber + " c " + (player.getIndex() + 1) + " попытки");
            compare = true;
        }
        return compare;
    }

    public void finish(Player player) {
        if (player.getIndex() >= 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
    }

    public void makeMove(Player player) {
        inputNumber(player);
        if (compareNumber(player)) {
            break;
        }
        finish(player);
    }

    public void outputNumbers(Player player) {
        for (int number : player.getEnteredNumbers()) {
            System.out.print(number + " ");
        }
    }
}