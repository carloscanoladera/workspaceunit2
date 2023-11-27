package unidad3.actividadesdeaplicacion;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacion320 {

   public static void main(String[] args) {
      double dineroTotal = 0;
      double cantidad;
      do {
         System.out.println("Cantidad de dinero:");
         cantidad = new Scanner(System.in).useLocale(Locale.US).nextDouble();
         dineroTotal += cantidad;
      } while (cantidad != 0);

      System.out.println("El dinero total del que dispone es: " + dineroTotal);
   }
}
