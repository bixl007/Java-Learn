interface Animal {
    void eat();
    void travel();
}

class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void travel() {
        System.out.println("Dog is travelling");
    }
}

public class _017_interface {
    public static void main(String[] args) {

    }
}
