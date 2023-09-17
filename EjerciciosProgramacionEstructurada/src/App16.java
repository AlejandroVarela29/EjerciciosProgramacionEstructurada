import java.util.Scanner;
public class App16 {
    public static void main(String[] args) {

          int numeroDeCuenta, balanceInicial, cargoTotal, creditoTotal,limiteCredito,nuevoBalace;
          Scanner banco= new Scanner(System.in);
        
          System.out.println("Ingrese el número de cuenta del cliente:");
          numeroDeCuenta= banco.nextInt();
        
          System.out.println("Ingrese el saldo inicial del cliente:");
          balanceInicial= banco.nextInt();
   
          System.out.println("Ingrese el monto total de todos los artículos cobrados por el cliente en el mes:");
          cargoTotal= banco.nextInt();
     
          System.out.println("Ingrese el monto total de todos los créditos aplicados a la cuenta del cliente en el mes:");
          creditoTotal= banco.nextInt();
   
          System.out.println("Ingrese el límite de crédito del cliente:");
          limiteCredito= banco.nextInt();
      
          nuevoBalace= balanceInicial + cargoTotal - creditoTotal;
     
          System.out.println("El nuevo saldo del cliente es: " + nuevoBalace);
           System.out.println("El numero de cuenta del cliente es: " + numeroDeCuenta);
        
        if (nuevoBalace > limiteCredito) {
            System.out.println("Se ha superado el límite de crédito del cliente..");
        }

        banco.close();
    }
}
    

