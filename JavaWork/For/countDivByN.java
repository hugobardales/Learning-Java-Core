import java.util.Scanner;

public class countDivByN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), n = scanner.nextInt();
        int count = 0;

        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                count++;
            }
        }

        System.out.print(count);
        scanner.close();
        
    }
}