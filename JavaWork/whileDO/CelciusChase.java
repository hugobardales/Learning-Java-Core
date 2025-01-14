package whileDO;
import java.util.Scanner;

public class CelciusChase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int countCelcius = 0;

        while (num < 100) {
            num = scanner.nextInt();
    
            if (num == 100) {
                break;
            }
            if (num > countCelcius) {
                countCelcius = num;
            }
        }  
        System.out.println(countCelcius);
        scanner.close();
    }
}
