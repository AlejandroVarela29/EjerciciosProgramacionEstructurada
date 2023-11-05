import java.util.Scanner;
public class App7 {
    public static void main(String[] args) {

          int numeroCuenta, minutos;
          char codigoServicio;
          double costoTotal = 0.0;

          Scanner factura = new Scanner(System.in);

          System.out.print("Cual es el numero de cuenta  ");
          numeroCuenta = factura.nextInt();

          System.out.print("Ingrese el código de servicio (R para Regular, P para Premium): ");
          codigoServicio = factura.next().charAt(0);

          System.out.print("Ingrese la cantidad de minutos utilizados: ");
          minutos = factura.nextInt();

        
        if (codigoServicio == 'R' || codigoServicio == 'r') {
        
            if (minutos <= 50) {

                costoTotal = 10.0; 
            } else {
                costoTotal = 10.0 + (minutos - 50) * 0.20;
            }
        } else if (codigoServicio == 'P' || codigoServicio == 'p') {

            System.out.print("cual es la cantidad de minutos durante el día: ");
            int minutosDia = factura.nextInt();

            System.out.print("cual es la cantidad de minutos durante la noche: ");
            int minutosNoche = factura.nextInt();

            if (minutosDia <= 75) {
                costoTotal += minutosDia * 0;
            } else {
                costoTotal += (minutosDia - 75) * 0.10;
            }

            if (minutosNoche <= 100) {
                costoTotal += minutosNoche * 0; 
            } else {
                costoTotal += (minutosNoche - 100) * 0.05;
            }

            costoTotal += 25.0; 
        } else {
            System.out.println("Código de servicio no válido.");
            return;
        }

        
        System.out.println("\nNúmero de cuenta: " + numeroCuenta);
        System.out.println("Tipo de servicio: " + (codigoServicio == 'R' || codigoServicio == 'r' ? "Regular" : "Premium"));
        System.out.println("Minutos utilizados: " + minutos);
        System.out.println("Cantidad a pagar: $" + costoTotal);

        factura.close();
    }
}
