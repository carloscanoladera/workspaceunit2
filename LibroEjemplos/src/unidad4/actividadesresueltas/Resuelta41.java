package unidad4.actividadesresueltas;

import java.util.Scanner;

public class Resuelta41 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Introduzca un número: ");
      int n = sc.nextInt();
      System.out.println("--Antes de llamar a la función--");
      eco(n); //invocamos la función
      System.out.println("--Después de llamar a la función--");
   }

   static void eco(int a) {
      for (int i = 0; i < a; i++) {
         System.out.println("Eco...");
      }
   }
}