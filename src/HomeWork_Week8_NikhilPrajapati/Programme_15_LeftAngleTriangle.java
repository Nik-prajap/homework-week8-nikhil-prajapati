package HomeWork_Week8_NikhilPrajapati;
/**
 * Display left angle triangle of * using nested for loops
 */
public class Programme_15_LeftAngleTriangle {

    //Main method
    public static void main(String[] args) {

        // variable declaration
        int a = 5;

        // for loop
        for (int i = 1; i <= a; i++){
            for (int b = 1; b <= i; b++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
