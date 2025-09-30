package collections.exercises;

import java.util.HashSet;
import java.util.Set;

/**
 TODO:
 1. Create a Set<String> cities.
 2. Add at least 5 city names, including one duplicate.
 3. Print all cities (verify no duplicates).
 4. Check if a given city exists.
*/

public class Exercise2
{
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        cities.add("Brussels");
        cities.add("Athens");
        cities.add("Paris");
        cities.add("Brussels");
        cities.add("Barcelona");
        System.out.println(cities);
        if(cities.contains("Brussels")) {
            System.out.println("Brussels is on the cities Set!");
        }
        if(cities.contains("Rome")) {
            System.out.println("Rome is on the cities Set!");
        }
    }
}
