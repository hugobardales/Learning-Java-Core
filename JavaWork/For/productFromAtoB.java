import java.util.Scanner;

public class productFromAtoB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        int numProduct = 1;

        for (int i = a; i < b; i++) {
           
            if (a < b) {
                numProduct *= i;
            }
        }

        System.out.println(numProduct);
        scanner.close();

    }

}