
public class EvenOrOdd {
    public static void main(String[] args) {

        String result = EvenOrOdd(5);
        System.out.println(result);

        }

        static String EvenOrOdd(int num) {
            if (num % 2 == 0) {
                return "Even";
            } else {
                return "Odd";
            }
    }
}
