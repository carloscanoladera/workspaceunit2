package unidad3.actividadesdeaplicacion;
import java.util.Scanner;

public class Aplicacion312 {

   public static void main(String[] args) {
      System.out.println("Escriba un número binario:");
      int binario = new Scanner(System.in).nextInt();
      
      int decimal = 0;
      int base = 1;
      while (binario!=0) {
         int unidadBinaria = binario % 2;
         binario /= 10;
         decimal += base*unidadBinaria;
         base *=2;
      }
      
      System.out.println(decimal);
   }
}
