package constructors.exercises;

/**
 TODO:
 1. Create class Rectangle with width and height.
 2. Add:
      - Constructor(width, height)
      - Constructor(width) → height defaults to width (square)
 3. Add methods getArea() and getPerimeter().
 4. Test both constructors.
*/

public class Rectangle {
    private final int width, height;
    public Rectangle(int width) {
        this.width = this.height = width;
    }
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getArea() {
        return width*height;
    }
    public int getPerimeter() {
        return 2*(width+height);
    }
}
