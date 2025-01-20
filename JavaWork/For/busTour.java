import java.util.Scanner;
public class busTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heightOfBus = scanner.nextInt(), numOfBridges = scanner.nextInt();
        int countBridges = 0;
        boolean isCrashBus = false;

        for (int i = 1; i <= numOfBridges; i++) {
            int heightOfBridge = scanner.nextInt();
            if (heightOfBus >= heightOfBridge) {
                isCrashBus = true;
                countBridges = i;
                break;
            }
        }

        if (isCrashBus) {
            System.out.println("Will crash on bridge " + countBridges);
        } else {
            System.out.println("Will not crash");
        }
        scanner.close();
    }  
}
