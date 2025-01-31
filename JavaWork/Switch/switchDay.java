import java.util.Scanner;

public class switchDay {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Creating a variable what store a day input 
        int inputNumDay = scanner.nextInt();

        // Creating a switch control flow, where read a num from scanner and output a day of week.
        switch (inputNumDay) {
            case 1:
                System.out.println("Monday");
                break;
            
            case 2:
                System.out.println("Thuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;
            
            case 4:
                System.out.println("Thursday");
                break;
            
            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;
            
            case 7:
                System.out.println("Sunday");
                break;
            
            default:
                System.out.println("Out of parameters");
        }
        scanner.close();
    }
}
