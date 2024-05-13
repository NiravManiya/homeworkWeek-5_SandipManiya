package homework_week_9.Programme1_calculator;

import java.util.Scanner;

public class Programme4_5_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        char doMoreCalculations = 'Y';
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Please enter one of the symbols (+, -, *, /): ");
        char symbol = scanner.next().charAt(0);
        calculator.calculateResult(num1, num2, symbol);

        System.out.print("Would you like to do more calculation? Please enter 'Y' or 'N': ");
        doMoreCalculations = scanner.next().charAt(0);
        switch (symbol) {
            case '+':
                System.out.println("Addition of " + num1 + " and " + num2 + " is: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Subtraction of " + num1 + " and " + num2 + " is: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Division of " + num1 + " and " + num2 + " is: " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Invalid symbol!");
        }

        scanner.close();
    }
}
