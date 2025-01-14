package whileDO;

public class oddsInRangeFor {
    public static void main(String[] args) {
        
        for (int num = 2; num <= 500; num++) {
            // Paso 2: Verificar si el número 'num' es primo
            if (esPrimo(num)) { // Llamamos a la función esPrimo para verificar
                System.out.print(num + " "); // Paso 3: Imprimimos el número en la misma línea
            }
        }
    }

    // Función que determina si un número es primo
    public static boolean esPrimo(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) { // Probamos posibles divisores hasta la raíz cuadrada
            if (n % i == 0) { // Si 'n' es divisible por 'i', no es primo
                return false; // No es primo
            }
        }
        return true; // Es primo si no encontramos ningún divisor
    }
}
