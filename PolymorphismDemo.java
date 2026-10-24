
class Calculator {
    int calculate(int a, int b) {
        return a + b;
    }

    double calculate(double a, double b) {
        return a + b;
    }

    int calculate(int a, int b, int c) {
        return a + b + c;
    }
}

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key or button");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a self-start button");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println("METHOD OVERLOADING");
        System.out.println("==================");
        System.out.println("Sum of two integers: "
                           + c.calculate(10, 20));
        System.out.println("Sum of two doubles: "
                           + c.calculate(5.5, 4.5));
        System.out.println("Sum of three integers: "
                           + c.calculate(10, 20, 30));

        System.out.println("\nMETHOD OVERRIDING");
        System.out.println("=================");

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v2.start();
    }
}
