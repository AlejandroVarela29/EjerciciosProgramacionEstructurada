import java.util.Scanner;
public class App9 {
    public static void main(String[] args) {

          int numeroDeCuenta, balanceInicial, cargoTotal, creditoTotal,limiteCredito,nuevoBalace;
          Scanner banco = new Scanner(System.in);
        
          System.out.println("Enter the customer's account number:");
          numeroDeCuenta = banco.nextInt();
        
          System.out.println("Enter the customer's starting balance:");
          balanceInicial = banco.nextInt();
   
          System.out.println("Enter the total amount of all items charged by the customer in the month:");
          cargoTotal = banco.nextInt();
     
        System.out.println("Enter the total amount of all credits applied to the customer's account in the month:");
         creditoTotal = banco.nextInt();
   
        System.out.println("Enter the customer's credit limit:");
         limiteCredito = banco.nextInt();
      
          nuevoBalace = balanceInicial + cargoTotal - creditoTotal;
     
        System.out.println("The customer's new balance is: " + nuevoBalace);
        // Determine if the customer's credit limit has been exceeded.
        if (nuevoBalace > limiteCredito) {
            System.out.println("The customer's credit limit has been exceeded.");
        }
    }
}
    

