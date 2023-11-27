package unidad3.actividadesdeaplicacion;
import java.util.Scanner;

public class Aplicacion316 {

   public static void main(String[] args) {
      System.out.println("Escriba n:");
      int n = new Scanner(System.in).nextInt();
      
      for (int fila = 1; fila <= n; fila++) {
         for (int espacios = 0; espacios < n-fila; espacios++) {
            System.out.print(" ");
         }
         for (int asteriscos = 1; asteriscos <= fila; asteriscos++) {
            System.out.print("* ");
         }
         
         System.out.println("");
      }
   }
}
