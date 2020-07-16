import java.util.Scanner;

public class GuessNumberTest {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Игроки вводят свои имена");
		GuessNumber guessNumber = new GuessNumber(new Player(scan.nextLine()), new Player(scan.nextLine()));
		guessNumber.start();
		restart();
	}

	public static void restart() {
		while (true) {
			System.out.println("Хотите продолжить?");
			String answer = scan.nextLine();
			if (answer == "да") {
				guessNumber.start();
				break;
			} else if (answer == "нет") {
				break;
			}
		}
	}
}