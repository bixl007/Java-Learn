public class _020_staticNestedClass {
    private static String staticOuterField = "Static Outer Field";
    private String instanceOUterField = "Instance Outer Field";

    public static class StaticNestedClass {
        public void display() {
            System.out.println(staticOuterField);

            _020_staticNestedClass outer = new _020_staticNestedClass();
            System.out.println(outer.instanceOUterField);
        }
    }

    public static void main(String[] args) {
        StaticNestedClass nested = new StaticNestedClass();
        nested.display();
    }

}