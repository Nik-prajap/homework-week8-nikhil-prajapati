package HomeWork_Week8_NikhilPrajapati;

/**
 * Write a java program to display the pattern like a diamond, while loop
 *             *
 *           * * *
 *         * * * * *
 *       * * * * * * *
 *     * * * * * * * * *
 *   * * * * * * * * * * *
 * * * * * * * * * * * * * *
 *   * * * * * * * * * * *
 *     * * * * * * * * *
 *       * * * * * * *
 *         * * * * *
 *           * * *
 *             *
 */
public class Programme_14_DiamondPattern {

    // Main method
    public static void main(String[] args) {

        // Variable declaration to row where max star should be placed
        int num = 7;
        // Start of the Diamond
        int stD = 1;
        // Column Printing
        int col;

        while (stD <= num) {
            col = 1;

            // loop 1
            while (col <= num - stD) {
                //Print space between *
                System.out.print(" ");
                col++;
            }
            col = 1;
            // inner loop
            while (col <= stD * 2 - 1) {
                System.out.print("*");
                col++;
            }
            System.out.println();
            stD++;
        }

        stD = num - 1;

        while (stD > 0) {
            col = 1;

            while (col <= num - stD) {
                System.out.print(" ");
                col++;
            }
            col = 1;
            while (col <= stD * 2 - 1) {
                System.out.print("*");
                col++;
            }
            System.out.println();
            stD--;
        }
    }
}