package encapsulation.exercises;

/**
 TODO:
 1. Create a private field temperatureInCelsius (double).
 2. Add getter and setter for it (no unrealistic values like -273).
 3. Add a method getFahrenheit() that converts Celsius to Fahrenheit.
 4. Add a method getKelvin() that converts Celsius to Kelvin.
 */

class Temperature
{
    private double temperatureInCelsius;
    public Temperature(double celsiusTemp) {
        setTemperatureInCelsius(celsiusTemp);
    }
    public double getKelvin() {
        return temperatureInCelsius + 273.15;
    }
    public double getFahrenheit() {
        return temperatureInCelsius * 9/5 + 32;
    }
    public void setTemperatureInCelsius(double celsiusTemp) {
        if(celsiusTemp >= -273.15) temperatureInCelsius = celsiusTemp;
        else System.out.println("Invalid temperature! Cannot be below absolute zero!");
    }
}
