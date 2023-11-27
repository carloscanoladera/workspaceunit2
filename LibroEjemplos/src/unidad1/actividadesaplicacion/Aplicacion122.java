package unidad1.actividadesaplicacion;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacion122 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in).useLocale(Locale.US);
      System.out.println("Longitud del lanzamiento (en metros con 3 decimales): ");
      double metros = sc.nextDouble();
      int centimetros = (int) (metros * 100);
      System.out.println("En centímetros enteros: " + centimetros);
   }
}
