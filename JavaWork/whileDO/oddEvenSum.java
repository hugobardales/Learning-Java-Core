package whileDO;

public class oddEvenSum {
    public static void main(String[] args) {
        
        int oddSum = 0;
        int evenSum = 0;
        int i = 0;

        while (i / 2 != 500) {
            i++;

            if (i % 2 == 0 ) {
                evenSum += i; // evenSum = evenSum + i
            }
            
            if ( i % 2 != 0) {
                oddSum += i;
            }

        } 
        
        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("Sum of even numbers: " + evenSum);
    }

}
