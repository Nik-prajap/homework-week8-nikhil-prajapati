package HomeWork_Week8_NikhilPrajapati;

import java.util.Scanner;

public class Programme_3_FindVowelOrConsonant {

    // Main method
    public static void main(String[] args) {

        // Scanner declaration for input form the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any Alphabet : ");

        String a1 = scanner.next().toLowerCase();

        if (a1.length() == 1 && a1.matches("[a-z]")) {
            char v = a1.charAt(0);
            if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {
                System.out.println("This letter is Vowel");
            } else {
                System.out.println("This letter is Consonant ");
            }
        } else {
            System.out.println("Error : Please use Alphabet next-time");
        }

        // Scanner object closed
        scanner.close();
    }
}

