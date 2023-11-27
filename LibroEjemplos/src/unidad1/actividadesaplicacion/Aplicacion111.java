package unidad1.actividadesaplicacion;
import java.util.Scanner;

public class Aplicacion111 {

   public static void main(String[] args) {
      double baseImponible;
      int iva;
      Scanner sc;
      sc = new Scanner(System.in);
      System.out.println("Escriba la base imponible: ");
      baseImponible = sc.nextDouble();
      System.out.println("Escriba el IVA a aplicar");
      iva = sc.nextInt();
      
      double importeIVA = baseImponible*iva/100;
      System.out.println("Importe de IVA: " + importeIVA);
      double importeTotal= baseImponible + importeIVA;
      System.out.println("Importe total: " + importeTotal);
   }
}
