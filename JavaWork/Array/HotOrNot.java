/**
 * A program that analyzes temperature readings stored in an array. The program should accept an integer 'n' for the number 
 * of readings, then read 'n' float values as temperatures. Calculate and print the average temperature, the highest temperature, 
 * and the count of readings above 30.0°C. Format float outputs to one decimal place.
 */

import java.util.Scanner;

public class HotOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Declare and initialize the array
        float[] tempInput = new float[n];

        //Var to calculate requeriments
        float sum = 0;
        float numHighest = Float.MIN_VALUE;
        int countAboveOf30 = 0;

        // Read temperature values
        for (int index = 0; index < tempInput.length; index++) {
            tempInput[index]= scanner.nextFloat();
            sum += tempInput[index];

            if (tempInput[index] > numHighest) {
                numHighest = tempInput[index];
            }

            if (tempInput[index] > 30.0) {
                countAboveOf30++;
            }
        }

        //Calculate the average
        float average = sum/n;

        //Priting the results with format
        System.out.printf("Average: %.1f\n", average);
        System.out.printf("Highest: %.1f\n", numHighest);
        System.out.printf("Above 30.0°C: %d\n", countAboveOf30);

        scanner.close();
       
    }
    
}
