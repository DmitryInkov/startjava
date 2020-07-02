public class Jaeger {
	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;

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

	void setModelName(String modelName) {
		this.modelName = modelName;
	}

	void setMark(String mark) {
		this.mark = mark;
	}

	void setOrigin(String origin) {
		this.origin = origin;
	}

	void setHeight(float height) {
		if (height < 0.0f) {
			System.out.println("Некореектная высота");
		} else {
			this.height = height;
		}
	}

	void setWeight(float weight) {
		if (weight < 0.0f) {
			System.out.println("Некорректный вес");
		} else {
			this.weight = weight;
		}
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	void setStrength(int strength) {
		this.strength = strength;
	}

	void setArmor(int armor) {
		this.armor = armor;
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