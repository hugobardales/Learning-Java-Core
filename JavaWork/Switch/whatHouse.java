import java.util.Scanner;

public class whatHouse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        String inputHouse = scanner.nextLine();

        String houseValue = switch (inputHouse) {
            
            case "gryffindor" -> "bravery";
            case "hufflepuff" -> "loyality";
            case "slytherin" -> "cunning";
            case "ravenclaw" -> "intellect";
            default -> "not a valid house";
        };

        System.out.println(houseValue);

        scanner.close();
    }
}
