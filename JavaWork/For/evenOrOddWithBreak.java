import java.util.Scanner;

public class evenOrOddWithBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            int nums = scanner.nextInt();
            
            if (nums == 0) {
                break;
            }

            if (nums % 2 ==0) {
                System.out.println("even");
                
            } else {
                System.out.println("odd");
            }
        }
        scanner.close();
    }
}
