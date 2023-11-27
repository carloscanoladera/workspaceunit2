package unidad1.actividadesaplicacion;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacion118 {

   public static void main(String[] args) {
      final int PATAS_HORMIGA = 6;
      final int PATAS_ARAÑA = 8;
      final int PATAS_COCHINILLA = 14;
      Scanner sc;
      sc = new Scanner(System.in).useLocale(Locale.US);
      System.out.println("Número de hormigas: ");
      int hormigas = sc.nextInt();
      System.out.println("Número de arañas: ");
      int arañas = sc.nextInt();
      System.out.println("Número de cochinillas: ");
      int cochinillas = sc.nextInt();
      
      int numTotalPatas = hormigas    * PATAS_HORMIGA + 
                          arañas      * PATAS_ARAÑA   +
                          cochinillas * PATAS_COCHINILLA;
      
      System.out.println("Número total de patas: " + numTotalPatas);
      }
}
