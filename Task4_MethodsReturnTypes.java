
public class Task4_MethodsReturnTypes {

    static int square(int n) {
        return n * n;
    }

    static int cube(int n) {
        return n * n * n;
    }

    static double average(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }

    static int maximum(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println("Square of 4: " + square(4));
        System.out.println("Cube of 3: " + cube(3));
        System.out.println("Average: " + average(10, 20, 30));
        System.out.println("Maximum: " + maximum(15, 27));
    }
}
