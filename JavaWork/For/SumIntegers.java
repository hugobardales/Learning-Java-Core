/**
 * Print the sum of all integers from a to b including both.
 * It is guaranteed that a < b in all test cases.
 */

import java.util.Scanner;

public class SumIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(), b = scanner.nextInt();
        int sumInt = a; 
        
        for (int i = a; i <= b; i++) {
            sumInt += i;
        }
        System.out.println(sumInt - a);
        scanner.close();
    }
}
