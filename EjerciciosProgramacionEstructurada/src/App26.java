import java.util.Scanner;
import java.util.Random;

public class App26 {
    public static void main(String[] args) {
        Scanner locura = new Scanner(System.in);
        Random random = new Random();

        System.out.println("¡Hola! Soy Eliza. Puedes comenzar a hablar conmigo. Escribe 'Adios' para salir.");

        while (true) {
            String respuestaUsuario = locura.nextLine().toLowerCase();
            
            if (respuestaUsuario.equals("adios")) {
                System.out.println("Hasta luego. Espero que hayas tenido una buena conversacion");
                break;
            } else if (respuestaUsuario.contains("mi")) {
                String[] words = respuestaUsuario.split(" ");
                for (int i = 0; i < words.length; i++) {
                    if (words[i].equals("mi")) {
                        if (i + 1 < words.length) {
                            System.out.println("Cuenteme más sobre su " + words[i + 1]);
                        } else {
                            System.out.println("Cuenteme más sobre usted");
                        }
                    }
                }
            } else if (respuestaUsuario.contains("amor") || respuestaUsuario.contains("odio")) {
                System.out.println("Parece que tiene fuertes sentimientos al respecto");
            } else {
                String[] respuestaAleatoria = {
                    "Continue",
                    "Dígame más",
                    "Continue",
                    "Eso suena interesante. Cuentame mas al respecto",
                    "¿Y como te hace sentir eso?",
                    "¿Puedes expandir un poco más sobre eso?"
                };
                int aleatorio = random.nextInt(respuestaAleatoria.length);
                System.out.println(respuestaAleatoria[aleatorio]);
            }
        }
        locura.close();
    }
}
