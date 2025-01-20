import java.util.Scanner;

public class WhileInputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        while (true) {
            System.out.println("Enter a positive number please: ");
            num = scanner.nextInt();

            if (num <= 0) {
                System.out.println("Invalid Input. PLease enter a positive number again");
                continue;
            }

            System.out.println(num * num);
            break;
        }
        scanner.close();
    }
}
