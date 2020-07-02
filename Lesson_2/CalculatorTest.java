import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		System.out.println("Введите первое число: ");
		calculator.num1 = scanner.nextInt();;
		System.out.println("Введите знак математической операции: ");
		calculator.operation = scanner.next().charAt(0);
		System.out.println("Введите второе число: ");
		calculator.num2 = scanner.nextInt();

		calculator.calculation();
	}
}