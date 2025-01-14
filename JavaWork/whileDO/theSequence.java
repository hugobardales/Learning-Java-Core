package whileDO;
import java.util.Scanner;

public class theSequence {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        // Variable que contiene el número que tenga el m+inimo valor divisible por 4 para
        // lo almacene y siga contiendo un posible mayor en las siguientes entradas de num
        int maxBy4 = Integer.MIN_VALUE;

        // Creamos una variable que cuente las iteraciones procesadas
        int count = 0;

        //Iniciamos un bucle que procese la secuencia de las nuevas entradas
        while (count < num) {
            int numMore = scanner.nextInt(); // Ingresamos el nuevo número

            //Verificamos si el número es divisible entre 4
            if (numMore % 4 == 0) {
                //Se actualiza al nuevo divisible entre 4, siempre que sea mayor al anterior
                if (numMore > maxBy4) {
                    maxBy4 = numMore;
                }
            }
            count++;
        }

        //Luego cuando se cumple la condición While imprimira el mayor divisible entre 4
        System.out.println(maxBy4);
        scanner.close();

    }
}
