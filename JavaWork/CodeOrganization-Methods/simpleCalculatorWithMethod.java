/*
 * Create a simple calculator using functional descomposition, that subtracts, sums, divides, and multiplies the two numbers 
 * inside the switch statement. 
 */
import java.util.Scanner;
public class simpleCalculatorWithMethod {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        String operator = scanner.next();
        long num2 = scanner.nextLong();
        
        // From the input operator such logaritmic function
        switch (operator) {
            case "^":
                simpleCalculatorWithMethod.power(num1, num2);
                break;
            case "+":
                simpleCalculatorWithMethod.sumTwoNUmbers(num1,num2);
                break;
            case "-":
                simpleCalculatorWithMethod.subtractTwoNumbers(num1, num2);
                break;
            case "/":
                simpleCalculatorWithMethod.divideTwoNumbers(num1, num2);
                break;
            case "*":
                simpleCalculatorWithMethod.multiplyTwoNumbers(num1, num2);
                break;
            default:
                break;

        }  
        scanner.close();
    }

    /* This method subtract two numbers from the user input
     * @Params num1, num2
     * data type long
     */
    public static void subtractTwoNumbers(long num1, long num2) {
        long substract = num1 - num2;
        System.out.println(substract);
    }

    /* This method sum two numbers from the user input
     * @Params num1, num2
     * data type long
     */
    public static void sumTwoNUmbers(long num1, long num2) {
        long sum = num1 + num2;
        System.out.println(sum);
    }

    /* This method divide two numbers from the user input
     * @Params num1, num2
     * data type long
     */
    public static void divideTwoNumbers(long num1, long num2) {
        
        if (num2 == 0) {
            System.out.println("Division by 0!");
        } else {
            long div = num1 / num2;
            System.out.println(div);
        }      
    }

    /* This method multiply two numbers from the user input
     * @Params num1, num2
     * data type long
     */
    public static void multiplyTwoNumbers(long num1, long num2) {
        long multiply = num1 * num2;
        System.out.println(multiply);
    }

    /* This method power of two numbers from the user input
     * @Params num1, num2 change to n , p (respectively)
     * data type long
     */
    public static void power(long n, long p) {
        long number = n;
        long power = p;
        long result = 1;
        while (power > 0) {
            if (power % 2 != 0) {
                result *= number;
            }
            power /= 2;
            number *= number;
        }
        System.out.println(result);

    }
}