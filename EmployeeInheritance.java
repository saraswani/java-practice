
class Employee {
    String name;
    int employeeID;
    double salary;

    Employee(String name, int employeeID, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: Rs. " + salary);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String language) {
        super(name, id, salary);
        this.programmingLanguage = language;
    }

    void writeCode() {
        System.out.println("Programming Language: "
                           + programmingLanguage);
        System.out.println("Role: Developing software");
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    void manageTeam() {
        System.out.println("Team Size: " + teamSize);
        System.out.println("Role: Managing the team");
    }
}

public class EmployeeInheritance {
    public static void main(String[] args) {
        Developer d = new Developer(
            "Rahul", 301, 60000, "Java"
        );

        Manager m = new Manager(
            "Priya", 302, 80000, 8
        );

        System.out.println("DEVELOPER DETAILS");
        System.out.println("=================");
        d.displayDetails();
        d.writeCode();

        System.out.println("\nMANAGER DETAILS");
        System.out.println("===============");
        m.displayDetails();
        m.manageTeam();
    }
}
