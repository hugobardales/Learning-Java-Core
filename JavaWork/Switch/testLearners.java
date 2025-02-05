import java.util.Scanner;

public class testLearners {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Java");
        System.out.println("2. Kotlin");
        System.out.println("3. Scala");
        System.out.println("4. Python");
    
        int numChoise = scanner.nextInt();

        switch (numChoise) {
            case 1:
                System.out.println("Yes!");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number");
                break;
        }
        scanner.close();
    }
    
}
