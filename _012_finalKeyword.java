// Final class - cannot be extended
final class FinalClass {
    // Class implementation
}

class Parent {
    // Final method - cannot be overridden
    final void finalMethod() {
        System.out.println("This method cannot be overridden");
    }
}

class Example {
    // Final variable - cannot be reassigned
    final int CONSTANT = 100;
    
    // Final reference - the reference cannot be changed, but the object can be modified
    final StringBuilder builder = new StringBuilder("Hello");
    
    void method() {
        // CONSTANT = 200; // Compilation error
        builder.append(" World"); // This is allowed
    }
}

public class _012_finalKeyword {
    public static void main(String[] args) {
        // Final class
        FinalClass obj = new FinalClass();
        
        // Final method
        Parent p = new Parent();
        p.finalMethod();
        
        // Final variable
        Example e = new Example();
        System.out.println(e.CONSTANT);
        e.method();
        System.out.println(e.builder);
    }
}
