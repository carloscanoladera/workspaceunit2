package unidad1.actividadesaplicacion;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacion117 {

   public static void main(String[] args) {
      Scanner sc;
      sc = new Scanner(System.in).useLocale(Locale.US);
      System.out.println("Distancia en milímetros: ");
      double mm = sc.nextDouble();
      System.out.println("Distancia en centímetros: ");
      double cm = sc.nextDouble();
      System.out.println("Distancia en metros: ");
      double m = sc.nextDouble();
      
      double distanciaTotal = mm/10.0 + cm + m*100.0;
      System.out.println("Distancia total: " + distanciaTotal + " cm");
      }
}
