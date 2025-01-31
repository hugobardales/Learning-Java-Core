import java.util.Scanner;

public class numIntoWords {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int numInWords = scanner.nextInt(); 

        switch (numInWords) {
            case 1: 
                System.out.println("one");
                break;
            case 2:
                System.out.println("dos");
                break;
            default:
                System.out.println("invalid num");
        }

        scanner.close(); 
    }
}
