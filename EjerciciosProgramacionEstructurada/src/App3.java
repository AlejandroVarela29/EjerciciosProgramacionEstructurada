import java.util.Scanner;
public class App12 {
    public static void main(String[] args) {

        int numCajas,numContenedores, numRosquillas, numCajasSobrantes, numContenedores;
        Scanner rosquillas = new Scanner(System.in);
        
        System.out.println("Introduzca el número total de rosquillas:");
        numRosquillas = rosquillas.nextInt();
     
        numCajas = numRosquillas / 24;
        numContenedores = numCajas / 75;
    
        int numRosquillasSobrantes = numRosquillas % 24;
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