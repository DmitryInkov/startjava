package com.startjava.Lesson_2_3_4.game;

public class Player {

	private String name;
	private int number;
	private int[] enteredNumbers = new int[10];

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	void setNumber(int number) {
		this.number = number;
	}

	public int[] getEnteredNumbers() {
		return enteredNumbers;
	}

	void setEnteredNumbers(int index, int value) {
		enteredNumbers[index] = value;
	}
}