package unidad1.actividadesaplicacion;
import java.util.Scanner;

public class Aplicacion115 {

   public static void main(String[] args) {
      Scanner sc;
      sc = new Scanner(System.in);
      System.out.println("y = ax² + bx + c");
      System.out.println("a?: ");
      double a = sc.nextDouble();
      System.out.println("b?: ");
      double b = sc.nextDouble();
      System.out.println("c?: ");
      double c = sc.nextDouble();
      System.out.println("x?: ");
      double x = sc.nextDouble();
      double y = a*Math.pow(x, 2) + b*x + c;
      System.out.println("y = " + y);
   }
}
