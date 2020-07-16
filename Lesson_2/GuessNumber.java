import java.util.Scanner;

public class GuessNumber {
	Scanner scan = new Scanner(System.in);
	Player player1;
	Player player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		System.our.println("Имя первого игрока " + player1.getName());
		this.player2 = player2;
		System.our.println("Имя второго игрока " + player2.getName());
	}

	public void start() {
		int targetNumber = (int) (Math.random() * 101);

		while(true) {
			player1.setNumber(scan.nextInt());
			System.out.println("Игрок " + player1.getName() + "вводит число: " + player1.getNumber());
			if (player1.getNumber() > targetNumber) {
				System.out.println("Введенное число игрока " + player1.getName() + "больше того, что загадал компьютер");
			} else if (player1.getNumber() < targetNumber) {
				System.out.println("Введенное число игрока " + player1.getName() + "меньше того, что загадал компьютер");
			} else if (player1.getNumber() == targetNumber) {
				System.out.println("Игрок " + player1.getName() + "угадал!");
				break;
			}

			player2.setNumber(scan.nextInt());
			System.out.println("Игрок " + player2.getName() + "вводит число: " + player2.getNumber());
			if (player2.getNumber() > targetNumber) {
				System.out.println("Введенное число игрока " + player2.getName() + "больше того, что загадал компьютер");
			} else if (player2.getNumber() < targetNumber) {
				System.out.println("Введенное число игрока " + player2.getName() + "меньше того, что загадал компьютер");
			} else if (player2.getNumber() == targetNumber) {
				System.out.println("Игрок " + player2.getName() + "угадал!");
				break;
			}
		}
	}
}