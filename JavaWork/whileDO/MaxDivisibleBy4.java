package whileDO;

import java.util.Scanner;

public class MaxDivisibleBy4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número total de elementos en la secuencia
        int n = scanner.nextInt();

        // Inicializar la variable para almacenar el máximo divisible entre 4
        int maxDivisibleBy4 = Integer.MIN_VALUE;

        // Contador para llevar el seguimiento de los números procesados
        int count = 0;

        // Usar un bucle while para procesar los números de la secuencia
        while (count < n) {
            int num = scanner.nextInt(); // Leer el siguiente número

            // Verificar si el número es divisible entre 4
            if (num % 4 == 0) {
                // Actualizar el máximo si el número actual es mayor
                if (num > maxDivisibleBy4) {
                    maxDivisibleBy4 = num;
                }
            }

            // Incrementar el contador
            count++;
        }

        // Imprimir el resultado
        System.out.println(maxDivisibleBy4);

        scanner.close();
    }
}
