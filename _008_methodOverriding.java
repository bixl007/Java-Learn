class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class _008_methodOverriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();
        Animal c = new Cat();
        a.makeSound();
        b.makeSound();
        c.makeSound();
    }
}
