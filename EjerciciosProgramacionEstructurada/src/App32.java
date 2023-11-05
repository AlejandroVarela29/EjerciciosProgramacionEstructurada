import java.util.Scanner;

public class App32 {
    public static void main(String[] args) {
        Scanner sistema = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione el sistema numerico de origen:");
            System.out.println("1. Binario");
            System.out.println("2. Octal");
            System.out.println("3. Decimal");
            System.out.println("4. Hexadecimal");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");

            int opcion = sistema.nextInt();
            if (opcion == 5) {
                break;
            }

            System.out.print("Ingrese el numero a convertir: ");
            String numero = sistema.next();

            switch (opcion) {
                case 1: // Convertir desde binario
                    int decimalBinario = 0;
                    for (int i = numero.length() - 1, j = 0; i >= 0; i--, j++) {
                        char c = numero.charAt(i);
                        if (c == '1') {
                            decimalBinario += Math.pow(2, j);
                        } else if (c != '0') {
                            System.out.println("Numero binario no válido.");
                            return;
                        }
                    }
                    System.out.println("Numero en binario: " + numero);
                    System.out.println("Numero en decimal: " + decimalBinario);
                    System.out.println("Numero en octal: " + Integer.toOctalString(decimalBinario));
                    System.out.println("Numero en hexadecimal: " + Integer.toHexString(decimalBinario));
                    break;

                case 2: // Convertir desde octal
                    int decimalOctal = 0;
                    for (int i = numero.length() - 1, j = 0; i >= 0; i--, j++) {
                        char c = numero.charAt(i);
                        if (c >= '0' && c <= '7') {
                            decimalOctal += (c - '0') * Math.pow(8, j);
                        } else {
                            System.out.println("Numero octal no válido.");
                            return;
                        }
                    }
                    System.out.println("Numero en octal: " + numero);
                    System.out.println("Numero en decimal: " + decimalOctal);
                    System.out.println("Numero en binario: " + Integer.toBinaryString(decimalOctal));
                    System.out.println("Numero en hexadecimal: " + Integer.toHexString(decimalOctal));
                    break;

                case 3: // Convertir desde decimal
                    int decimal = Integer.parseInt(numero);
                    System.out.println("Numero en decimal: " + numero);
                    System.out.println("Numero en binario: " + Integer.toBinaryString(decimal));
                    System.out.println("Numero en octal: " + Integer.toOctalString(decimal));
                    System.out.println("Numero en hexadecimal: " + Integer.toHexString(decimal));
                    break;

                case 4: // Convertir desde hexadecimal
                    try {
                        int decimalHexadecimal = 0;
                        for (int i = numero.length() - 1, j = 0; i >= 0; i--, j++) {
                            char c = numero.charAt(i);
                            if (Character.isDigit(c)) {
                                decimalHexadecimal += (c - '0') * Math.pow(16, j);
                            } else if (c >= 'A' && c <= 'F') {
                                decimalHexadecimal += (c - 'A' + 10) * Math.pow(16, j);
                            } else if (c >= 'a' && c <= 'f') {
                                decimalHexadecimal += (c - 'a' + 10) * Math.pow(16, j);
                            } else {
                                System.out.println("Número hexadecimal no válido.");
                                return;
                            }
                        }
                        System.out.println("Numero en hexadecimal: " + numero);
                        System.out.println("Numero en decimal: " + decimalHexadecimal);
                        System.out.println("Numero en binario: " + Integer.toBinaryString(decimalHexadecimal));
                        System.out.println("Numero en octal: " + Integer.toOctalString(decimalHexadecimal));
                    } catch (NumberFormatException e) {
                        System.out.println("Numero hexadecimal no válido.");
                    }
                    break;

                default:
                    System.out.println("Opcion no valida. Por favor, elija una opcion valida.");
                    break;
            }
        }
        sistema.close();
    }
}
