package constructors.exercises;

public class RectangleExercise {
    public static void main(String[] args) {
        Rectangle square = new Rectangle(4);
        Rectangle rectangle = new Rectangle(8, 4);
        System.out.println("Rectangle");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Square");
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}
