import java.util.Scanner;

public class ignoreCase {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = scanner.nextLine();
        String cond1 = frase.substring(0,1);
        boolean cond2 = cond1.equalsIgnoreCase("j");

        System.out.println(cond2);

        scanner.close();
        
    }
}
