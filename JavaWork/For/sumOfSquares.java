import java.util.Scanner;

public class sumOfSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        int sumSquares = 0;

        for (int i = a; i < b; i++) {
           
            if (a < b) {
                sumSquares += (i * i);

            }
        }
        System.out.println(sumSquares);
        scanner.close();
    }
}