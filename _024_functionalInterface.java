@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
    
    // Can contain default methods
    default String getOperation() {
        return "Unknown operation";
    }
    
    // Can contain static methods
    static Calculator addition() {
        return (a, b) -> a + b;
    }
}

public class _024_functionalInterface {
    public static void main(String[] args) {
        // Implementing with anonymous class
        Calculator additionOld = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
            
            @Override
            public String getOperation() {
                return "Addition";
            }
        };
        
        System.out.println("Result: " + additionOld.calculate(5, 3));
        System.out.println("Operation: " + additionOld.getOperation());
        
        // Using static factory method
        Calculator add = Calculator.addition();
        System.out.println("Static factory result: " + add.calculate(10, 5));
    }
}
