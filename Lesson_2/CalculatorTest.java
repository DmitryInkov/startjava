import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		do {
			System.out.println("Введите первое число: ");
			calculator.setNum1(scanner.nextInt());
			System.out.println("Введите знак математической операции: ");
			calculator.setOperation(scanner.next().charAt(0));
			System.out.println("Введите второе число: ");
			calculator.setNum2(scanner.nextInt());
			calculator.calculate();
			String answer = "";
			while (answer != "да" && answer != "нет") {
				System.out.println("Хотите продолжить?");
				answer = scanner.nextLine();
			} 
		} while (answer == "да");
	}
}