package unidad4.actividadesaplicacion;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacion411 {

   public static void main(String[] args) {
      System.out.println("Radio de la esfera:");
      double radio = new Scanner(System.in).useLocale(Locale.US).nextDouble();
      
      superficieVolumenEsfera(radio);
   }
   
   static void superficieVolumenEsfera(double radio) {
      double superficie = 4*Math.PI*Math.pow(radio,2);
      double volumen = 4/3*Math.PI*Math.pow(radio, 3);
      
      System.out.println("Superficie: " + superficie);
      System.out.println("Volumen: " + volumen);
   }
}
