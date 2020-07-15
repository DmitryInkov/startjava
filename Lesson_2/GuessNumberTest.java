import java.util.Scanner;

public class GuessNumberTest {
	static Scanner scanner = new Scanner(System.in);
	static GuessNumber guessNumber = new GuessNumber(new Player(scanner.nextLine()), new Player(scanner.nextLine()));

	public static void main(String[] args) {
		guessNumber.start();
		restart();
	}

	public static void restart() {
		while (true) {
			System.out.println("Хотите продолжить?");
			String answer = scanner.nextLine();
			if (answer == "да") {
				guessNumber.start();
				break;
			} else if (answer == "нет") {
				break;
			}
		}
	}
}