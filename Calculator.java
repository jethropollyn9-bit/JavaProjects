import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            try {
                System.out.println("/select an operation:");
                System.out.println("1. Add | 2. Subtract | 3. Multiply | 4. Divide");        
                int choice = input.nextInt();

                if (choice ==0) {
                    continueCalculating = false;
                    System.out.println("Exiting the calculator.Bye!");
                    break;
                }

                // Checking if the choice is valid first
                System.out.println("Enter first number:");
                double n1 = input.nextDouble();

                System.out.println("Enter second number:");
                double n2 = input.nextDouble();

                switch (choice) {
                    case 1 -> System.out.println("Result: " + Add(n1, n2));
                    case 2 -> System.out.println("Result: " + Subtract(n1, n2));
                    case 3 -> System.out.println("Result: " + Multiply(n1, n2));
                    case 4 -> System.out.println("Result: " + Divide(n1, n2));
                    default -> System.out.println("Invalid Choice.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                input.next(); // Clear the invalid input when an error happens
            }
        }
        input.close(); //only when the loop is over
    }

        public static double Add(double a, double b) {
            return a + b;
        }
        public static double Subtract(double a, double b) {
            return a - b;
        }
        public static double Multiply(double a, double b) {
            return a * b;
        }
        public static double Divide(double a, double b) {
            if (b == 0) {
                System.out.println("Error: Division by zero is not allowed.");
                return 0.0;
            }
            return a / b;
        }

    }