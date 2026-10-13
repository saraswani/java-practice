
import java.util.Scanner;

public class Task1_StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks in Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks in Subject 3: ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        String result;
        if (m1 < 35 || m2 < 35 || m3 < 35) {
            result = "Fail";
        } else {
            result = "Pass";
        }

        System.out.println("\n----- Student Result -----");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total + "/300");
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Result: " + result);

        sc.close();
    }
}
