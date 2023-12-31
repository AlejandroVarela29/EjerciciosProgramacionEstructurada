import java.util.Scanner;

public class App8 {
    public static void main(String[] args) {

          double longitud, ancho, area,costoMarcoPorPulgada,costoPinturaPorPulgada=10, costoMarco, costoCoronas=0, costoCartonPorPulgadaCuadrada=0.2,costoVidrioPorPulgadaCuadrada=0.7, costoCarton, costoVidrio, costoTotal;
          int numeroCoronas;
          char tipoMarco, respuestaCoronas;
          String colorMarco; 
          
          Scanner foto = new Scanner(System.in);

          System.out.print("Ingrese la longitud de la fotografía en pulgadas: ");
          longitud = foto.nextDouble();

          System.out.print("Ingrese el ancho de la fotografía en pulgadas: ");
          ancho = foto.nextDouble();

          area = longitud * ancho;

          System.out.print("Elija el tipo de marco (R o L ): ");
          tipoMarco = foto.next().charAt(0);

          System.out.print("Elija el color del marco: ");
          colorMarco = foto.next();

        if (tipoMarco == 'r' || tipoMarco == 'R') {
            costoMarcoPorPulgada = 0.15;
        } else if (tipoMarco == 'l'  || tipoMarco == 'L') {
            costoMarcoPorPulgada = 0.25;
        } else {
            System.out.println("Tipo de marco no válido. Utilizando marco regular por defecto.");
            costoMarcoPorPulgada = 0.15;
        }
        
          costoMarco = (longitud + ancho) * 2 * costoMarcoPorPulgada;

          System.out.print("¿Desea agregar coronas? (S/N): ");
          respuestaCoronas = foto.next().charAt(0);

        if (respuestaCoronas == 's' || respuestaCoronas == 'S') {
            
            System.out.print("Ingrese el número de coronas: ");
            numeroCoronas = foto.nextInt();
            costoCoronas = numeroCoronas * 0.35;
        }

          costoCarton = area * costoCartonPorPulgadaCuadrada;
          costoVidrio = area * costoVidrioPorPulgadaCuadrada;

          costoTotal = costoMarco + costoPinturaPorPulgada * (longitud + ancho) * 2 + costoCoronas + costoCarton + costoVidrio;

          System.out.println("El costo total de enmarcar la fotografía es: $" + costoTotal);
           System.out.println("El color del marco es " + colorMarco);

          foto.close();
    }
}