import java.util.Scanner;

public class FizzBuzzLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt(), num2 = scanner.nextInt();
        
        for (int i = num1; i <= num2; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if ((i % 3 == 00)) {
                System.out.println("Fizz");
            } else if ((i % 5 == 00)) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            } 
        }
        scanner.close();
    }
}
