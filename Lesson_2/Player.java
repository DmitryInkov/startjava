public class Player {

	private String name;
	private int number;

	public Player(String name) {
		this.name = name;
	}

	public int getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	void setNumber(int number) {
		this.number = number;
	}
}