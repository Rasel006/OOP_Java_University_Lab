import java.util.Scanner;

class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    public Complex multiply(Complex other) {
        double resultReal = this.real * other.real - this.imaginary * other.imaginary;
        double resultImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(resultReal, resultImaginary);
    }

    public String toString() {
        return "(" + real + " + " + imaginary + "i)";
    }
}

public class ComplexOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the real and imaginary parts of the first complex number:");
        double real1 = scanner.nextDouble();
        double imaginary1 = scanner.nextDouble();
        Complex complex1 = new Complex(real1, imaginary1);

        System.out.println("Enter the real and imaginary parts of the second complex number:");
        double real2 = scanner.nextDouble();
        double imaginary2 = scanner.nextDouble();
        Complex complex2 = new Complex(real2, imaginary2);

        Complex sum = complex1.add(complex2);
        Complex difference = complex1.subtract(complex2);
        Complex product = complex1.multiply(complex2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        scanner.close();
    }
}

