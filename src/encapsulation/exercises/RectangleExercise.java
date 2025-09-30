package encapsulation.exercises;

public class RectangleExercise {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(8, 4);
        rectangle.setHeight(-3);
        rectangle.setHeight(2);
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Area: " + rectangle.getArea());
    }
}
