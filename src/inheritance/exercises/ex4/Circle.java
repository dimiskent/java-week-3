package inheritance.exercises.ex4;

public class Circle extends Shape {
    private final double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * (radius*radius);
    }
}
