
import java.util.Scanner;

public class Task5_StudentMarksArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for student "
                             + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        int highest = marks[0];
        int lowest = marks[0];

        for (int mark : marks) {
            if (mark > highest) {
                highest = mark;
            }
            if (mark < lowest) {
                lowest = mark;
            }
        }

        double average = total / (double) marks.length;

        System.out.println("\nStudent Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1)
                               + ": " + marks[i]);
        }

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        sc.close();
    }
}
