import java.util.Scanner;
public class primenumchecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int count = scanner.nextInt();

        System.out.println("Enter " + count + " integers:");

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter integer #" + i + ": ");
            int num = scanner.nextInt();

            if (isPrime(num)) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }

        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
