import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Matrix Operations Program!");

        // Input student record book number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your student record book number: ");
        int studentNumber = scanner.nextInt();

        // Calculate C5, C7, C11
        int C5 = studentNumber % 5;
        int C7 = studentNumber % 7;
        int C11 = studentNumber % 11;

        // Output the calculated values
        System.out.println("C5 = " + C5);
        System.out.println("C7 = " + C7);
        System.out.println("C11 = " + C11);

        // Close the scanner
        scanner.close();
    }
}
