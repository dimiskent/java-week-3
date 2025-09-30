package constructors.exercises;

public class CarExercise {
    public static void main(String[] args) {
        Car car = new Car();
        Car brandedCar = new Car("BMW", 1999);
        car.printCarInfo();
        brandedCar.printCarInfo();
    }
}
