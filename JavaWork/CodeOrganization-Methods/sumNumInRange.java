import java.util.Scanner;
public class sumNumInRange {

    public static long sumInRange(int from, int to) {

        long sum = 0;

        while (from < to) {
            sum += from;
            from++;
        }
        return sum;

    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int from = scanner.nextInt();
        int to = scanner.nextInt();

        System.out.println(sumInRange(from, to));
    }
}
