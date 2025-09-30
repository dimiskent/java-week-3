package composition.exercises;

/**
 TODO:
 1. Create class Room with fields: length, width.
 2. Add method getArea() in Room.
 3. Create class House that HAS-A Room.
 4. Add method printRoomArea() in House to delegate to Room.
*/

class Room {
    private final int width;
    private final int height;
    public Room(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getArea() {
        return width * height;
    }
}

public class House {
    private final Room room;
    public House() {
        room = new Room(4, 8);
    }
    public void printRoomArea() {
        System.out.println("Area: " + room.getArea());
    }
}
