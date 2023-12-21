import java.util.Scanner;

public class Reverse{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 4-digit number: ");

        int originalNumber = scanner.nextInt();

        if (isFourDigitNumber(originalNumber)) {
            int reversedNumber = reverseDigits(originalNumber);
            System.out.println("Reversed Number: " + reversedNumber);
        } else {
            System.out.println("Please enter a valid 4-digit number.");
        }

        scanner.close();
    }

    private static boolean isFourDigitNumber(int number) {
        return number >= 1000 && number <= 9999;
    }

    private static int reverseDigits(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }
}
