package maths;

import java.util.Scanner;

public class CalculatorUsingSwitchCase {

    public static int calculatorUsingSwitchCase(char operator, int num1, int num2) {
        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                result = Integer.parseInt(null);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the Operator: " + "\n 1. Addition (+)" + "\n 2. Substraction (-)" + "\n 3. Multiplication (*)" + "\n 4. Division (/)" + "\n *********************");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter the Number1: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the Number2: ");
        int num2 = scanner.nextInt();

        System.out.println("Number1 is " + num1 + " " + operator + " Number2 is " + num2 + "= " + calculatorUsingSwitchCase(operator, num1, num2));
    }
}
