
import java.util.Scanner;

public class Task3_ScannerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter college name: ");
        String college = sc.nextLine();

        System.out.print("Enter branch: ");
        String branch = sc.nextLine();

        System.out.print("Enter city: ");
        String city = sc.nextLine();

        System.out.println("\n----- Student Information -----");
        System.out.println("Full Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
        System.out.println("Branch: " + branch);
        System.out.println("City: " + city);

        sc.close();
    }
}
