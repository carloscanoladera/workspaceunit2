package unidad2.actividadespropuestas;
import java.util.Locale;
import java.util.Scanner;

public class Propuesta25 {

   public static void main(String[] args) {
      System.out.println("Aforo del local:");
      int aforo = new Scanner(System.in).nextInt();
      System.out.println("Precio por entrada:");
      double precioEntrada = new Scanner(System.in).useLocale(Locale.US).nextDouble();
      System.out.println("Número de entradas vendidas:");
      int entradasVendidas = new Scanner(System.in).nextInt();
      
      double recaudacion = precioEntrada * entradasVendidas;
      
      if (entradasVendidas < aforo*0.2) {
         System.out.println("Se cancela el concierto");
         recaudacion = 0;
      } else if (entradasVendidas < aforo*0.5) {
         System.out.println("Entradas rebajadas al 25%");
         recaudacion *= (1-0.25);
      } else {
         System.out.println("Concierto normal"); 
      }
      
      System.out.println("Recaudación: " + recaudacion);
   }
}
