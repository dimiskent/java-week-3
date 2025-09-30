package exceptions.exercises;

/**
 * Exercise 1:
 * Write a program that divides two numbers.
 * Catch ArithmeticException when dividing by zero.
 * Print a friendly error message.
 */

public class Exercise1
{
    public static void main(String[] args)
    {
        try {
            int destruction = 10 / 0;
        } catch(ArithmeticException e) {
            System.out.println("Sorry, you cannot divide by Zero!!!");
        }
    }
}




