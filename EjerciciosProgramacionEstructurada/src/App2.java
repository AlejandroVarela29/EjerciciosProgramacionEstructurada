import java.util.Scanner;
public class App2 {
    public static void main(String[] args) {

          double lado1,lado2,lado3;
        
          Scanner triangulo = new Scanner(System.in);

          System.out.println("Se realizaran las medida para saber que tipo de triangulo es ");

          System.out.println("Introduce la longitud del primer lado del triángulo:");
          lado1 = triangulo.nextDouble();

          System.out.println("Introduce la longitud del segundo lado del triángulo:");
          lado2 = triangulo.nextDouble();

          System.out.println("Introduce la longitud del tercer lado del triángulo:");
          lado3 = triangulo.nextDouble();
        
        if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2) {
    
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triángulo es equilátero");
            } else if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
                System.out.println("El triagulo es isósceles");
            } else {
                System.out.println("El triangulo es escaleno");
            }
        } else {
            
            System.out.println("No se puede formar un triángulo con los datos introducidos");
        }
        triangulo.close();
    }
}