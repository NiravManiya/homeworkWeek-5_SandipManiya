package homework_week_9.Programme1_calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter operation (+, -, *, /): ");
        char symbol = scanner.next().charAt(0);

        calculator.calculateResult(num1, num2, symbol);

        scanner.close();
    }
}
