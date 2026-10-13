
public class Task2_NumberPractice {
    public static void main(String[] args) {

        System.out.println("Numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nEven numbers:");
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println("\n\nOdd numbers:");
        int j = 1;
        do {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
            j++;
        } while (j <= 100);

        int sum = 0;
        for (int n = 1; n <= 100; n++) {
            sum += n;
        }

        System.out.println("\n\nSum from 1 to 100: " + sum);
    }
}
