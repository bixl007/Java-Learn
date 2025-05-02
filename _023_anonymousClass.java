public class _023_anonymousClass {
    interface Greeting {
        void greet();
    }
    
    public void performGreeting() {
        // Anonymous class implementing Greeting interface
        Greeting englishGreeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello, world!");
            }
        };
        
        englishGreeting.greet();
        
        // Another anonymous class with different implementation
        Greeting spanishGreeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("¡Hola, mundo!");
            }
        };
        
        spanishGreeting.greet();
    }
    
    public static void main(String[] args) {
        _023_anonymousClass example = new _023_anonymousClass();
        example.performGreeting();
    }
}
