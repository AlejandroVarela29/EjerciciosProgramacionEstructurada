import java.util.Scanner;
public class App27{

    public static void main(String args[]){
        byte horaT,horaExtra,intentos=0;
        double salario, salarioInicial, inss,pagoExtra, salarioPostInss, salarioBruto,salarioAnual;

        Scanner sueldo = new Scanner(System.in);

        System.out.println("En este programa se realizaran los calculos para el salario bruto");
    
        do{
        System.out.println("Cuantas horas trabajo en la semana?");
        horaT=sueldo.nextByte();
        intentos++;
        if(intentos<2){
            System.out.println("Introduzca un valor valido" + (intentos-3));
        }else if(intentos>2){
            System.out.println("Ah utilizado todos los intentos");
            break;
        }
        }while(horaT<=0 || horaT>40);

        do{
        System.out.println("Cuanto se le paga por hora?");
        salario=sueldo.nextDouble();
        intentos++;
        if(intentos<2){
            System.out.println("Introduzca un valor valido" + (intentos-3));
        }else if(intentos>2){
            System.out.println("Ah utilizado todos los intentos");
            break;
            
        }
        }while(salario<=0 || salario>100);
        
        do{
          System.out.println("Cuantas hora extra hizo?");
          horaExtra=sueldo.nextByte();
          if(intentos<2){
            System.out.println("Introduzca un valor valido" + (intentos-3));
        }else if(intentos>2){
            System.out.println("Ah utilizado todos los intentos");
            break;
            }
        }while(horaExtra<=0 || horaExtra>40);

        salarioInicial= salario * horaT;
        pagoExtra= salario * 2;
        salarioAnual = (salarioInicial + pagoExtra) * 12;
        salarioPostInss= salarioInicial + pagoExtra;
        inss= salarioPostInss * 0.07;
        salarioBruto= salarioPostInss - inss;

        System.out.println("Su salario semanal es  " +salarioInicial);
        System.out.println("Su salario mas las horas extra es " +salarioPostInss);
        System.out.println("Su salario despues del inss es " +inss);
        System.out.println("Su salario bruto es " +salarioBruto);

        sueldo.close();
        






    }
}
