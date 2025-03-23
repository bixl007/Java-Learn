interface AnimalInterface {
    default void makeSound() {
        System.out.println("Some sound");
    }
}

class Animal implements AnimalInterface {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

public class _018_defaultInterface {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();
    }
}
