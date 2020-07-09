import java.util.Scanner;

public class GuessNumberTest {
	static Scanner scanner = new Scanner(System.in);
	static GuessNumber guessNumber = new GuessNumber();

	public static void main(String[] args) {
		Player player1 = new Player(scanner.nextLine());
		Player player2 = new Player(scanner.nextLine());

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
