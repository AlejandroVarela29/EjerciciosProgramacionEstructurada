import java.util.Scanner;
public class App10 {
    public static void main(String[] args) throws Exception {
      char sexo;
      double a1,a2,a3,a4,a5,b,pesoCorporalkg,pesoCorporalLb, mMuneca = 0, mCintura,mCadera,mAntebrazo,gCorporalkg=0,pGrasaCorporalkg=0, pGrasaCorporalLb=0,gCorporalLB=0;
      //m = medida, g = grasa, p = porcentaje;

      Scanner peso = new Scanner(System.in);
      System.out.println("En este programa se realizara los calculos para medir la grasa corporal");
      System.out.println("Cual es su sexo H/M");
      sexo=peso.next().charAt(0);

      switch (sexo) {
        case 'M':
    
          do{
          System.out.println("Cual es su peso corporal");
          pesoCorporalkg=peso.nextDouble();
          }while(pesoCorporalkg>=0 || pesoCorporalkg<250);
          a1= (pesoCorporalkg * 0.732) + 8.987;

          do{
          System.out.println("Cual es la medida de su muneca (en el punto mas amplio)");
          mMuneca=peso.nextDouble();
          }while(mMuneca>=0 || mMuneca<50);
          a2= mMuneca / 3.140;

          do{
          System.out.println("Cual es la medida de su cintura (en el ombligo)");
          mCintura=peso.nextDouble();
          }while(mCintura>=0 || mCintura<150);

          a3= mCintura * 0.157;
          
          do{
          System.out.println("Cual es la medida de la cadera (en el punto mas amplio)");
          mCadera=peso.nextDouble();
          }while(mCadera>=0 || mCadera<200);
          a4=mCadera * 0.249;

          do{
          System.out.println("Mediada del antebrazo (en el punto mas amplio)");
          mAntebrazo=peso.nextDouble();
          }while(mAntebrazo>=0 || mAntebrazo<90);
          a5= mAntebrazo * 0.434;

          b=a1 + a2 -a3 - a4 + a5;
          gCorporalkg = pesoCorporalkg - b ;
          pGrasaCorporalkg = (gCorporalkg * 100) / pesoCorporalkg;
          gCorporalLB = gCorporalkg * 2.2;
          pGrasaCorporalLb = pGrasaCorporalkg * 2.2;
          
          
            System.out.println("Su grasa corporal en KG es " +gCorporalkg);
            System.out.println("Su grasa corporal en Lb es " +gCorporalLB);
            System.out.println("Su porcetaje de grasa corporal en Kg es " +pGrasaCorporalkg);
            System.out.println("Su porcentaje de grasa corporal en LB es " +pGrasaCorporalLb);
        

            break;

        case 'H':

         do{
          System.out.println("Cual es su peso corporal");
          pesoCorporalkg=peso.nextDouble();
         }while(pesoCorporalkg>=0 || pesoCorporalkg<250);

          a1= (pesoCorporalkg * 1.082)+94.42;

          do{
          System.out.println("Cual es la medida de su cintura");
          mCintura=peso.nextDouble();
          }while(mCintura>=0 || mCintura<300);
          a2= mCintura * 4.15;
          
          b= a1- a2;
          
          pesoCorporalLb = pesoCorporalkg * 2.2;
          gCorporalkg = pesoCorporalkg - b;
          pGrasaCorporalkg = (gCorporalkg * 100) / pesoCorporalkg;
          gCorporalLB = pesoCorporalLb - b;
          pGrasaCorporalLb = (gCorporalLB * 100) / pesoCorporalLb;
            
            
          System.out.println("Su peso corporal en Kg es " + gCorporalkg);
          System.out.println("Su peso corporal en Lb es " +gCorporalLB);
          System.out.println("Su porcentaje de grasa corporal en Kg es" +pGrasaCorporalkg);
          System.out.println("Su porcentaje de grasa corporal en Lb es " +pGrasaCorporalLb);
        
          break;
        default:
        System.out.println("Solo se acepta las letras M y H");
        System.out.println("Las letras tienen que estar en mayuscula");
            break;
      }
     peso.close();
}
}

