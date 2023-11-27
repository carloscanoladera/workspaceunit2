package unidad1.actividadesaplicacion;
import java.util.Scanner;

public class Aplicacion112 {

   public static void main(String[] args) {
      Scanner sc;
      sc = new Scanner(System.in);
      System.out.println("Escriba un número: ");
      int numero = sc.nextInt();
      int cantASumar = 7 - numero % 7;
      System.out.print("Al " + numero + " hay que sumarle " + cantASumar);
      System.out.println(" para que sea múltiplo de 7");
   }
}
