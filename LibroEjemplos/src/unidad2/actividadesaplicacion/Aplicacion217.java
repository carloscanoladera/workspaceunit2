package unidad2.actividadesaplicacion;
import java.util.Scanner;

public class Aplicacion217 {

   public static void main(String[] args) {
      int n1 = (int)(Math.random()*99+1);
      int n2 = (int)(Math.random()*99+1);
      System.out.println(n1 + " + " + n2 + "?:");
      int suma = new Scanner(System.in).nextInt();
      int solucion = n1+n2;
      if (suma != solucion) {
         System.out.println("Operación incorrecta.\nLa solución es: " + solucion);
      } else
         System.out.println("Correcto");
   }
}
