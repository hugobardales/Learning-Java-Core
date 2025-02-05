import java.util.Scanner;

public class floorSpaceOfTheRoom {
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double r;

        Scanner scanner = new Scanner(System.in);
        String shapeRoom = scanner.nextLine();
        

        switch (shapeRoom) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                double s = (a + b + c) / 2;
                double areaTriangle = Math.sqrt(s * (s - a) * (s - b) * (s - c));

                System.out.println(areaTriangle);
                break;
            
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                double areaRectangle = a * b;

                System.out.println(areaRectangle);
                break;
            
            case "circle":
                r = scanner.nextDouble();
                double pi = 3.14;
                double areaCircle = pi * (r * r);

                System.out.println(areaCircle);
                break;
        }
    
        scanner.close();
    }
}
