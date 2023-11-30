public class GeometricalShapes {

    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);

        Line line = new Line(point1, point2);
        System.out.println("Length of the line: " + line.getLength());

        Triangle triangle = new Triangle(point1, point2, new Point(5, 6));
        System.out.println("Perimeter of the triangle: " + triangle.getPerimeter());

        Circle circle = new Circle(point1, 5);
        System.out.println("Area of the circle: " + circle.getArea());

        Plane plane = new Plane(point1, point2, new Point(7, 8));
        System.out.println("Area of the plane: " + plane.getArea());

    }

    static class Point {
        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
    }

    static class Line {
        private Point startPoint;
        private Point endPoint;

        public Line(Point startPoint, Point endPoint) {
            this.startPoint = startPoint;
            this.endPoint = endPoint;
        }

        public double getLength() {
            double x1 = startPoint.getX();
            double y1 = startPoint.getY();
            double x2 = endPoint.getX();
            double y2 = endPoint.getY();

            return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        }
    }

    static class Triangle {
        private Point vertex1;
        private Point vertex2;
        private Point vertex3;

        public Triangle(Point vertex1, Point vertex2, Point vertex3) {
            this.vertex1 = vertex1;
            this.vertex2 = vertex2;
            this.vertex3 = vertex3;
        }

        public double getPerimeter() {
            double side1 = new Line(vertex1, vertex2).getLength();
            double side2 = new Line(vertex2, vertex3).getLength();
            double side3 = new Line(vertex3, vertex1).getLength();

            return side1 + side2 + side3;
        }
    }

    static class Circle {
        private Point center;
        private double radius;

        public Circle(Point center, double radius) {
            this.center = center;
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * Math.pow(radius,2);
        }
    }

  
    static class Plane {
        private Point point1;
        private Point point2;
        private Point point3;

        public Plane(Point point1, Point point2, Point point3) {
            this.point1 = point1;
            this.point2 = point2;
            this.point3 = point3;
        }

        public double getArea() {
        
            return new Triangle(point1, point2, point3).getPerimeter();
        }
    }


}
