import java.util.Scanner;

public class CalculatingFactorial {

    public static long factorial(long n) {
        
        long multfac = 1;
        for (long numFactorial = 1; numFactorial <= n; numFactorial++) {
            
                multfac *= numFactorial; // mf = 1 * 1
                                        // mf = 1 * 2
                                        // mf = 2 * 3
                                        // mf = 6 * 4
                                        // mf = 24 * 5
        }
        return multfac;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
        scanner.close();
        
    }
}
