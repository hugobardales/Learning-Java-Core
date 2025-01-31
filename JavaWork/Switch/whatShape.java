import java.util.Scanner;

public class whatShape {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 

        // Create a variable that contains the scanner object as input
        int inputShape = scanner.nextInt();

        // Create a variable that contains the control flow switch expression
        String shapeValue = switch (inputShape) {

            case 1 -> "square";
            case 2 -> "circle";
            case 3 -> "triangle";
            case 4 -> "rhombus";
            default -> "There is no such shape!";
        }; // never forget close with braces


        //Implement more conditionals to avoid errors when printing   
        if (inputShape >= 1 && inputShape <= 4 ) {
            System.out.println("You have chosen a " + shapeValue);
        } else {
            System.out.println(shapeValue);
        }

        //Close scanner
        scanner.close();
    }
}
