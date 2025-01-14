import java.util.Scanner;

public class arithmeticAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numA = scanner.nextInt(), numB = scanner.nextInt();
        int sum = 0;
        int count = 0;
        
        for (int i = numA; i <= numB; i++ ) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println(average);
            
        }
        scanner.close();
    }
}
