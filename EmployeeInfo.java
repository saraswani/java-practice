
class Employee {
    int employeeID;
    String employeeName;
    String department;
    double salary;

    // Default constructor
    Employee() {
        employeeID = 0;
        employeeName = "Not Assigned";
        department = "Not Assigned";
        salary = 0.0;
    }

    // Parameterized constructor
    Employee(int id, String name, String dept, double sal) {
        employeeID = id;
        employeeName = name;
        department = dept;
        salary = sal;
    }

    void displayInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Department: " + department);
        System.out.println("Salary: Rs. " + salary);
        System.out.println("-------------------------");
    }
}

public class EmployeeInfo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(
            201, "Aarav", "Development", 45000
        );

        System.out.println("EMPLOYEE INFORMATION");
        System.out.println("====================");

        System.out.println("Default Constructor:");
        e1.displayInfo();

        System.out.println("Parameterized Constructor:");
        e2.displayInfo();
    }
}
