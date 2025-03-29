/**
 * A program that read an arrays of int and output the maximun product of adjacent numbers elements in the given
 * array of non-nengative integerss.
 * The first line contain the length of array.
 * The Second line contains the elements inside of array.
 */

import java.util.Scanner;

public class AdjacentProduct {
    public static void main(String[] args) {
        // Creates a scanner objet
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        // Creates a new array of type int
        int[] myArr = new int[len];
        // Init throwing an array that read elements from the scanner
        for (int index = 0; index < myArr.length; index++) {
            myArr[index] = scanner.nextInt();
        }
        // Init the var maxProduct that contains a product operation between the two first index
        int maxProd = myArr[0] * myArr[1];
        // Through this array for verify if maxProd is less than var prod
        for (int index = 1; index < len - 1; index++) { // The loop init in 1 because previously we declared and initiate 0 with maxProd
            int prod = myArr[index] * myArr[index + 1];
            if (prod > maxProd) { // If prod is greater than max prod
                maxProd = prod; // We update the value of maxProd
            }
        }
        // Printing the result
        System.out.println(maxProd);
        // Closing scanner
        scanner.close();
    }
}