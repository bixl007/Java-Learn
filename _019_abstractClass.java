abstract class Shape {

        protected String color;

        public Shape(String color) {
            this.color = color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public abstract double calculateArea();
}

class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

public class _019_abstractClass {
    public static void main(String[] args) {
        Shape s = new Circle("Red", 2.2);
        System.out.println("Area of circle: " + s.calculateArea());
    }
}
