import java.util.Scanner;

public class countCharacter {

    public static void countCharacter(String inputString) {

        System.out.print(inputString.length());
        return; 
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        countCharacter(inputString);

        scanner.close();
    }


}