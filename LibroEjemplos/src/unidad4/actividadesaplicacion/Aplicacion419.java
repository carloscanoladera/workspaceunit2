package unidad4.actividadesaplicacion;
import java.util.Scanner;

public class Aplicacion419 {

   public static void main(String[] args) {
      System.out.println("5 números aleatorios entre 10 y 20: ");
      numerosAleatorios(5, 10, 20);
      System.out.println("7 números aleatorios entre 0 y 1: ");
      numerosAleatorios(7);

   }

   static void numerosAleatorios(int cuantos, int min, int max) {
      for (int i = 1; i <= cuantos; i++) {
         int n = (int) (Math.random() * (max - min +1) + min);
         System.out.print(n + "  ");
      }
      System.out.println("");
   }
   static void numerosAleatorios(int cuantos) {
      for (int i = 1; i <= cuantos; i++) {
         double n = Math.random();
         System.out.print(n + "  ");
      }
      System.out.println("");
   }
}
