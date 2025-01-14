package whileDO;
import java.util.Scanner;

public class maxSecuence {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;

        while (true) {

            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }
            
            if (num > max) {
                max = num;
            }
        }

        System.out.println(max);
        scanner.close();    
    }
}