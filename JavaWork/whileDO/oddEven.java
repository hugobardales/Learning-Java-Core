package whileDO;
import java.util.Scanner;

public class oddEven {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxCount = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        int count = 1;
      
        while (count <= maxCount) {
            if(count % 2 == 00) {
                result.append("even");
            } else {
                result.append("odd");
            } 
            if (count < maxCount){
                result.append(", ");
            }
            count++;  
        }
        System.out.println(result);
        scanner.close();
    }

}
