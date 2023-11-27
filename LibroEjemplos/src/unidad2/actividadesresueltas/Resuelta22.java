package unidad2.actividadesresueltas;

import java.util.Scanner;

public class Resuelta22 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Introduzca un número: ");
      int n1 = sc.nextInt(); //primer número
      System.out.print("Introduzca otro número: ");
      int n2 = sc.nextInt();

      if (n1 == n2) { //si n1 esigual que n2
         System.out.println("Ambos números son iguales");
      } else {
         System.out.println("Lo números son distintos");
      }
   }
}