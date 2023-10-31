package HomeWork_Week8_NikhilPrajapati;

import java.util.Scanner;

/**
 * 8. Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

public class Programme_8_SymbolTriangle {

    // Main method
    public static void main(String[] args) {

        // Scanner declaration for input reading form console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for the right-angle triangle : ");
        // variable declaration
        int a = scanner.nextInt();

        // for loop
        for (int i = 1; i <= a; i++){
            for (int b = 1; b <= i; b++){ // nested for loop
                System.out.print("@");
            }
            System.out.println();
        }

        //scanner object closed
        scanner.close();
    }
}
