package unidad3.actividadesdeaplicacion;
import java.util.Scanner;

public class Aplicacion314 {

   public static void main(String[] args) {
      System.out.println("Escriba un número:");
      int hasta = new Scanner(System.in).nextInt();
      
      System.out.println("1 -> primo");
      for(int num=2; num<= hasta; num++) {
         boolean esPrimo = true;
         int i=2;
         while (i<num && esPrimo) {
            if (num%i == 0) {
               esPrimo = false;
            }
            i++;
         }
         System.out.print(num+ " -> ");
         if (esPrimo) {
            System.out.println("primo");
         } else {
            System.out.println("no primo");
         }
      }
   }
   
}
