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

    public double getWidth() {
        return width;
    }
}

public class calculatearea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the room (in meters): ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the room (in meters): ");
        double width = scanner.nextDouble();

        Room room = new Room(length, width);

        double area = room.calculateArea();

        System.out.println("The area of the room is " + area + " square meters.");
        System.out.println("Length: " + room.getLength() + " meters");
        System.out.println("Width: " + room.getWidth() + " meters");

        scanner.close();
    }
}

