import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar información al usuario
        System.out.print("Ingrese el número de cuenta: ");
        int numeroCuenta = scanner.nextInt();

        System.out.print("Ingrese el código de servicio (R para Regular, P para Premium): ");
        char codigoServicio = scanner.next().charAt(0);

        System.out.print("Ingrese la cantidad de minutos utilizados: ");
        int minutos = scanner.nextInt();

        double costoTotal = 0.0;

        // Calcular el costo según el tipo de servicio
        if (codigoServicio == 'R' || codigoServicio == 'r') {
            // Servicio regular
            if (minutos <= 50) {
                costoTotal = 10.0; // Tarifa fija de $10
            } else {
                costoTotal = 10.0 + (minutos - 50) * 0.20;
            }
        } else if (codigoServicio == 'P' || codigoServicio == 'p') {
            // Servicio Premium
            System.out.print("Ingrese la cantidad de minutos durante el día: ");
            int minutosDia = scanner.nextInt();

            System.out.print("Ingrese la cantidad de minutos durante la noche: ");
            int minutosNoche = scanner.nextInt();

            if (minutosDia <= 75) {
                costoTotal += minutosDia * 0; // Los primeros 75 minutos son gratis durante el día
            } else {
                costoTotal += (minutosDia - 75) * 0.10;
            }

            if (minutosNoche <= 100) {
                costoTotal += minutosNoche * 0; // Los primeros 100 minutos son gratis durante la noche
            } else {
                costoTotal += (minutosNoche - 100) * 0.05;
            }

            costoTotal += 25.0; // Tarifa fija de $25 para el servicio Premium
        } else {
            System.out.println("Código de servicio no válido.");
            return;
        }

        // Mostrar la factura
        System.out.println("\nNúmero de cuenta: " + numeroCuenta);
        System.out.println("Tipo de servicio: " + (codigoServicio == 'R' || codigoServicio == 'r' ? "Regular" : "Premium"));
        System.out.println("Minutos utilizados: " + minutos);
        System.out.println("Cantidad a pagar: $" + costoTotal);

        scanner.close();
    }
}
