public class stacktrace {
    public static void main(String[] args) {
        System.out.println("Application starting...");

        try {
            methodA();
        } catch (Exception e) {
            // Print the stack trace to the console
            e.printStackTrace();
        }

        System.out.println("Application ending...");
    }

    private static void methodA() {
        methodB();
    }

    private static void methodB() {
        methodC();
    }

    private static void methodC() {
        // Throw an exception to generate a stack trace
        throw new RuntimeException("Something went wrong in methodC!");
    }
}
