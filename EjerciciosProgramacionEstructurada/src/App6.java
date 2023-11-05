import java.util.Scanner;
public class App6 {
    public static void main(String[] args) {


        Scanner banpro = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de cuenta del cliente: ");
        int numeroCuenta = banpro.nextInt();
        
        System.out.print("Ingrese el tipo de cuenta del cliente (s o S ​​para ahorros, o C para cheques): ");
        char tipoDeCuenta = banpro.next().charAt(0);
        
        System.out.print("Ingrese el saldo minimo del cliente: ");
        double balanceMinimo = banpro.nextDouble();
        
        System.out.print("Ingrese el saldo actual del cliente: ");
        double balanceRecurrente = banpro.nextDouble();
        
        double balanceNuevo = balanceRecurrente;
        if (balanceRecurrente < balanceMinimo) {
            if (tipoDeCuenta == 's' || tipoDeCuenta == 'S') {
                balanceNuevo -= 10;
            } else if (tipoDeCuenta == 'c' || tipoDeCuenta == 'C') {
                balanceNuevo -= 25;
            }
        } else {
            if (tipoDeCuenta == 's' || tipoDeCuenta == 'S') {
                balanceNuevo += balanceRecurrente * 0.04;
            } else if (tipoDeCuenta == 'c' || tipoDeCuenta == 'C') {
                if (balanceRecurrente <= 5000 + balanceMinimo) {
                    balanceNuevo += balanceRecurrente * 0.03;
                } else {
                    balanceNuevo += balanceRecurrente * 0.05;
                }
            }
        }
        
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Tipo de cuenta : " + tipoDeCuenta);
        System.out.println("Balance recurrente: " + balanceRecurrente);
        System.out.println("Balance nuevo: " + balanceNuevo);
      
        banpro.close();
    }
}