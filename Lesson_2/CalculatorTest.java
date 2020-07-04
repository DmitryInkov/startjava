import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		start();
	}

	public static void start() {
		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите первое число: ");
		calculator.setNum1(scanner.nextInt());
		System.out.println("Введите знак математической операции: ");
		calculator.setOperation(scanner.next().charAt(0));
		System.out.println("Введите второе число: ");
		calculator.setNum2(scanner.nextInt());

		calculator.calculate();

		reStart();
	}

	public static void reStart() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Хотите продолжить?");
			String question = scanner.nextLine();
			if (question == "да") {
				start();
				break;
			} else if (question == "нет") {
				break;
			}
		}
	}
}