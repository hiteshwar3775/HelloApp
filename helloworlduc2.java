import java.util.Scanner; // Required to use the Scanner tool

public class helloworlduc2 {
    public static void main(String[] args) {
        // Create a Scanner object to read from the standard input stream
        Scanner scanner = new Scanner(System.in);

        // Prompt the user (print without a newline so they type next to it)
        System.out.print("Please enter your name: ");

        // The program pauses here and waits for the user to press Enter
        String name = scanner.nextLine();

        // Output the personalized greeting
        System.out.println("Hello, " + name + "!");

        // Close the scanner to free up system resources
        scanner.close();
    }
}