import java.util.Scanner;

public class evenNumWithCondition {

    public static void isEvenWithCondition(int n) {

        for (int i = 2; i <= n; i += 2) {
            if (i >= 10 && i <= 15) {
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println();

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        isEvenWithCondition(n);
        scanner.close();
        
    } 
}
