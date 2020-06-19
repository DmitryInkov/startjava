public class MyFirstGame {
	public static void main(String[] args) {
		int guessedNumber = 48;
		for (int i = 0; i <= 100; i++) {
			if (i < guessedNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
			} else if (i > guessedNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
			} else if (i == guessedNumber) {
				System.out.println("Вы угадали!");
			}
		}
	}
}