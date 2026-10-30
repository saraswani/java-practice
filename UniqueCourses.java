import java.util.HashSet;

public class UniqueCourses {
    public static void main(String[] args) {

        HashSet<String> courses = new HashSet<>();

        // Adding courses
        courses.add("Java");
        courses.add("Python");
        courses.add("C++");
        courses.add("Web Development");
        courses.add("Data Science");
        courses.add("JavaScript");
        courses.add("SQL");

        // Adding duplicate courses
        courses.add("Java");
        courses.add("Python");

        System.out.println("Unique Courses:");
        System.out.println(courses);

        // Searching for a course
        String searchCourse = "Java";

        if (courses.contains(searchCourse)) {
            System.out.println("\n" + searchCourse + " course found.");
        } else {
            System.out.println("\nCourse not found.");
        }

        System.out.println("\nTotal Unique Courses: " + courses.size());
    }
}