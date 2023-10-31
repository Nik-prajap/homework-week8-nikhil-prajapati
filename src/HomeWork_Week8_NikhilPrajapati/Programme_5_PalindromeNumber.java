package HomeWork_Week8_NikhilPrajapati;

public class Programme_5_PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(12321));
    }

    public static boolean isPalindrome(int num) {
        int num1 = num;
        int reverse = 0;

        while (num != 0) {
            int num2 = num % 10;
            reverse = reverse * 10 + num2;
            num /= 10;
        }
        return num1 == reverse;
    }
}
