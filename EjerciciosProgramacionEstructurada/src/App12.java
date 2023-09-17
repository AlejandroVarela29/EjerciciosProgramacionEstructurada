import java.util.Scanner;
public class App12 {
    public static void main(String[] args) {

          int numeroCuenta, numeroCanalesPremium, numeroConexiones = 0;
          double importeFactura= 0;
          char codigoCliente;

          Scanner cajero= new Scanner(System.in);
        
          System.out.println("Ingrese el número de cuenta del cliente:");
          numeroCuenta= cajero.nextInt();
        
          System.out.println("Ingrese el código de cliente (R/N):");
          codigoCliente= cajero.next().charAt(0);
        
          System.out.println("Ingrese el número de canales Premium:");
          numeroCanalesPremium= cajero.nextInt();
        
        if(codigoCliente=='N' || codigoCliente=='n') {
            System.out.println("Ingrese el número de conexiones de servicio básico:");
            numeroConexiones= cajero.nextInt();
        }
        
        if (codigoCliente=='R' || codigoCliente=='r') {
            
            importeFactura = 4.50 + 20.50 + 7.50 * numeroCanalesPremium;
        } else if (codigoCliente=='N' || codigoCliente=='n') {
        
            if (numeroConexiones <= 10) {
                importeFactura= 15.00 + 75.00 + 50.00 * numeroCanalesPremium;
            } else {
                importeFactura= 15.00 + 75.00 + 5.00 * (numeroConexiones - 10) + 50.00 * numeroCanalesPremium;
            }
        }
        
          System.out.println("Número de cuenta: " + numeroCuenta);
          System.out.println("Importe de facturación: " + importeFactura);

        cajero.close();
    }
}