public class StringBuilderDemo {
    public static void main(String[] args) {

        // Creating StringBuilder
        StringBuilder sb = new StringBuilder("Hello Java");

        System.out.println("Original Text: " + sb);

        // Append text
        sb.append(" Programming");
        System.out.println("After Append: " + sb);

        // Insert text at position 10
        sb.insert(10, "Language ");
        System.out.println("After Insert: " + sb);

        // Replace a portion of text
        sb.replace(0, 5, "Welcome");
        System.out.println("After Replace: " + sb);

        // Reverse the text
        sb.reverse();
        System.out.println("After Reverse: " + sb);
    }
}