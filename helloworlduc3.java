public class helloworlduc3 {
    public static void main(String[] args) {
        // Validate that an argument exists before accessing the array
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // Safe fallback executed if the array is empty
            System.out.println("Hello World!");
        }
    }
}