import java.util.Scanner;

public class Abbreviation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        System.out.print("Enter your full name: ");
        String fullName=scanner.nextLine();

        String[] names=fullName.split("\\s+");
        StringBuilder abbreviation = new StringBuilder();

        for (int i=0;i<names.length-1; i++) {
            String name=names[i];
            abbreviation.append(name.charAt(0)).append(".");
        }

        abbreviation.append(names[names.length-1]);
        System.out.println("Abbreviation: " + abbreviation.toString());

        scanner.close();
    }
}











