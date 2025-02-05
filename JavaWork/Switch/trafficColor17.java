import java.util.Scanner;

public class trafficColor17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read the num input from user 
        int enterNum = scanner.nextInt();

        // Choise num correspond a color
        switch (enterNum) {
            case 1 -> System.out.println("Green");
            case 2 -> System.out.println("Yellow");
            case 3 -> System.out.println("Red");
            default -> System.out.println("Invalid");
        }
        //closing scanner
        scanner.close();
    }
}
