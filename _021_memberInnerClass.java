public class _021_memberInnerClass {
    private String outerField = "Outer class field";
    
    // Member inner class
    public class InnerClass {
        private String innerField = "Inner class field";
        
        public void display() {
            // Can access all members of outer class
            System.out.println("Outer field: " + outerField);
            System.out.println("Inner field: " + innerField);
        }
    }
    
    public void createInner() {
        InnerClass inner = new InnerClass();
        inner.display();
    }
    
    public static void main(String[] args) {
        // Need an instance of the outer class to create inner class
        _021_memberInnerClass outer = new _021_memberInnerClass();
        
        // Method 1: Using a method that creates inner class
        outer.createInner();
        
        // Method 2: Creating inner class directly
        InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
