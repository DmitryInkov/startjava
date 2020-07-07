import java.util.Scanner;
public class Player {

	private String name;
	private int number;

	public Player(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void guess() {
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
	}
}