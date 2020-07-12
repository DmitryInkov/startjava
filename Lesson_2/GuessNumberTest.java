import java.util.Scanner;

public class GuessNumberTest {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		GuessNumber guessNumber = new GuessNumber();
		System.out.println("Введите имя первого игрока");
		Player player1 = new Player(scanner.nextLine());
		System.out.println("Введите имя второго игрока");
		Player player2 = new Player(scanner.nextLine());

		guessNumber.start();
		restart();
	}

	public static void restart() {
		GuessNumber guessNumber = new GuessNumber();
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
