package HomeWork_Week8_NikhilPrajapati;

import java.util.Scanner;

public class Programme_6_NumberTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows : ");
        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {

            for (int b = 1; b <= i; b++) {
                System.out.print(b);
            }
            System.out.println();
        }
        scanner.close();
    }
}
