package com.startjava.Lesson_2_3.person;

public class Person {
	String name = "Vasya";
	String gender = "Male";
	float height = 180.5f;
	float weight = 77.2f;
	byte age = 25;

	void walk() {
		System.out.println("Вася идет");
	}

	void sit() {
		System.out.println("Вася сидит");
	}

	void run() {
		System.out.println("Вася бежит");
	}

	String speak() {
		return "Привет, как дела?";
	}

	boolean learnJava() {
		System.out.println("Вася учит Java");
		return true;
	}
}