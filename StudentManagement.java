
class Student {
    String studentName;
    int rollNumber;
    String branch;
    double cgpa;

    void displayInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Branch: " + branch);
        System.out.println("CGPA: " + cgpa);
        System.out.println("-------------------------");
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.studentName = "Rahul";
        s1.rollNumber = 101;
        s1.branch = "Computer Engineering";
        s1.cgpa = 9.2;

        Student s2 = new Student();
        s2.studentName = "Priya";
        s2.rollNumber = 102;
        s2.branch = "Information Technology";
        s2.cgpa = 8.8;

        Student s3 = new Student();
        s3.studentName = "Amit";
        s3.rollNumber = 103;
        s3.branch = "Computer Engineering";
        s3.cgpa = 9.0;

        System.out.println("STUDENT MANAGEMENT SYSTEM");
        System.out.println("=========================");

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}
