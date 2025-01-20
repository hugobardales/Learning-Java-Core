import java.util.Scanner;

public class SquaringUpPerfectNUmber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        for (int i = num + 1; ;i++) {
            int sqrtPerfect = (int) Math.sqrt(i);
            if (sqrtPerfect * sqrtPerfect == i) {
                System.out.println(i);
                break;
            } 
        }
        scanner.close();
    }
}
