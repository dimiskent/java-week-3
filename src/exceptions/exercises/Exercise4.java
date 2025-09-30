package exceptions.exercises;

/**
 *  Exercise 4:
 *  Parse a string into an integer.
 *  If the string is not a number (e.g., "abc"),
 *  catch NumberFormatException.
 */

public class Exercise4 
{
    public static void main(String[] args)
    {
        String text = "abc";  // try with "123"
        try {
            int num = Integer.parseInt(text);
        } catch(NumberFormatException e) {
            System.out.println("Invalid input! Not an integer!");
        }
    }
}




