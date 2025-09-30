package encapsulation.exercises;

public class TemperatureExercise {
    public static void main(String[] args) {
        Temperature t = new Temperature(35);
        t.setTemperatureInCelsius(-300);
        System.out.println("Kelvin: " + t.getKelvin());
        System.out.println("Fahrenheit: " + t.getFahrenheit());
    }
}
