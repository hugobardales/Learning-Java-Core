import java.util.Scanner;

public class FizzBuzzWithTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNum = scanner.nextInt(), endNum = scanner.nextInt();

        for (int i = startNum; i <= endNum; i++) {

            System.out.println((i % 3 == 0 && i % 5 == 0) ? "FizzBuzz" :
                               (i % 3 == 0) ? "Fizz" :
                               (i % 5 == 0) ? "Buzz" : i);
        }
        scanner.close();
    }
}
