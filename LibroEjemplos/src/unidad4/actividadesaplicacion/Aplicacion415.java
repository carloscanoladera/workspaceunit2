package unidad4.actividadesaplicacion;
import java.util.Scanner;

public class Aplicacion415 {

   public static void main(String[] args) {
      System.out.println("Hora 1.");
      System.out.println("Horas?");
      int horas1 =  new Scanner(System.in).nextInt();
      System.out.println("Minutos?");
      int minutos1 =  new Scanner(System.in).nextInt();
      System.out.println("Hora 2.");
      System.out.println("Horas?");
      int horas2 =  new Scanner(System.in).nextInt();
      System.out.println("Minutos?");
      int minutos2 =  new Scanner(System.in).nextInt();
      
      int minutos = diferenciaMin(horas1, minutos1, horas2, minutos2);
      System.out.println("Minutos de diferencia: " + minutos);
   }
   
   static int diferenciaMin(int horas1, int minutos1, int horas2, int minutos2) {
      int diferencia = (horas1*60 + minutos1) - (horas2*60 + minutos2); 
      if (diferencia<0) {
         diferencia *= -1;
      }
      return diferencia;
   }
}
