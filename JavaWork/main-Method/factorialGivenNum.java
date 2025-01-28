import java.util.Scanner;

public class factorialGivenNum {

    public static int isFactorial(int n) {

        int multFact = 1;

        for (int numFact = 1; numFact <= n; numFact++) {
            multFact *= numFact;
        }
        return multFact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.print(isFactorial(n));
        scanner.close();
    }
    
}
