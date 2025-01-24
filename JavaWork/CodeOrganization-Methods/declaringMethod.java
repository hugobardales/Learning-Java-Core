import java.util.Scanner;
public class declaringMethod {
    Scanner scanner = new Scanner(System.in);

    public static double divide (long a, long b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long a = scanner.nextInt(); 
        final long b = scanner.nextInt();
        System.out.println(divide(a,b));
        scanner.close();
    }
}
