import java.util.Scanner;

public class floorSpaceWithMethod {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var shapeType = scanner.next();

        switch (shapeType) {
            case "triangle": {
                var a = scanner.nextDouble();
                var b = scanner.nextDouble();
                var c = scanner.nextDouble();
                print(calculateTriangleArea(a, b, c));
                break;
            }
            case "circle": {
                var r = scanner.nextDouble();
                print(calculateCircleArea(r)); 
                break;
            }
            case "rectangle": {
                var a = scanner.nextDouble();
                var b = scanner.nextDouble();
                print(calculateRectangleArea(a, b));
                break;
            }
            default:
                System.out.println("Unknown shape type " + shapeType);
        }
        scanner.close();
    }

    /**
     * Calculate area of triangle using Heron's formula.
     *
     * @param a side a
     * @param b side b
     * @param c side c
     *
     * @return area
     */
    public static double calculateTriangleArea(double a, double b, double c) {
        var p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    /**
     * Calculate circle area.
     *
     * @param r radius
     *
     * @return area
     */
    public static double calculateCircleArea(double r) {
        return 3.14 * Math.pow(r, 2);
    }

    /**
     * Calculate rectangle area.
     *
     * @param a side a
     * @param b side b
     *
     * @return area
     */
    public static double calculateRectangleArea(double a, double b) {
        return a * b;
    }

    /**
     * Print to the stdout.
     *
     * @param area the area number
     */
    public static void print(double area) {
        System.out.println(area);
    }
}

