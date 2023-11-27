package unidad1.actividadesaplicacion;
import java.util.Scanner;

public class Aplicacion114 {

   public static void main(String[] args) {
      Scanner sc;
      sc = new Scanner(System.in);
      System.out.println("Escriba la base: ");
      double base = sc.nextDouble();
      System.out.println("Escriba la altura: ");
      double altura = sc.nextDouble();
      double areaTriangulo = base*altura/2;
      System.out.println("Área del trinángulo: " + areaTriangulo);
   }
}
