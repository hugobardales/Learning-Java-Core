/**
 * A program that reads an array of integers and finds the minimum value of the array.
 * The first line contains the size of an array.
 * The second line contains elements of the array separated by spaces.
 * The output: an integer number representing the minimum in the input array.
 */

import java.util.Scanner;

public class MinValueOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // The length of array
        int len = scanner.nextInt();

        // Creates a array with length with the ar len
        int [] numArray = new int[len];

        //Reading the elements of array from the scanner
        for (int index = 0; index < numArray.length; index++) {
            numArray[index] = scanner.nextInt();
        }

        //Init throught the array with the first element
        int minValue = numArray[0];
        for (int index = 1; index < len; index++) {
            if (numArray[index] < minValue) {
                minValue = numArray[index];
            }
        }

        //Printing the min value of array
        System.out.println(minValue);

        scanner.close();
    }
}