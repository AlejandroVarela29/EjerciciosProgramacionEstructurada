import java.util.Scanner;
public class App3 {
    public static void main(String[] args) {

        int numCajas,numContenedores, numRosquillas, numCajasSobrantes, numRosquillasSobrantes;
        Scanner rosquillas = new Scanner(System.in);
        
        System.out.println("Se realizaran los calculos para saber cuantas rosquillas caben en cada una ");

        do{
        System.out.println("Introduzca el número total de rosquillas:");
        numRosquillas = rosquillas.nextInt();
        }while(numRosquillas<=0);

        numCajas = numRosquillas / 24;
        numContenedores = numCajas / 75;
    
         numRosquillasSobrantes = numRosquillas % 24;
        if (numRosquillasSobrantes > 0) {
            numCajas--;
        }
        
        numCajasSobrantes = numCajas % 75;
        if (numCajasSobrantes > 0) {
            numContenedores--;
        }
        
        System.out.println("Número de cajas necesarias: " + numCajas);
        System.out.println("Número de contenedores necesarios: " + numContenedores);

        System.out.println("Número de rosquillas sobrantes: " + numRosquillasSobrantes);
        System.out.println("Número de cajas sobrantes: " + numCajasSobrantes);

        rosquillas.close();
    }
}