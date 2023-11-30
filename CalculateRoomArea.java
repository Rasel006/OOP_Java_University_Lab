import java.util.Scanner;

class Room {
    private double length;
    private double width;

    public Room(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

public class CalculateRoomArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the room: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the room: ");
        double width = scanner.nextDouble();

        Room room = new Room(length, width);

        double area = room.calculateArea();
        System.out.println("The area of the room is: " + area + " square units");

        scanner.close();
    }
}
