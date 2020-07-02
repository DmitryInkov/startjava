public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaeger1 = new Jaeger();
		jaeger1.setModelName("Bracer Phoenix");
		jaeger1.setMark("Mark-5");
		jaeger1.setOrigin("USA");
		jaeger1.setHeight(70.7f);
		jaeger1.setWeight(2.1f);
		jaeger1.setSpeed(3);
		jaeger1.setStrength(8);
		jaeger1.setArmor(9);

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

		Jaeger jaeger2 = new Jaeger();
		jaeger2.setModelName("Browler Yukon");
		jaeger2.setMark("Mark-1");
		jaeger2.setOrigin("Russia");
		jaeger2.setHeight(80.6f);
		jaeger2.setWeight(4.2f);
		jaeger2.setSpeed(5);
		jaeger2.setStrength(15);
		jaeger2.setArmor(20);

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