package com.startjava.Lesson_2_3_4.array.game;

import java.util.ArrayList;

public class Player {

	private String name;
	private int number;
	private ArrayList<Integer> enteredNumbers = new ArrayList<Integer>();;

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

	public ArrayList<Integer> getEnteredNumbers() {
		return enteredNumbers;
	}

	public void setEnteredNumbers(ArrayList<Integer> enteredNumbers) {
		this.enteredNumbers = enteredNumbers;
	}
}