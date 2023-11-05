import java.util.Scanner;

public class App25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contra;
        String confirmarContra;

        while (true) {
            System.out.print("Ingrese una contraseña (entre 6 y 10 caracteres, al menos una letra y un dígito): ");
            contra = scanner.nextLine();

            if (contra.length() < 6 || contra.length() > 10) {
                System.out.println("La contraseña debe tener entre 6 y 10 caracteres. Inténtelo de nuevo.");
                continue;
            }

            boolean tieneLetra = false;
            boolean tieneDigito = false;

            for (char c : contra.toCharArray()) {
                if (Character.isLetter(c)) {
                    tieneLetra = true;
                } else if (Character.isDigit(c)) {
                    tieneDigito = true;
                }
            }

            if (!tieneLetra || !tieneDigito) {
                System.out.println("La contraseña debe contener al menos una letra y un dígito. Inténtelo de nuevo.");
                continue;
            }

            System.out.print("Confirme la contraseña: ");
            confirmarContra = scanner.nextLine();

            if (contra.equals(confirmarContra)) {
                System.out.println("¡Contraseña establecida con éxito!");
                break;
            } else {
                System.out.println("Las contraseñas no coinciden. Inténtelo de nuevo.");
            }
        }

        scanner.close();
    }
}
