/**
 * A program that reads an array of int and checks if the array is sorted ascending
 * from smallest to largest number.
 */

import java.util.Scanner;

class SortingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // The length of array
        int len = scanner.nextInt();
        // Creates an array with length with the ar len
        int[] myArr = new int[len];
        // Reading the elements of array from the scanner
        for (int index = 0; index < myArr.length; index++) {
            myArr[index] = scanner.nextInt();
        }
        // Creates a boolean var that contains true value
        boolean isAsc = true;
        // Though el array for verify if the actual index is minor o equal that the next index
        for (int index = 0; index < myArr.length - 1; index++){
            if (myArr[index] > myArr[index + 1]) {
                isAsc = false;
                break;
            }
        }
        // if the before condition does not meet the req, print "true"
        System.out.println(isAsc);
        // Closing scanner
        scanner.close();
    }
}