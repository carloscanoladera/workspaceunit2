package unidad3.actividadesdeaplicacion;
import java.util.Scanner;

public class Aplicacion317 {

   public static void main(String[] args) {
      System.out.println("Escriba a:");
      int a = new Scanner(System.in).nextInt();
      System.out.println("Escriba b:");
      int b = new Scanner(System.in).nextInt();

      int mcd = a < b ? a : b;
      boolean encontrado = false;

      while (mcd >= 1 && !encontrado) {
         if (a % mcd == 0 && b % mcd == 0) {
            encontrado = true;
            System.out.println("El mcd es: " + mcd);
         }
         mcd--;
      }
   }
}
