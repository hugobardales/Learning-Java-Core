import java.util.Scanner;

public class extractSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String myWord = scanner.nextLine();
        int num = scanner.nextInt(), num2 = scanner.nextInt();
        
        System.out.println(myWord.substring(num, num2 + 1));
        scanner.close();
    }
}
