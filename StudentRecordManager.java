import java.util.*;

class Student {
    int id;
    String name;
    String course;
    int age;

    Student(int id, String name, String course, int age) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.age = age;
    }

    // Using StringBuilder to format student details
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("ID: ").append(id);
        sb.append(" | Name: ").append(name);
        sb.append(" | Course: ").append(course);
        sb.append(" | Age: ").append(age);

        return sb.toString();
    }
}

public class StudentRecordManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        HashSet<String> courses = new HashSet<>();

        HashMap<Integer, Student> studentMap = new HashMap<>();

        while (true) {

            System.out.println("\n===== Student Record Manager =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Display Unique Courses");
            System.out.println("6. Exit");

            try {
                System.out.print("\nEnter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter Student ID: ");
                        int id = sc.nextInt();

                        if (id <= 0) {
                            System.out.println("Invalid Student ID!");
                            break;
                        }

                        if (studentMap.containsKey(id)) {
                            System.out.println("Student ID already exists!");
                            break;
                        }

                        sc.nextLine();

                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Course: ");
                        String course = sc.nextLine();

                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();

                        if (name.trim().isEmpty() ||
                            course.trim().isEmpty() ||
                            age <= 0) {
                            System.out.println("Invalid student details!");
                            break;
                        }

                        Student s = new Student(id, name, course, age);

                        students.add(s);
                        studentMap.put(id, s);
                        courses.add(course);

                        System.out.println("Student Added Successfully!");
                        break;

                    case 2:
                        if (students.isEmpty()) {
                            System.out.println("No student records found.");
                        } else {
                            System.out.println("\nStudent Records:");

                            for (Student st : students) {
                                System.out.println(st);
                            }
                        }
                        break;

                    case 3:
                        System.out.print("Enter Student ID to Search: ");
                        int searchId = sc.nextInt();

                        if (studentMap.containsKey(searchId)) {
                            System.out.println("Student Found:");
                            System.out.println(studentMap.get(searchId));
                        } else {
                            System.out.println("Student Not Found!");
                        }
                        break;

                    case 4:
                        System.out.print("Enter Student ID to Remove: ");
                        int removeId = sc.nextInt();

                        if (studentMap.containsKey(removeId)) {

                            Student removed = studentMap.remove(removeId);
                            students.remove(removed);

                            // Rebuild unique courses after removal
                            courses.clear();

                            for (Student st : students) {
                                courses.add(st.course);
                            }

                            System.out.println("Student Removed Successfully!");

                        } else {
                            System.out.println("Student ID Not Found!");
                        }
                        break;

                    case 5:
                        if (courses.isEmpty()) {
                            System.out.println("No courses available.");
                        } else {
                            System.out.println("\nUnique Courses:");

                            for (String c : courses) {
                                System.out.println(c);
                            }
                        }
                        break;

                    case 6:
                        System.out.println("Thank you for using Student Record Manager!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid Menu Choice!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter valid numeric input.");
                sc.nextLine();

            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
                sc.nextLine();
            }
        }
    }
}