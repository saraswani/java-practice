
import java.util.Scanner;

public class Task6_Fundamentals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int i = sc.nextInt();

        System.out.print("Enter a float: ");
        float f = sc.nextFloat();

        System.out.print("Enter a double: ");
        double d = sc.nextDouble();

        System.out.println("\n----- Original Values -----");
        System.out.println("Integer: " + i);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);

        // Implicit casting
        double intToDouble = i;
        double floatToDouble = f;

        System.out.println("\n----- Implicit Casting -----");
        System.out.println("Integer to Double: " + intToDouble);
        System.out.println("Float to Double: " + floatToDouble);

        // Explicit casting
        int doubleToInt = (int) d;
        int floatToInt = (int) f;
        float doubleToFloat = (float) d;

        System.out.println("\n----- Explicit Casting -----");
        System.out.println("Double to Integer: " + doubleToInt);
        System.out.println("Float to Integer: " + floatToInt);
        System.out.println("Double to Float: " + doubleToFloat);

        sc.close();
    }
}
