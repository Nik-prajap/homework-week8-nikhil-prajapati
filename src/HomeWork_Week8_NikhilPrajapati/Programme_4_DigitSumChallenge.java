package HomeWork_Week8_NikhilPrajapati;

import java.util.Scanner;

public class Programme_4_DigitSumChallenge {
    public static void main(String[] args) {

        // Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your number : ");

        System.out.println(digitSum(125)); // this will print 8
        System.out.println(digitSum(1)); // this will print -1
        System.out.println(digitSum(10)); // this will print 1
        System.out.println(digitSum(-123)); // this will print -1

        if (scanner.hasNextInt()){
            int a = scanner.nextInt();
            int b = digitSum(a);

            if (b != -1){
                System.out.println("Sum of the Digits : " + b);
            } else {
                System.out.println("Invalid input.");
                System.out.println("Please enter a number >=10.");
            }
        } else {
            System.out.println("Invalid input.");
            System.out.println("Please enter a valid number");
        }

        // scanner object closed
        scanner.close();
    }
    public static int digitSum(int a) {
        if (a < 10 || a < 0) {
            // return -1 for invalid entry
            return -1;
        }
        int b = 0;
        while (a > 0) {
            int num = a % 10; //
            b += num;
            a /= 10;
        }

        return b;
    }
}
