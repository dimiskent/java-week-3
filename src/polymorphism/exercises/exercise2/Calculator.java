package polymorphism.exercises.exercise2;

/**
 TODO:
 1. Create a Calculator class.
 2. Add overloaded add() methods:
      - add(int a, int b)
      - add(double a, double b)
      - add(int a, int b, int c)
 3. Test them in main().
*/
public class Calculator {
    public int add(int a, int b) {
        return a+b;
    }
    public int add(int a, int b, int c) {
        return a+b+c;
    }
    public double add(double a, double b) {
        return a+b;
    }
}
