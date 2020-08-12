package com.startjava.Lesson_2_3_4.wolf;

public class Wolf {
	private String gender;
	private String nickname;
	private String color;
	private float weight;
	private int age;

	public String getGender() {
		return gender;
	}

	void setGender(String gender) {
		this.gender = gender;
	}

	public String getNickname() {
		return nickname;
	}

	void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	public float getWeight() {
		return weight;
	}

	void setWeight(float weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	void setAge(int age) {
		if (age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

	public void walk() {
		System.out.println("Волк идет");
	}

	public void sit() {
		System.out.println("Волк сидит");
	}

	public void run() {
		System.out.println("Волк бежит");
	}

	public void howl() {
		System.out.println("Волк воет");
	}

	public void hunt() {
		System.out.println("Волк охотится");
	}
}