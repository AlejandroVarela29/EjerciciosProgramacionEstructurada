import java.util.Scanner;
public class App21{
    public static void main(String[] args) {

          int year;
        
          Scanner fecha = new Scanner(System.in);
        
          System.out.println("Introduzca un año entre 1994 y 1999:");
          year = fecha.nextInt();
        
        if (year < 1994 || year > 1999) {
            System.out.println("El año introducido no es válido.");
            return;
        }
        
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int[] días = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        boolean bisiesto = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    bisiesto = true;
                }
            } else {
                bisiesto = true;
            }
        }
        
        if (bisiesto) {
            días[1] = 29;
        }

        for (int i = 0; i < meses.length; i++) {
            System.out.println(meses[i]);
            for (int j = 1; j <= días[i]; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
       
            fecha.close();
        }
    }
}