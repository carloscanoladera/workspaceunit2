package unidad1.actividadesaplicacion;
import java.util.Scanner;

public class Aplicacion121 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Escriba a: ");
      int a = sc.nextInt();
      System.out.println("Escriba b: ");
      int b = sc.nextInt();
      boolean sonIguales = a == b;
      System.out.println("Son iguales: " + sonIguales);
   }
}
