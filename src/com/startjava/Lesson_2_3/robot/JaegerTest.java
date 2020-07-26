package com.startjava.Lesson_2_3.robot;

public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaeger1 = new Jaeger("Bracer Phoenix", "Mark-5", "USA", 70.7f, 2.1f, 3, 8, 9);

		System.out.println(jaeger1.getModelName());
		System.out.println(jaeger1.getMark());
		System.out.println(jaeger1.getOrigin());
		System.out.println(jaeger1.getHeight());
		System.out.println(jaeger1.getWeight());
		System.out.println(jaeger1.getSpeed());
		System.out.println(jaeger1.getStrength());
		System.out.println(jaeger1.getArmor());

		jaeger1.move();
		jaeger1.useVortexCannon();

		Jaeger jaeger2 = new Jaeger("Browler Yukon", "Mark-1", "Russia", 80.6f, 4.2f, 5, 15, 20);

		System.out.println(jaeger2.getModelName());
		System.out.println(jaeger2.getMark());
		System.out.println(jaeger2.getOrigin());
		System.out.println(jaeger2.getHeight());
		System.out.println(jaeger2.getWeight());
		System.out.println(jaeger2.getSpeed());
		System.out.println(jaeger2.getStrength());
		System.out.println(jaeger2.getArmor());

		jaeger2.scanKaiju();
		jaeger2.drift();
	}
}