import java.util.Scanner;
public class GuessNumber {
	Scanner scanner = new Scanner(System.in);
	public void start() {
		Player player1 = new Player(scanner.nextLine());
		Player player2 = new Player(scanner.nextLine());

		int targetNumber = (int) (Math.random() * 100);

		while(true) {
			player1.guess();
			player2.guess();

			System.out.println("Первый игрок думает, что это " + player1.getNumber());
			System.out.println("Второй игрок думает, что это " + player2.getNumber());

			if (player1.getNumber() == targetNumber) {
				System.out.println("Первый игрок угадал!");
				restart();
				break;
			}
			if (player2.getNumber() == targetNumber) {
				System.out.println("Второй игрок угадал!");
				restart();
				break;
			}
		}
	}

	public void restart() {
		while (true) {
			System.out.println("Хотите продолжить?");
			String answer = scanner.nextLine();
			if (answer == "да") {
				start();
				break;
			} else if (answer == "нет") {
				break;
			}
		}
	}
}