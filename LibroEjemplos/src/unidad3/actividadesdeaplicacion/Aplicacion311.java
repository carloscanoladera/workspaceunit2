package unidad3.actividadesdeaplicacion;
import java.util.Scanner;

public class Aplicacion311 {

   public static void main(String[] args) {
      System.out.println("Escriba un número:");
      int num = new Scanner(System.in).nextInt();
      int binario = 0;
      while (num != 0) {
         int unidadBinaria = num % 2;
         num /= 2;
         System.out.println(unidadBinaria);
      }
   }
}
