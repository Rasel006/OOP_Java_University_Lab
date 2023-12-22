import java.util.Scanner;

class RectangleArea {
    private double length;
    private double breadth;


    public RectangleArea(double length, double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }

    
    public double calculateArea() {
        return length*breadth;
    }
}

public class AreaOfRectangle {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the length : ");
        double length=scanner.nextDouble();

        System.out.print("Enter the breadth: ");
        double breadth=scanner.nextDouble();

    
        RectangleArea rectangle=new RectangleArea(length, breadth);


        double area=rectangle.calculateArea();
        System.out.println("Area of the rectangle: " + area);

    
        scanner.close();
    }
}










