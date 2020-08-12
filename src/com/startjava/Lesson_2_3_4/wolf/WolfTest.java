package com.startjava.Lesson_2_3_4.wolf;

public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		wolf.setGender("male");
		wolf.setNickname("Volchok");
		wolf.setColor("grey");
		wolf.setWeight(35.2f);
		wolf.setAge(6);

		System.out.println(wolf.getGender());
		System.out.println(wolf.getNickname());
		System.out.println(wolf.getColor());
		System.out.println(wolf.getWeight());
		System.out.println(wolf.getAge());

		wolf.walk();
		wolf.sit();
		wolf.run();
		wolf.howl();
		wolf.hunt();
	}
}