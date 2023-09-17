import java.util.Scanner;

public class App9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos enteros (el primero debe ser menor que el segundo)
        System.out.print("Ingrese el primer número (menor): ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número (mayor): ");
        int numero2 = scanner.nextInt();

        // Validar que el primer número sea menor que el segundo
        if (numero1 >= numero2) {
            System.out.println("El primer número debe ser menor que el segundo. Por favor, ingrese los números nuevamente.");
            return;
        }

        // Variables para almacenar la suma de números pares e impares
        int sumaPares = 0;
        int sumaImparesCuadrados = 0;

        System.out.println("Números impares, cuadrados y suma de pares entre " + numero1 + " y " + numero2 + ":");

        // Mostrar números impares, números pares y sus cuadrados
        int i = numero1;
        while (i <= numero2) {
            if (i % 2 != 0) {
                System.out.println("Impar: " + i);
                sumaImparesCuadrados += i * i;
            } else {
                sumaPares += i;
            }
            System.out.println("Cuadrado de " + i + ": " + (i * i));
            i++;
        }

        // Mostrar la suma de números pares
        System.out.println("Suma de números pares entre " + numero1 + " y " + numero2 + ": " + sumaPares);

        // Mostrar la suma de los cuadrados de números impares
        System.out.println("Suma de cuadrados de números impares entre " + numero1 + " y " + numero2 + ": " + sumaImparesCuadrados);

        // Mostrar números perfectos entre los dos números
        System.out.println("Números perfectos entre " + numero1 + " y " + numero2 + ":");
        for (int j = numero1; j <= numero2; j++) {
            if (esNumeroPerfecto(j)) {
                System.out.print(j + " ");
            }
        }
        System.out.println();

        // Mostrar números primos entre los dos números
        System.out.println("Números primos entre " + numero1 + " y " + numero2 + ":");
        for (int k = numero1; k <= numero2; k++) {
            if (esNumeroPrimo(k)) {
                System.out.print(k + " ");
            }
        }
    }

    // Función para verificar si un número es perfecto
    public static boolean esNumeroPerfecto(int numero) {
        int sumaDivisores = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        return sumaDivisores == numero;
    }

    // Función para verificar si un número es primo
    public static boolean esNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
