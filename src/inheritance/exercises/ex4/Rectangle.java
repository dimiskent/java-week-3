package inheritance.exercises.ex4;

public class Rectangle {
    private final double width, height;
    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }
    public double getArea() {
        return height * width;
    }
}
