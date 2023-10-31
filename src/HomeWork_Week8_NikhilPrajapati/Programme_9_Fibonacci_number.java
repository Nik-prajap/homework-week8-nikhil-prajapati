package HomeWork_Week8_NikhilPrajapati;

import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme_9_Fibonacci_number {

    //Main method
    public static void main(String[] args) {

        // Scanner declaration for input form console
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci sequence : ");
        // variable declaration
        int a = scanner.nextInt();

        //if - else method
        if (a >= 1) {
            int term1 = 1;
            int term2 = 1;
            System.out.print("Fibonacci sequence : " + term1 + " " + term2);

            // for loop
            for (int i = 2; i < a; i++) {
                int term3 = term1 + term2;
                System.out.print(" " + term3);
                term1 = term2;
                term2 = term3;
            }
        } else {
            System.out.println("Please enter a valid number of term (at least 1). ");
        }
        // Scanner object closed
        scanner.close();
    }
}
