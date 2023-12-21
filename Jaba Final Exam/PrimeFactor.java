import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Prime factors of " + number + " are: ");
        findPrimeFactors(number);

        scanner.close();
    }

    private static void findPrimeFactors(int n) {
    
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

    
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
        
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

    
        if (n > 2) {
            System.out.print(n);
        }
    }
}

