import java.util.Scanner;
public class signOfAnumber {

    public static int sign(int number) {

        if (number > 0) {
            return 1;
        } else if (number == 0) {
            return 0;
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
        scanner.close();
    }
    
}
