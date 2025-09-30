package polymorphism.exercises.exercise4;

import polymorphism.exercises.exercise4.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Rectangle());

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
