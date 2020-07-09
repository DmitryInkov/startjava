import java.util.Scanner;

public class CalculatorTest {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String answer = "да";
		while (answer == "да") {
			Calculator calculator = new Calculator();
			System.out.println("Введите первое число: ");
			calculator.setNum1(scanner.nextInt());
			System.out.println("Введите знак математической операции: ");
			calculator.setOperation(scanner.next().charAt(0));
			System.out.println("Введите второе число: ");
			calculator.setNum2(scanner.nextInt());
			calculator.calculate();
			System.out.println("Хотите продолжить?");
			answer = scanner.nextLine();
			while (answer != "да" && answer != "нет") {
				System.out.println("Хотите продолжить?");
				scanner.nextLine();
				answer = scanner.nextLine();
			}
		}
	}
}