import java.util.HashMap;

public class StudentRecords {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        // Adding student records
        students.put(101, "Rahul");
        students.put(102, "Amit");
        students.put(103, "Priya");
        students.put(104, "Sneha");
        students.put(105, "Rohan");

        // Displaying all records
        System.out.println("Student Records:");

        for (Integer id : students.keySet()) {
            System.out.println("ID: " + id + " Name: " + students.get(id));
        }

        // Searching using Student ID
        int searchId = 103;

        if (students.containsKey(searchId)) {
            System.out.println("\nStudent Found: " + students.get(searchId));
        } else {
            System.out.println("\nStudent ID not found.");
        }

        // Removing a student
        students.remove(102);

        System.out.println("\nAfter Removing Student ID 102:");

        for (Integer id : students.keySet()) {
            System.out.println("ID: " + id + " Name: " + students.get(id));
        }
    }
}