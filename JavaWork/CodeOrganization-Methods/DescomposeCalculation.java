/* 
 * 
 */

import java.util.*;

public class DescomposeCalculation {

    public static void processInputAndCallFunctions() {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        scanner.close();

        String[] strArr = inputString.split(" ");
        int[] intArr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }


        if (intArr.length == 2) {
    
            int result = calculate(intArr[0], intArr[1]);
            System.out.println(result);
            
        } else if (intArr.length == 3) {
            
            int result = calculate(intArr[0], intArr[1], intArr[2]);
            System.out.println(result);
            
        }

    }

    public static int calculate(int a, int b) {
        return a * b;
    }

    public static int calculate(int a, int b, int c) {
        return (a + b) * c;
    }

    public static void main (String[] args) {
        processInputAndCallFunctions();
    }

}