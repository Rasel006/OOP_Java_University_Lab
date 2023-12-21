import java.util.Scanner;

public class NumberAnalyzer{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[20];

        System.out.println("Enter 20 integers:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        analyzeNumbers(numbers);

        scanner.close();
    }

    private static void analyzeNumbers(int[] numbers) {
        int positiveCount = 0;
        int negativeCount = 0;
        int oddCount = 0;
        int evenCount = 0;
        int zeroCount = 0;

        for (int number : numbers) {
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            }

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            if (number == 0) {
                zeroCount++;
            }
        }

        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of 0s: " + zeroCount);
    }
}

