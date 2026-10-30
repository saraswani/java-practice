import java.util.Scanner;
import java.util.InputMismatchException;

public class SafeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            System.out.println("\n1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (a + b));
                    break;

                case 2:
                    System.out.println("Result: " + (a - b));
                    break;

                case 3:
                    System.out.println("Result: " + (a * b));
                    break;

                case 4:
                    if (b == 0) {
                        throw new ArithmeticException("Cannot divide by zero!");
                    }
                    System.out.println("Result: " + (a / b));
                    break;

                case 5:
                    if (b == 0) {
                        throw new ArithmeticException("Cannot perform modulus by zero!");
                    }
                    System.out.println("Result: " + (a % b));
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric input.");

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Calculator execution completed.");
            sc.close();
        }
    }
}