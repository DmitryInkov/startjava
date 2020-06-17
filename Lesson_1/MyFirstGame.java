public class MyFirstGame {
	public static void main(String[] args) {
		int a = 48;
		for (int i = 0; i <= 100; i++) {
			if (i < a) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
			}
			else if (i > a) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
			}
			else if (i == a) {
				System.out.println("Вы угадали!");
			}
			i++;
		}
	}
}
