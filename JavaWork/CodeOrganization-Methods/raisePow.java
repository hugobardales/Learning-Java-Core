import java.util.Scanner;

public class raisePow {

    public static long power(int n, int m) {

        double resultPower = Math.pow(n, m);
        return (long) resultPower;

    }
    
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();

        System.out.println(power(n, m));
        scanner.close();
    }
}
