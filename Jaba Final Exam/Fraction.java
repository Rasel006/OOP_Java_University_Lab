import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator (a): ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the denominator (b): ");
        int denominator = scanner.nextInt();

        if (denominator != 0) {

            int gcd = findGCD(numerator, denominator);

            int simplifiedNumerator = numerator / gcd;
            int simplifiedDenominator = denominator / gcd;

            System.out.println("Fraction in lowest terms: " + simplifiedNumerator + "/" + simplifiedDenominator);
        } else {
            System.out.println("Denominator cannot be zero. Please enter a valid fraction.");
        }

        scanner.close();
    }
    
    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}

