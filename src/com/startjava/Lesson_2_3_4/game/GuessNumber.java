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
            inputNumber(player1);
            if (compareNumber(player1) == true) {
                break;
            }
            player1.setIndex(player1.getIndex() + 1);
            finish(player1);

            inputNumber(player2);
            if (compareNumber(player2) == true) {
                break;
            }
            player1.setIndex(player2.getIndex() + 1);
            finish(player2);
        }
        outputNumbers(player1);
        System.out.println("");
        outputNumbers(player2);
    }

    public void inputNumber(Player player) {
        player.setEnteredNumber(player.getIndex(), scan.nextInt());
        System.out.println("Игрок " + player.getName() + " вводит число: " + player.getEnteredNumber(player.getIndex()));
    }

    public boolean compareNumber(Player player) {
        boolean compare = false;

        if (player.getEnteredNumber(player.getIndex()) > targetNumber) {
            System.out.println("Введенное число игрока " + player.getName() + " больше того, что загадал компьютер");
        } else if (player.getEnteredNumber(player.getIndex()) < targetNumber) {
            System.out.println("Введенное число игрока " + player.getName() + " меньше того, что загадал компьютер");
        } else if (player.getEnteredNumber(player.getIndex()) == targetNumber) {
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

    public void outputNumbers(Player player) {
        for (int number:player.getEnteredNumbers()) {
            System.out.print(number + " ");
        }
    }
}