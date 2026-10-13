
public class Task5_TypeCasting {
    public static void main(String[] args) {
        // Implicit type casting
        int num = 25;
        double result = num;

        System.out.println("Implicit Casting:");
        System.out.println("Integer value: " + num);
        System.out.println("Double value: " + result);

        // Explicit type casting
        double price = 99.75;
        int convertedPrice = (int) price;

        System.out.println("\nExplicit Casting:");
        System.out.println("Double value: " + price);
        System.out.println("Integer value: " + convertedPrice);
    }
}
