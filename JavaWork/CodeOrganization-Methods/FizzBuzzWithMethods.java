import java.util.Scanner;
public class FizzBuzzWithMethods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        System.out.println(isDivByThreeAndFive(num) ? "FizzBuzz"
                           : isDivByFive(num) ? "Buzz"
                           : isDivByThree(num) ? "Fizz"
         
                        
        :"None");
    
        scanner.close();
        
    }

    public static boolean isDivByThreeAndFive(int num) {
        return isDivByThree(num) && isDivByFive(num);

    }

    public static boolean isDivByThree(int num) {
        return num % 3 == 0;
    }

    public static boolean isDivByFive(int num) {
        return num % 5 == 0;
    }
}
