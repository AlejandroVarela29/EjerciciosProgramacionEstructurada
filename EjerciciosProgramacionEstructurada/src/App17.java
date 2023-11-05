import java.util.Scanner;

public class App17 {
    public static void main(String[] args) {

        int numeroArticulo;
        double[] valoresArticulos = {239.99, 129.75, 99.95, 350.89};
        double ingresos = 0.0; // Inicializa los ingresos a 0.0

        Scanner vendedor = new Scanner(System.in);
        System.out.println("Ingrese los articulos vendidos por el vendedor (ingrese -1 para finalizar):");

        while (true) {
            System.out.print("Ingrese el numero del artículo vendido (-1 para finalizar): ");
            numeroArticulo = vendedor.nextInt();

            if (numeroArticulo == -1) {
                break;
            }

            if (numeroArticulo >= 1 && numeroArticulo <= valoresArticulos.length) {
                ingresos += valoresArticulos[numeroArticulo - 1]; // Suma el valor de venta al total de ingresos
            } else {
                System.out.println("Numero de articulo no valido. Intente de nuevo.");
            }
        }

        ingresos = 200 + (0.09 * ingresos); // Calcula los ingresos totales

        System.out.println("Los ingresos del vendedor son: C$" + ingresos);

        vendedor.close();
    }
}
