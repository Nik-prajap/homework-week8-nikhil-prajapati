package HomeWork_Week8_NikhilPrajapati;

import java.util.Scanner;

public class Programme_7_FirstAndLastDigitSum {

    public static void main(String[] args) {

        // Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // variable declaration
        int num = scanner.nextInt();
        int a = digitSum(num);

        // if-else method used
        if (a != -1) {
            System.out.println("Sum of the first and last digit: " + a);
        } else {
            System.out.println("Invalid - Needs to be positive number only.");
        }

        // scanner object close
        scanner.close();
    }

    public static int digitSum(int num) {
        if (num < 0) {
            return -1;
        }

        int last = num % 10; // Extract the last digit
        // While loop used
        while (num >= 10) {
            num /= 10; // Remove the last digit
        }

        int first = num;
        return first + last;
    }

}
