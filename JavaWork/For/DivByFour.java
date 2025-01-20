import java.util.Scanner;
public class DivByFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int number = 0;

        while (true) {
            number++;
            if (number > limit) {
                break;
            }

            if (number % 4 != 0) {
                continue;
            }
            System.out.print(number + " ");
        }
        scanner.close();
    }
}
