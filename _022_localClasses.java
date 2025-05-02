public class _022_localClasses {
    private String outerField = "Outer class field";

    public void someMethod() {
        final String localVar = "Local variable";
        String effectivelyFinalVar = "Effectively final variable";

        // Local class defined within a method
        class LocalClass {
            public void display() {
                // Can access instance members of outer class
                System.out.println("Outer field: " + outerField);

                // Can access final or effectively final local variables
                System.out.println("Local variable: " + localVar);
                System.out.println("Effectively final: " + effectivelyFinalVar);
            }
        }

        // Create and use the local class
        LocalClass local = new LocalClass();
        local.display();

        // Cannot modify effectively final variables after use in local class
        // effectivelyFinalVar = "Modified"; // Error
    }

    public static void main(String[] args) {
        _022_localClasses outer = new _022_localClasses();
        outer.someMethod();
    }
}
