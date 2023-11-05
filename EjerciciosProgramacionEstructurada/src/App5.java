import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = numeros.nextInt();

        // Convertir el número en positivo si es negativo
        int numeroAbsoluto = Math.abs(numero);

        System.out.print("Digitos individuales: ");
        int sumaDigitos = 0;

        // Proceso para separar los dígitos e imprimirlos
        while (numeroAbsoluto > 0) {
            int digito = numeroAbsoluto % 10;
            sumaDigitos += digito;
            System.out.print(digito + " ");
            numeroAbsoluto /= 10;
        }

        System.out.println("\nLa suma de los dígitos es: " + sumaDigitos);
    }
}
