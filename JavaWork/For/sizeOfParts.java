/*
 * Imagine that your company has a detector that evaluates the readiness of parts:
 * If the part it needs to be fixed, the detector prints the number 1.
 *If the part needs to be removed as a reject, the detector prints the number -1.
 *If the part is perfect and is ready to be sent, the detector prints 0.
 */

import java.util.Scanner;

public class sizeOfParts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enterNum = scanner.nextInt();
        int isFixed = 0, isReject = 0, isReady = 0;
        int i = 0;

        for (i = 0; i < enterNum; i++) {
            int numDetector = scanner.nextInt();
          
            if (numDetector == -1) {
                isReject++;
            }
            if (numDetector == 0) {
                isReady++;
            }
            if (numDetector == 1) {
                isFixed++;
            }
        }
        System.out.printf("%d %d %d", isReady, isFixed, isReject);
        scanner.close();
    }
}
