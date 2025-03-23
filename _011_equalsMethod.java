class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        // Check if the object is compared with itself
        if (this == obj) {
            return true;
        }

        // Check if obj is an instance of Person
        if (!(obj instanceof Person)) {
            return false;
        }

        // Cast obj to Person
        Person person = (Person) obj;

        // Compare relevant fields
        return age == person.age &&
                (name == null ? person.name == null : name.equals(person.name));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + (name == null ? 0 : name.hashCode());
        return result;
    }
}

public class _011_equalsMethod {
    public static void main(String[] args) {
        Person p1 = new Person("John", 30);
        Person p2 = new Person("John", 30);
        Person p3 = new Person("John", 25);

        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p3)); // false
        System.out.println(p1.hashCode());
    }
}
