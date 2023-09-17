import java.util.Scanner;
public class App19 {
    public static void main(String[] args) {
        Scanner estacionar = new Scanner(System.in);
        
          double cargoInicial= 2.00, cobroAdicional = 0.50, cobroMximo = 10.00, cobroTptal = 0.00, cargoCliente = 0.00;
          int horasPaqueado;
        
          System.out.println("Cuanto tiempo estuvo parqueado: ");
          horasPaqueado= estacionar.nextInt();
        
          if (horasPaqueado <= 3) {
            cargoCliente= cargoInicial;
          } else if (horasPaqueado> 3 && horasPaqueado <= 24) {
            cargoCliente= cargoInicial + (cobroAdicional* (horasPaqueado - 3));
          } else {
          cargoCliente= cobroMximo;
          }
        
          System.out.println("Los cargos de estacionamiento para el cliente actual son: " + cargoCliente);
        
          cobroTptal= cargoCliente;
        
          System.out.println("Los cargos totales del día son: " + cobroTptal);

          estacionar.close();
    }
}