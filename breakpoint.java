public class breakpoint {
    public static void main(String[] args) {
        System.out.println("Application starting...");

        int result = calculateSum(5, 10);
        System.out.println("Sum: " + result);

        String message = processMessage("Hello, World!");
        System.out.println("Processed Message: " + message);

        System.out.println("Application ending...");
    }

    private static int calculateSum(int a, int b) {
        return a + b; // Set breakpoint here
    }

    private static String processMessage(String message) {
        // Add a breakpoint on the next line to inspect the message variable
        String processedMessage = message.toLowerCase();
        return processedMessage;
    }
}
