package whileDO;
import java.util.Scanner;

public class sumOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumElements = 0;

        while (true) {
            int num = scanner.nextInt();
            sumElements += num;

            if (num == 0) {
                break;
            }
        }
            System.out.println(sumElements);
            scanner.close();
    }
}

