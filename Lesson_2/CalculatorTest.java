import java.util.Scanner;

public class CalculatorTest {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		start();
	}

	public static void start() {
		Calculator calculator = new Calculator();
		System.out.println("Введите первое число: ");
		calculator.setNum1(scanner.nextInt());
		System.out.println("Введите знак математической операции: ");
		calculator.setOperation(scanner.next().charAt(0));
		System.out.println("Введите второе число: ");
		calculator.setNum2(scanner.nextInt());

		calculator.calculate();

		restart();
	}

	public static void restart() {
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