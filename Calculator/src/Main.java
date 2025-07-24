//Problem: Calculator
//Write a Java program that takes two numbers and an operator from the user and performs the corresponding arithmetic operation.
//   ✅ Requirements:
//[x]Ask the user to enter two numbers (integer or double).
//[x]Ask for an operator (+, -, *, /).
//[x]Print the result of the operation.
//[x]Handle division by zero.
//[x]Show an error if an invalid operator is entered.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double numberOne = scanner.nextDouble();

        System.out.print("Enter number 2: ");
        double numberTwo = scanner.nextDouble();

        scanner.nextLine(); // catches the next line after entering number two else it will be captured by operator scanner

        System.out.print("Select the operator:(+ , - , / , *): ");
        char operator = scanner.nextLine().trim().charAt(0);

        switch (operator) {
            case '*': {
                System.out.println("Result of multiplication: " + (numberOne * numberTwo));
                break;
            }
            case '/': {
                if (numberTwo == 0) {
                    System.out.println("Error: Division by zero is not allowed");
                } else {

                    double result = numberOne / numberTwo;
                    System.out.println("Result of division:  " + result);
                }
                break;
            }
            case '+': {
                System.out.println("Result of addition: " + (numberOne + numberTwo));
                break;
            }
            case '-': {
                System.out.println("Result of substraction:  " + (numberOne - numberTwo));
                break;
            }
            default: {
                System.out.println("Invalid operator");
                break;
            }
        }
        scanner.close();
    }
}