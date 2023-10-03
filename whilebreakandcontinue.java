import java.util.Scanner;
public class whilebreakandcontinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;

        System.out.println("Enter numbers to calculate their sum.");
        System.out.println("Enter a negative number to stop.");

        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number < 0) {
                break; 
            }

            if (number % 2 == 0) {
                continue; 
            }

            sum += number;
        }

        System.out.println("Sum of odd numbers: " + sum);
        scanner.close();
    }
}
