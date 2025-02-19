import java.util.Scanner;

public class sumOfArray {
    public static void main(String[] args) {
        // create scanner instance to read input
        Scanner scanner = new Scanner(System.in);
        // read the number of elements
        int n = scanner.nextInt();
        // create your array here
        int[] myArray = new int[n];
        // use a loop to read the array elements
        for (int index = 0; index < n; index++) {
            myArray[index] = scanner.nextInt();
        }
        // use a loop to calculate the sum of elements that are multiples of 3
        int sum = 0;
        for (int index = 0; index < n; index++) {
            if (myArray[index] % 3 == 0) {
                sum += myArray[index];
            }  
        }
        //Printing the result of var sum
        System.out.println(sum);
        // close the scanner
        scanner.close();
    }
}
