//**
* A program that reads an array of ints and finds the index of the first maximun in that array.
* The first line contain the number of element separated by spaces.
* The second line contains the array elements separated by spaces.
* An array always has at least one element.
*/

import java.util.Scanner;

public class MaxFirstIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	// The length of array
        int len = scanner.nextInt();

	// Creates an array with the size of len variable
        int[] myArr = new int[len];

	// Reading the elements of the array from the scanner
        for (int index = 0; index < myArr.length; index++) {
            myArr[index] = scanner.nextInt();
        }

	// Creates variable firstMaxIndex that contains the index of the array
        int firstMaxIndex = 0;

	// Creates the variable maxValue that contains the first element of arrays named myArr
        int maxValue = myArr[0];

	// Init throught the array finds the index of the first maximum in that array.
        for (int index = 1; index < myArr.length; index++){
            if(myArr[index] > maxValue){
                maxValue = myArr[index];
                firstMaxIndex = index; 
            }
        }

	// Printing the result
        System.out.println(firstMaxIndex);

	// Closing scanner
        scanner.close();

    }
}
