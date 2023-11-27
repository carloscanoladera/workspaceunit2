package unidad3.actividadesresueltas;

import java.util.Scanner;

public class Resuelta39 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num; 

      do {
         System.out.print("Introduzca un número (de 1 a 10): ");
         num = sc.nextInt();
      } while (!(1 <= num && num <= 10));

      System.out.println("\n\nTabla del " + num);
      for (int i = 1; i <= 10; i++) {
         System.out.println(num + " x " + i + " = " + num * i);
      }
   }
}
