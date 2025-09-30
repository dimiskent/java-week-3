package constructors.exercises;

/**
 TODO:
 1. Create class Car with private fields brand and year.
 2. Add:
      - Default constructor → sets brand="Unknown", year=0
      - Parameterized constructor → sets brand and year
 3. Add method printCarInfo().
 4. Test both constructors.
*/

public class Car {
    private final String brand;
    private final int year;
    public Car() {
        this.brand = "Unknown";
        this.year = 0;
    }
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    public void printCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
