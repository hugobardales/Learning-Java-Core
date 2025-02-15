/**
 * A program that value a number as input from scanner and priting if a input is positive, negative, zero or non-integer
 */

import java.util.*;

public class TypeOfInputNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Boolean var which checks if the input is an int
        boolean inputNum = scanner.hasNextInt();

        if (inputNum) {
            int num = scanner.nextInt();
            //Calling the method
            valueIs(num);
        } else {
            System.out.println("non-integer");
        }

        scanner.close();
    }

    /**
     * A method that cheks from scanner a num input and priting the result
     * @param int num
     */
    static void valueIs(int num) {
        if (num == 0) {
            System.out.println("zero");
        } else if (num > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    } 
}
