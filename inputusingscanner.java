
 import java.util.Scanner;
public class inputusingscanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int userInput = scanner.nextInt();

        System.out.println("You entered: " + userInput);

        scanner.close();
    }
}