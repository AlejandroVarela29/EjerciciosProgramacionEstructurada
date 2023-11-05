import java.util.Scanner;

public class App24 {
    public static void main(String[] args) {
        Scanner letra = new Scanner(System.in);

        System.out.print("Ingresa tres palabras: ");
        String input = letra.nextLine();

        // Dividir la entrada en palabras individuales
        String[] palabras = input.split(" ");

        // Inicializar una cadena para el acrónimo
        StringBuilder acronimo = new StringBuilder();

        // Recorrer las palabras y construir el acrónimo
        for (String palabra : palabras) {
            // Ignorar palabras adicionales si hay más de tres
            if (acronimo.length() >= 3) {
                break;
            }

            // Agregar la primera letra de cada palabra al acrónimo en mayúsculas
            if (!palabra.isEmpty()) {
                acronimo.append(Character.toUpperCase(palabra.charAt(0)));
            }
        }

        // Imprimir el acrónimo
        System.out.println("El acrónimo es: " + acronimo.toString());

        letra.close();
    }
}
