import java.util.ArrayList;

public class StudentNames {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        // Adding students
        students.add("Rahul");
        students.add("Amit");
        students.add("Priya");
        students.add("Sneha");
        students.add("Rohan");

        System.out.println("Student Names:");
        System.out.println(students);

        // Removing a student
        students.remove("Amit");

        System.out.println("\nAfter Removing Amit:");
        System.out.println(students);

        // Searching for a student
        String searchName = "Priya";

        if (students.contains(searchName)) {
            System.out.println("\n" + searchName + " found in the list.");
        } else {
            System.out.println("\n" + searchName + " not found.");
        }

        // Final collection
        System.out.println("\nFinal Student Collection:");
        for (String name : students) {
            System.out.println(name);
        }
    }
}