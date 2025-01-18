import java.util.Scanner;

public class IterationWithBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i <= num; i++) {
            if (i % 5 == 0) {
                continue;
            } 
            
            if (i % 7 == 0) {
                System.out.println(i + ": stopped");
                break;
            }
            System.out.println(i);
        }
        scanner.close();
    }
}
