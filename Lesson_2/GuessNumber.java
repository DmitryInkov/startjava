import java.util.Scanner;

public class GuessNumber {
	Scanner scanner = new Scanner(System.in);

	public void start() {
		Player player1 = new Player();
		Player player2 = new Player();

		int targetNumber = (int) (Math.random() * 100);

		while(true) {
			player1.setNumber(scanner.nextInt());
			player2.setNumber(scanner.nextInt());

			System.out.println("Первый игрок думает, что это " + player1.getNumber());
			System.out.println("Второй игрок думает, что это " + player2.getNumber());

			if (player1.getNumber() == targetNumber) {
				System.out.println("Первый игрок угадал!");
				break;
			}
			if (player2.getNumber() == targetNumber) {
				System.out.println("Второй игрок угадал!");
				break;
			}
		}
	}
}