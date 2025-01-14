package whileDO;

public class oddsInRange {
    public static void main(String[] args) {
        int num = 1; // Begin to 1

        while (num <= 500) { // Recorremos los números del 1 al 500
            int divisorCount = 0; // Contador de divisores
            int i = 1; // Comenzamos a probar divisores desde 1

            while (i <= num) { // Revisamos todos los posibles divisores de 'num'
                if (num % i == 0) { // Si 'i' divide exactamente a 'num'
                    divisorCount++; // Incrementamos el contador de divisores
                }
                i++; // Pasamos al siguiente divisor
            }

            // Si el número tiene exactamente 2 divisores, es primo
            if (divisorCount == 2) {
                System.out.print(num + " "); // Imprimimos el número en la misma línea
            }

            num++; // Pasamos al siguiente número
        }
    }
}


