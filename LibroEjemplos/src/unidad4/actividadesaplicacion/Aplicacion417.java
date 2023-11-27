package unidad4.actividadesaplicacion;
import java.util.Scanner;

public class Aplicacion417 {

   public static void main(String[] args) {
      System.out.println("Escriba un número: ");
      int n1 =  new Scanner(System.in).nextInt();
      System.out.println("Escriba otro número: ");
      int n2 =  new Scanner(System.in).nextInt();
      
      int suma1 = sumaDivisoresPropios(n1);
      int suma2 = sumaDivisoresPropios(n2);
      
      if (suma1==n2 && suma2==n1) {
         System.out.println("Los números son amigos.");
      } else {
         System.out.println("Los números no son amigos.");
      }
      
   }
   
   static int sumaDivisoresPropios(int n) {
      int suma = 0;
      for(int i=1; i<n; i++) {
         if (n%i==0) {
            suma += i;
         }
      }
      return suma;
   }
}
