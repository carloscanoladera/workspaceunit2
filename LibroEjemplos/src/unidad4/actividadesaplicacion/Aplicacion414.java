package unidad4.actividadesaplicacion;
import java.util.Scanner;

public class Aplicacion414 {

   public static void main(String[] args) {
      System.out.println("Días?");
      int dias =  new Scanner(System.in).nextInt();
      System.out.println("Horas?");
      int horas =  new Scanner(System.in).nextInt();
      System.out.println("Minutos?");
      int minutos =  new Scanner(System.in).nextInt();
      
      int segundos = totalSegundos(dias, horas, minutos);
      System.out.println("Total de segundos: " + segundos);
   }
   
   static int totalSegundos(int dias, int horas, int minutos) {
      horas += dias*24;
      minutos += horas*60;
      int segundos = minutos*60;
      
      return segundos;
   }
}
