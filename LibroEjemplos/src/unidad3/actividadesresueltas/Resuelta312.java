package unidad3.actividadesresueltas;

import java.util.Scanner;

public class Resuelta312 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      boolean suspensos = false; 

      for (int i = 0; i < 5; i++) {
         System.out.print("Introduzca nota (de 0 a 10): ");
         int notas = sc.nextInt();

         if (notas < 5) { 
            suspensos = true; 
         }
      }
      if (suspensos) {
         System.out.println("Hay alumnos suspensos");
      } else {
         System.out.println("No hay suspensos");
      }
   }
}
