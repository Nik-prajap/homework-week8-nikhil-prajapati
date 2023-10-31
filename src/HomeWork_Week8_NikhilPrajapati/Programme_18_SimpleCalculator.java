package HomeWork_Week8_NikhilPrajapati;

/**
 * in Total 8 methods used
 * all method defines as public
 * no public static method used other than main method.
 */

public class Programme_18_SimpleCalculator {

    // Main method
    public static void main(String[] args) {

        //object created to call the below instance methods
        Programme_18_SimpleCalculator calculator = new Programme_18_SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("Add = " + calculator.getAdditionResult());
        System.out.println("Subtract = " + calculator.getSubtractionResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("Multiply = " + calculator.getMultiplicationResult());
        System.out.println("Divide = " + calculator.getDivisionResult());
    }

    // instance Variable declaration
    private double firstNumber;
    private double secondNumber;

    // method 1
    public double getFirstNumber() {
        return firstNumber;
    }

    // method 2
    public double getSecondNumber() {
        return secondNumber;
    }

    // method 3
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    // method 4
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    // method 5
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    // method 6
    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    // method 7
    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    // method 8
    // if else method
    public double getDivisionResult() {
        if (secondNumber != 0) {
            return firstNumber / secondNumber;
        } else {
            return 0.0; // To avoid division by zero
        }
    }
}

