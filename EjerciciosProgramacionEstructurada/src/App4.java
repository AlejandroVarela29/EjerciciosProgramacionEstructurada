import java.util.Scanner;
public class App4 {

    public static void main(String args){

        Scanner canales = new Scanner(System.in);

        byte nCuenta, elegir = 0;
        char servicio, opc = 0;
        double cBasicoResidencial = 20.50;

        System.out.println("Se realizara un programa para para calcular la factura de un cliente ");

        do{
            System.out.println("Cual es su numero de cuenta ");
            nCuenta=canales.nextByte();
          }while(nCuenta<=0 || nCuenta>100);

          System.out.println("Cual es el servicio contratado R/N");
          servicio=canales.next().charAt(0);

          if( servicio == 'R' || servicio== 'r'){
            elegir=1;
          }else if(servicio == 'N' || servicio== 'n'){
            elegir=2;
          }

          switch (elegir) {
            case 1:

              System.out.println("En el plan residencial se le brindaran los precios ");
              System.out.println("Cargo por procesamiento de factura 4.50 ");
              System.out.println("cargo por servicio basico 20.50 ");
              System.out.println("Canales premiun 7.50 por canal ");

              if(opc == 'S' || opc == 's'){
                System.out.println(args);
              }
                System.out.println("args");
              
                
                break;
          

             case 2:
                
                break;
            default:
                break;
          }
        
        canales.close();
    } 
    

}
