package com.startjava.Lesson_2_3.robot;

public class Jaeger {
	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;

	public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strength, int armor) {
		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
		if (height < 0.0f) {
			System.out.println("Некореектная высота");
		} else {
			this.height = height;
		}
		if (weight < 0.0f) {
			System.out.println("Некорректный вес");
		} else {
			this.weight = weight;
		}
		this.speed = speed;
		this.strength = strength;
		this.armor = armor;
	}

	public String getModelName() {
		return modelName;
	}

	public String getMark() {
		return mark;
	}

	public String getOrigin() {
		return origin;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public int getSpeed() {
		return speed;
	}

	public int getStrength() {
		return strength;
	}

	public int getArmor() {
		return armor;
	}

	boolean drift() {
		System.out.println("Вы вошли в дрифт");
		return true;
	}

	void move() {
		System.out.println("Вы идете");
	}

	String scanKaiju() {
		return "nothing";
	}

	void useVortexCannon() {
		System.out.println("Piu-piu");
	}
}