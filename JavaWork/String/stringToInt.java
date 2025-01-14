import java.util.Scanner;

public class stringToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        //Convert num to String
        String stringNum = String.valueOf(num);
        String reverseStringNum = new StringBuilder(stringNum).reverse().toString();

        //Volviendo a convertir reverseStringNum de String a Int
        int reverseIntNum = Integer.parseInt(reverseStringNum);

        System.out.println(reverseIntNum);
        scanner.close();

    }

}
