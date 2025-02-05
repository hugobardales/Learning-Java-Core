import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String enterOperation = scanner.nextLine(); 

        // Generating method of div in 3 parts, input form user, content in enterOperation.
        String[] partsOfOperation = enterOperation.split(" "); 

        // Break down in 3 parts and choice operator, evaluated in switch
        long num1 = Long.parseLong(partsOfOperation[0]);
        String operator = partsOfOperation[1];
        long num2 = Long.parseLong(partsOfOperation[2]);

        switch (operator) {
            case "+":
                System.out.println(addition(num1, num2));
                break;
            case "-":
                System.out.println(subtract(num1, num2));
                break;
            case "*":
                System.out.println(multiplication(num1, num2));
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(division(num1, num2));
                }
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
        scanner.close();
    }

    /*
     * calculate sum
     * @param num1, num 2
     * return operation sum
     */
    
    public static long addition(long num1, long num2) {
        return num1 + num2;
    }

    /*
     * calculate subtraction
     * @param num1, num 2
     * return operation subtract
     */

    public static long subtract(long num1, long num2) {
        return num1 - num2;
    }

    /*
     * calculate multiplication
     * @param num1, num 2
     * return operation of multiplication
     */

    public static long multiplication(long num1, long num2) {
        return num1 * num2;
    }

    /*
     * calculate division
     * @param num1, num 2
     * return operation division
     */

    public static long division(long num1, long num2) {
        return num1 / num2;
    }
} 

