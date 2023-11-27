package unidad4.actividadesaplicacion;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacion412 {

   public static void main(String[] args) {
      System.out.println("Primer punto.");
      System.out.println("x?");
      double x1 = new Scanner(System.in).useLocale(Locale.US).nextDouble();
      System.out.println("y?");
      double y1 = new Scanner(System.in).useLocale(Locale.US).nextDouble();
      System.out.println("Segundo punto.");
      System.out.println("x?");
      double x2 = new Scanner(System.in).useLocale(Locale.US).nextDouble();
      System.out.println("y?");
      double y2 = new Scanner(System.in).useLocale(Locale.US).nextDouble();
      
      double distancia = distanciaEuclidea(x1, y1, x2, y2);
      System.out.println("Distancia euclídea: " + distancia);
   }
   
   static double distanciaEuclidea(double x1, double y1, double x2, double y2) {
      return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
   }
}
