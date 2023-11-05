import java.util.Scanner;
public class App1 {
    public static void main(String[] args) {


        int edad;
        char género, armas;

        Scanner disco = new Scanner(System.in);
        
        System.out.println("Se realizara un programa para ver si cump[le los requisitos para ");
        System.out.println("Entrar a la discoteca y poder disfrutar de la misma ");
        
        
        System.out.println("¿Cuál es tu edad?");
        edad= disco.nextInt();

        System.out.println("¿Cuál es tu género? H/M");
        género = disco.next().charAt(0);
        
        if (edad < 18) {

            System.out.println("No puedes entrar al local.");
        } else {
            
            if (género=='M' && género=='m') {
                
                if (edad >= 20) {
                    System.out.println("Puedes entrar al local y consumir bebidas alcohólicas.");
                } else {
                    System.out.println("Puedes entrar al local, pero no puedes consumir bebidas alcohólicas.");
                }
            } else if(género=='H' && género=='h') {
                
                System.out.println("¿Portas armas?");
                armas = disco.next().charAt(0);
                if (armas=='S' && armas=='s') {
                    System.out.println("No puedes entrar al local.");
                } else {
            
                    if (edad >= 20) {
                        System.out.println("Puedes entrar al local y consumir bebidas alcohólicas.");
                    } else {
                        System.out.println("Puedes entrar al local, pero no puedes consumir bebidas alcohólicas.");
                    }
                }
            }
        }
        disco.close();
    }
    
}