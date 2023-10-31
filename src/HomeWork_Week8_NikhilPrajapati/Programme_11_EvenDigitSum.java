package HomeWork_Week8_NikhilPrajapati;

import java.util.Scanner;

public class Programme_11_EvenDigitSum {

    public static void main(String[] args) {

        //Scanner declaration for reading form console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number for Even-Digit-Sum : ");
        int num = scanner.nextInt();
        int i = getProgramme_11_EvenDigitSum(num);

        if (i != -1) {
            System.out.println("Sum of even digits : " + i);
        } else {
            System.out.println("Invalid input. Please enter a non-negative number.");
        }

        // Scanner object close
        scanner.close();
    }

    public static int getProgramme_11_EvenDigitSum(int num) {
        if (num < 0) {
            return -1;
        }

        int sum = 0;
        while (num > 0) {

            int digit = num % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }

            num /= 10;

        }

        return sum;
    }
}
