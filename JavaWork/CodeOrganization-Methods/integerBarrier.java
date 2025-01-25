import java.util.Scanner;
public class integerBarrier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;

        while (true) {
            int number = scanner.nextInt();
            sum += number;

            // Stop processing when the number is 0
            if (number == 0) {
                break;
            }

            // If the sum reaches or exceeds 1000, stop the loop
            if (sum >= 1000) {
                sum -= 1000; // Output the value equal to the sum minus 1000
                break;
            }
        }

        // Output the final result
        System.out.println(sum);
    }
}