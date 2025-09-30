package composition.exercises;

public class Main {
    public static void main(String[] args) {
        // EXERCISE 1
        Computer computer = new Computer();
        computer.processData();

        // EXERCISE 3
        House house = new House();
        house.printRoomArea();

        // EXERCISE 4
        Library library = new Library();
        library.addBook(new Book("Example Book", "Example Author"));
        library.addBook(new Book("Example Book 2", "Example Author"));
        library.addBook(new Book("Example Novel", "Some Author"));
        library.listBooks();
    }
}
