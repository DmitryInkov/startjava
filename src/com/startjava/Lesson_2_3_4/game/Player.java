package com.startjava.Lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

	private String name;
	private int[] enteredNumbers = new int[10];

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int[] getEnteredNumbers() {
		return Arrays.copyOf(enteredNumbers, enteredNumbers.length);
	}

	public int getEnteredNumber(int index) {
		return enteredNumbers[index];
	}

	void setEnteredNumber(int index, int number) {
		enteredNumbers[index] = number;
	}
}