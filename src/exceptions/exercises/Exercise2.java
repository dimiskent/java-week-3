package exceptions.exercises;

/**
 *  Exercise 2:
 *  Create an array of 5 elements.
 *  Try to access index 10.
 *  Catch ArrayIndexOutOfBoundsException and print a message.
 */

public class Exercise2
{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            System.out.println(numbers[10]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Sorry, the index of the array doesn't exist, thus no number!");
        }
    }
}
