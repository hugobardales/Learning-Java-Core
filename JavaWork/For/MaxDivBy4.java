import java.util.Scanner;

public class MaxDivBy4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numEnter = scanner.nextInt();
        int divBy4 = Integer.MIN_VALUE;
        int i = 0;

        for (i = 0; i < numEnter; i++) {
            int nums = scanner.nextInt();

            if (nums % 4 == 0) {
                if (nums > divBy4) {
                    divBy4 = nums;
                } 
            }
        }
        System.out.println(divBy4);
        scanner.close();
    }
}
