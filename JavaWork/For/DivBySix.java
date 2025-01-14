/*
 *Find the sum of numbers divisible by 6 in the given sequence of natural numbers.
 *The first line of the input is the number of elements in the sequence; the next lines are the elements themselves.
 *It is guaranteed that there is always a number divisible by 6 in the sequence.
 */

import java.util.Scanner;

public class DivBySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enterNum = scanner.nextInt();
        int sumDivBySix = 0;
        int i = 0;

        for (i = 0; i < enterNum; i++) {
            int num = scanner.nextInt();

            if (num % 6 == 0) {
                sumDivBySix += num;
            }
        }
        System.out.println(sumDivBySix);
        scanner.close();
    }
}
