/**
 * Determining even or odd numbers in an array and print a message that states 'The number [number] is [odd/even].
 */

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter the size of array
        int lenArray = scanner.nextInt();

        // Creates an array numbers of kind int incoprporing the length provided by lenArray
        int[] numsArray = new int[lenArray];
        
        // Reading the elements of an provided array from the scanner
        for (int index = 0; index < numsArray.length; index++) {
            numsArray[index] = scanner.nextInt();
        }

        // Init through the array and determining if a element is even or odd next printing. 
        for (int index = 0; index < numsArray.length; index++) {
            if (numsArray[index] % 2 == 0) {
                System.out.println("The number " + numsArray[index] + " is even");
            } else {
                System.out.println("The number " + numsArray[index] + " is odd");
            }
        }
        
        // Closing scanner
        scanner.close();
    }
}
