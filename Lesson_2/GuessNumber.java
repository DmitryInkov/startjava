import java.util.Scanner;

public class GuessNumber {
	Scanner scanner = new Scanner(System.in);

	public void start() {

		int targetNumber = (int) (Math.random() * 101);

		while(true) {

			Player player1 = new Player(scanner.nextInt());
			System.out.println("Первый игрок вводит число: " + player1.getNumber());
			if (player1.getNumber() > targetNumber) {
				System.out.println("Введенное число первого игрока больше того, что загадал компьютер");
			} else if (player1.getNumber() < targetNumber) {
				System.out.println("Введенное число первого игрока меньше того, что загадал компьютер");
			} else if (player1.getNumber() == targetNumber) {
				System.out.println("Первый игрок угадал!");
				break;
			}

			Player player2 = new Player(scanner.nextInt());
			System.out.println("Второй игрок вводит число: " + player2.getNumber());
			if (player2.getNumber() > targetNumber) {
				System.out.println("Введенное число второго игрока больше того, что загадал компьютер");
			} else if (player2.getNumber() < targetNumber) {
				System.out.println("Введенное число второго игрока меньше того, что загадал компьютер");
			} else if (player2.getNumber() == targetNumber) {
				System.out.println("Второй игрок угадал!");
				break;
			}
		}
	}
}