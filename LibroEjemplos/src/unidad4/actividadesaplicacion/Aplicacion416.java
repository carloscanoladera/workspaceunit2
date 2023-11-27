package unidad4.actividadesaplicacion;
import java.util.Scanner;

public class Aplicacion416 {

   public static void main(String[] args) {
      System.out.println("Escriba un número: ");
      int n =  new Scanner(System.in).nextInt();
      
      divisoresPrimos(n);
   }
   
   static void divisoresPrimos(int n) {
      for(int i=2; i<=n; i++) {
         if (n%i==0 && esPrimo(i)) {
            System.out.println("Dividor primo: " + i);
         }
      }
   }
   
   static boolean esPrimo(int n) {
      int i=2;
      while (i<n && n%i!=0) {
         i++;
      }
      return i==n;
   }
}
