import java.util.Scanner;
public class App15{

    public static void main(String args[]){
        byte horaT,horaExtra;
        double salario, salarioInicial, inss,pagoExtra, salarioPostInss, salarioBruto;

        Scanner sueldo = new Scanner(System.in);

        System.out.println("En este programa se realizaran los calculos para el salario bruto");
    
        do{
        System.out.println("Cuantas horas trabajo en la semana?");
        horaT=sueldo.nextByte();
        }while(horaT<=0 || horaT>40);

        do{
        System.out.println("Cuanto se le paga por hora?");
        salario=sueldo.nextDouble();
        }while(salario<=0 || salario>100);
        
        do{
          System.out.println("Cuantas hora extra hizo?");
          horaExtra=sueldo.nextByte();
        }while(horaExtra<=0 || horaExtra>40);

        salarioInicial= salario * horaT;
        pagoExtra= salario * 2;
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