package unidad3.actividadesdeaplicacion;
import java.util.Scanner;

public class Aplicacion318 {

   public static void main(String[] args) {
      System.out.println("Escriba a:");
      int a = new Scanner(System.in).nextInt();
      System.out.println("Escriba b:");
      int b = new Scanner(System.in).nextInt();

      int mayor = a > b ? a : b;
      int mcm = mayor;
      while (mcm % a != 0 || mcm % b != 0) {
         mcm += mayor;
      }

      System.out.println("Mínimo común múltiplo: " + mcm);
   }
}
