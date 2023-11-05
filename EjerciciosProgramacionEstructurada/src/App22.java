import java.util.Scanner;
import java.util.Random;

public class App22 {
    public static void main(String[] args) {
        Scanner loto = new Scanner(System.in);
        Random random = new Random();
        int secreto = random.nextInt(50) + 1;
        int intento = 0;
        int usuario;

        while (true) {
            System.out.println("Adivine un numero entre 1 y 50.");

            do {
                System.out.print("Intente de nuevo: ");
                usuario = loto.nextInt();
                intento++;

                if (usuario > secreto) {
                    System.out.println("Demasiado alto. Intente de nuevo.");
                } else if (usuario <secreto) {
                    System.out.println("Demasiado bajo. Intente de nuevo.");
                }
            } while (usuario != secreto && intento < 3);

            if (usuario == secreto) {
                System.out.println("Felicidades. ¡Adivino el numero!");
            } else {
                System.out.println("Lo siento, no adivino el numero. Era " + secreto + ".");
            }

            System.out.print("¿Desea jugar otra vez? (1 - Si, 2 - No): ");
            int deNuevo = loto.nextInt();
            if (deNuevo == 2) {
                break;
            }

            secreto = random.nextInt(50) + 1;
            intento = 0;
        }

        loto.close();
    }
}