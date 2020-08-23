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
            if (makeMove(player1) || makeMove(player2)) {
                break;
            }
        }
        outputNumbers(player1);
        outputNumbers(player2);
    }

    private boolean makeMove(Player player) {

        boolean guess = false;
        inputNumber(player);
        if (compareNumber(player)) {
            guess = true;
        }
        finish(player);
        return guess;
    }

    private void outputNumbers(Player player) {
        for (int number : player.getEnteredNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }

    private void inputNumber(Player player) {
        System.out.println("Игроку " + player.getName() + " нужно ввести число");
        player.setEnteredNumber(scan.nextInt());
        System.out.println("Игрок " + player.getName() + " вводит число: " + player.getCurrentNumber());
        player.setIndex(player.getIndex() + 1);
    }

    private boolean compareNumber(Player player) {

        boolean compare = false;
        if (player.getCurrentNumber() > targetNumber) {
            System.out.println("Введенное число игрока " + player.getName() + " больше того, что загадал компьютер");
        } else if (player.getCurrentNumber() < targetNumber) {
            System.out.println("Введенное число игрока " + player.getName() + " меньше того, что загадал компьютер");
        } else if (player.getCurrentNumber() == targetNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + targetNumber + " c " + (player.getIndex() + 1) + " попытки");
            compare = true;
        }
        return compare;
    }

    private void finish(Player player) {
        if (player.getIndex() >= 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
    }
}