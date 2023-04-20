/**
 * This class performs match calculations
 */
public class Calculator {

    /**
     * 1. Functions can take input and return output.
     * 2. Functions may not take any input and still produce output.
     * 3. Functions take input and do not produce any output.
     * 4. Functions do not take any input and do not return any output.
     */

    /**
     * This method adds two integer numbers. accepts two arguments, return int
     * <access modifier><return type><function name>(<Type variable holding the inpput -  called arguments>)
     */

    public int sum(int x, int y) {
        return x + y;
    }

    /**
     * Checks if a number is even or odd
     * take an int number as input, does not return any output
     */
    public void checkEvenOdd(int x) {
        if(x % 2 == 0) {
            System.out.println(x + " is even number!");
        } else {
            System.out.println(x + " is odd number!");
        }
    }

    /**
     * checks if a number is positive or negative
     * takes one integer as input and does not return any output
     */
    public void checksPositiveOrNegative(int x) {
        if(x > 0) {
            System.out.println(x + " is positive number!");
        } else if(x == 0) {
            System.out.println(x + " is zero!");
        } else {
            System.out.println(x + " is negative!");
        }
    }

    /**
     * Outputs a song line, does not take any input
     */
    public String printSongLine() {
        return "Mai hi kyun ishq jahir karu!";
    }

    /**
     * this method take three integers as input and multiplies them
     * and returns multiplication result as an integer.
     */
    public int multiply(int x, int y, int z) {
        return x * y * z;
    }

}