package com.startjava.Lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int index = 0;
    private int[] enteredNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

    public int getCurrentNumber() {
        return enteredNumbers[index - 1];
    }

    public void setEnteredNumber(int number) {
        enteredNumbers[index] = number;
        index++;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, index);
    }
}