package HomeWork_Week8_NikhilPrajapati;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */
public class Programme_12_PrimeNumber {

    // Main Method
    public static void main(String[] args) {

        // Scanner declaration to read input form the console
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a number : ");

        // Variable declaration
        int a = scanner.nextInt();

        // if-else Statement
        if (isProgramme_12_PrimeNumber(a)) {
            System.out.println(a + " ia a Prime Number.");
        } else {
            System.out.println(a + " is not a Prime Number.");
        }

        // Scanner object closed
        scanner.close();
    }
    // static method
    public static boolean isProgramme_12_PrimeNumber(int a) {
        // if - else statement
        if (a <= 1) {
            return false;
        }
        if (a <= 3) {
            return true;
        }
        if (a % 2 == 0 || a % 3 == 0){
            return false;
        }
        // for loop statement
        for (int i = 5; i * i <= a; i += 6 ) {
            if (a % i == 0 || a % (i + 2) == 0){
                return false;
            }
        }
        return true;
    }
}
