package collections.exercises;

import java.util.HashMap;
import java.util.Map;

/**
 TODO:
 1. Create a Map<String, String> phoneBook (name → phone number).
 2. Add 3 entries.
 3. Print all entries.
 4. Retrieve one number by name.
 5. Remove one entry.
*/
public class Exercise3
{
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Joe", "123456789");
        phoneBook.put("Mary", "999999989");
        phoneBook.put("Brenda", "000111222");
        System.out.println(phoneBook);
        System.out.println("Joe: " + phoneBook.get("Joe"));
        phoneBook.remove("Joe");
        System.out.println(phoneBook);
    }
}
