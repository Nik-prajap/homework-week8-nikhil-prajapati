package HomeWork_Week8_NikhilPrajapati;

import java.util.Scanner;

public class Programme_2_MinAndMaxInputChallenge {

    // Main Method
    public static void main(String[] args) {

        // Scanner declaration for reading the input form console
        Scanner scanner = new Scanner(System.in);

        // variable declaration
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;

        // While loop method
        while (true) {
            System.out.println("Enter number : ");

            // if-else method
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                a = Math.min(a, num);
                b = Math.max(b, num);
            } else {
                System.out.println("Invalid input. Exit the loop.");
                break;

            }
        }
        System.out.println("Entered Minimum number : " + a);
        System.out.println("Entered Maximum number : " + b);
    }
}
