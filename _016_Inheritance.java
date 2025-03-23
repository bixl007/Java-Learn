class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " is barking");
    }

    public void whatBreed() {
        System.out.println(name + " is " + breed);
    }
}

public class _016_Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Tommy", 5, "Bulldog");
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.whatBreed();
    }
}