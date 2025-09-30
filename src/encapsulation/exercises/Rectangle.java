package encapsulation.exercises;

/**
 TODO:
 1. Create private fields width (double), height (double).
 2. Write a constructor to set them.
 3. Add getters and setters (no negative values allowed).
 4. Add methods: getArea() and getPerimeter().
 */
public class Rectangle
{
    private double width, height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2*(width + height);
    }

    public void setWidth(double width) {
        if(width < 0)
            System.out.println("Negative numbers denied");
        else this.width = width;
    }

    public void setHeight(double height) {
        if(height < 0)
            System.out.println("Negative numbers denied");
        else this.height = height;
    }
}

