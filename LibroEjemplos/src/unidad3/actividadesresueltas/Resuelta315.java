package unidad3.actividadesresueltas;

import java.util.Scanner;

public class Resuelta315 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Escriba n: ");
      int n = sc.nextInt();

      for (int fila = 1; fila <= n; fila++) {
         for (int col = fila; col <= n; col++) {
            System.out.print("* "); 
         }
         System.out.println(""); 
      }
   }
}
