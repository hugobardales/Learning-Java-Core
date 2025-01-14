package whileDO;
import java.util.Scanner;

public class findSmallestMod {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

       if (n < 0) {
        System.out.println(-1);
        scanner.close();
        return;
       }
        
       int count = n;

       if (n % 3 == 0) {
        count  = n; // Si ya es múltiplo de 3, no hay que hacer nada
        } else {
        count = n + (3 - (n % 3)); // Calculamos el siguiente múltiplo de 3
        }
        
        System.out.println(count);
        scanner.close();

    }
}
