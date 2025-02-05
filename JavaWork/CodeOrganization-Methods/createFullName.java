import java.util.Scanner;
public class createFullName {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String inputFirstName = scanner.next();
        String inputLastName = scanner.next();

        System.out.println(createFullName(inputFirstName, inputLastName));
        
        scanner.close();

    }

    public static String createFullName(String inputFirstName, String inputLastName) {

        return inputFirstName + " " + inputLastName;

    }
    
}
