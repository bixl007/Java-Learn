// Checked custom exception
class InsufficientFundsException extends Exception {
    private double amount;

    public InsufficientFundsException(String message, double amount) {
        super(message);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

// Unchecked custom exception
class InvalidProductException extends RuntimeException {
    public InvalidProductException(String message) {
        super(message);
    }
}

public class _028_exceptionAssertion {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
