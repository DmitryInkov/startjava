public class MyFirstGame {
	public static void main(String[] args) {
		int guessedNumber = 48;
		int yourNumber = 1;
		if (yourNumber > 0 && yourNumber <= 100) {
			while (yourNumber != guessedNumber) {
				if (yourNumber < guessedNumber) {
					System.out.println("Введенное вами число меньше того, что загадал компьютер");
				} else if (yourNumber > guessedNumber) {
					System.out.println("Введенное вами число больше того, что загадал компьютер");
				}
				yourNumber++;
			}
			if (yourNumber == guessedNumber) {
				System.out.println("Вы угадали!");
			} 
		}
	}
}
