package HomeWork_Week8_NikhilPrajapati;
/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:  (1*1*1)=1
 *         (5*5*5)=125
 *         (3*3*3)=27
 *         so:
 *         1+125+27=153
 */

import java.util.Scanner;

public class Programme_10_ArmstrongNumber {

    // Main method
    public static void main(String[] args) {

        // Scanner declaration to read input form the console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number : ");
        // variable declaration
        int a = scanner.nextInt();

        // if - else statement
        if (isProgramme_10_ArmstrongNumber(a)) {
            System.out.println(a + " is an Armstrong Number.");
        } else {
            System.out.println(a + " is not an Armstrong Number.");
        }

        // Scanner object closed
        scanner.close();
    }

    // static method
    public static boolean isProgramme_10_ArmstrongNumber(int a) {
        int num, mod, ans = 0;
        num = a;

        while (num != 0) {
            mod = num % 10;
            ans += Math.pow(mod, 3);
            num /= 10;

        }
        return ans == a;
    }

}