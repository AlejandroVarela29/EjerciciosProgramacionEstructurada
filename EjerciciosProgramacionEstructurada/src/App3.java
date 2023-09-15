import java.util.Scanner;
public class App3 {

    public static void main(String args[]){
        int litros =0,kilometros=0;
        double total;

        Scanner viaje = new Scanner(System.in);

        System.out.println("En  este programa se realizaran los calculos para ver los");
        System.out.println("Kilometros obtenidos por litros");
         
        do{
        System.out.println("Cuantos litros de combustible uso?");
        litros=viaje.nextInt();
        }while(litros <=0 || litros>100);

        do{
            System.out.println("Cuantos kilometros recorrio");
            kilometros=viaje.nextInt();
        }while(kilometros<=0 || kilometros>500);

        total = litros / kilometros * 100;

        System.out.println("Los kilometros por litro son " +total);


        viaje.close();
    }
    
}
