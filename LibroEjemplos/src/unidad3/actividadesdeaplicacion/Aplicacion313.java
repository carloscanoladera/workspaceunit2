package unidad3.actividadesdeaplicacion;
import java.util.Scanner;

public class Aplicacion313 {

   public static void main(String[] args) {
      System.out.println("Hora:");
      int h = new Scanner(System.in).nextInt();
      System.out.println("Minutos:");
      int m = new Scanner(System.in).nextInt();
      System.out.println("Segundos:");
      int s = new Scanner(System.in).nextInt();
      System.out.println("Cuántos segundos desea adelantar el reloj::");
      int cuantos = new Scanner(System.in).nextInt();
      
      
      for (int i = 1; i <= cuantos; i++) {
         s++;
         if (s==60) {
            s = 0;
            m++;
            if(m==60) {
               m=0;
               h++;
               if (h==24) {
                  h=0;
               }
            }
         }
      }
      
      System.out.println(h + ":" + m + ":" + s);
   }
}
