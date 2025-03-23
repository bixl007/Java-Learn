class Animal {
    protected String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    private String breed;
    
    public Dog(String name, String breed) {
        super(name); // Call to parent constructor
        this.breed = breed;
    }
    
    @Override
    public void eat() {
        super.eat(); // Call to parent method
        System.out.println(name + " is eating dog food");
    }
    
    public void display() {
        System.out.println("Name: " + super.name); // Access parent variable
        System.out.println("Breed: " + breed);
    }
}

public class _009_superKeyword {
    public static void main(String[] args) {
        Dog d = new Dog("Buddy", "Labrador");
        d.eat();
        d.display();
    }
}