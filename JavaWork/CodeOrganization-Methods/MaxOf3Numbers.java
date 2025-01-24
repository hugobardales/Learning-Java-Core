import java.util.Scanner;
public class MaxOf3Numbers {
    
    public static int getNumberOfMaxParam(int a, int b, int c) {

        int maxPosition = 1;

        if (b > a && b >= c) {
            maxPosition = 2; // b es el máximo
        } else if (c > a && c > b) {
            maxPosition = 3; // c es el máximo
        }

        return maxPosition;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
        scanner.close();
    }
}
