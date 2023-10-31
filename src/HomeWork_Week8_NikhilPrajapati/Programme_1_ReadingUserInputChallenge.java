package HomeWork_Week8_NikhilPrajapati;

import java.util.Scanner;

public class Programme_1_ReadingUserInputChallenge {

    // Main method
    public static void main(String[] args) {

        // variable declaration
        int sum = 0;
        int i = 0;
        System.out.println("   *** Welcome to the 1st Homework Program of Week 8 Java Learning   ***");

        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);

        // while method used
        while (i < 10) {
            System.out.print("Enter number #" + (i + 1) + " : ");

            //if-else method used
            if (scanner.hasNextInt()) {
                int num1 = scanner.nextInt();
                sum += num1;
                i++;
            } else {
                System.out.println("Invalid number");
                scanner.nextLine();
            }
        }
        System.out.println("Sum of the 10 number is : " + sum);
        //Scanner object closed
        scanner.close();
    }
}
