import java.util.Scanner;

public class App7{
    public static void main(String[] args) {
        
          int numeroArticulo;
          double[] valoresArticulos ={ 239.99, 129.75, 99.95, 350.89 };
          double ingresos;

          Scanner vendedor = new Scanner(System.in);
          System.out.println("Ingrese los artículos vendidos por el vendedor (ingrese -1 para finalizar):");

          double ventasBrutas = 0;
          while (true) {
            System.out.print("Ingrese el número del artículo vendido (-1 para finalizar): ");
            numeroArticulo = vendedor.nextInt();

            if (numeroArticulo == -1) {
                break;
            }

            if (numeroArticulo >= 1 && numeroArticulo <= valoresArticulos.length) {
                ventasBrutas = valoresArticulos[numeroArticulo - 1];
            } else {
                System.out.println("Número de artículo no válido. Intente de nuevo.");
            }
        }

          vendedor.close();
    
          ingresos = 200 + (0.09 * ventasBrutas);

          System.out.println("Los ingresos del vendedor son: C$" + ingresos);
    }
}