package unidad2.actividadesaplicacion;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacion215 {

   public static void main(String[] args) {
      System.out.println("Escriba la base:");
      double base = new Scanner(System.in).useLocale(Locale.US).nextDouble();
      System.out.println("Y la altura:");
      double altura = new Scanner(System.in).useLocale(Locale.US).nextDouble();
      
      if (base < 0 || altura < 0) {
         System.out.println("La base y la altura deben ser positivas.");
      } else {
         double area = base*altura/2;
         System.out.println("El área del triángulo es: " + area);
      }
   }
}
