package unidad1.actividadesaplicacion;
import java.util.Scanner;

public class Aplicacion113 {

   public static void main(String[] args) {
      Scanner sc;
      sc = new Scanner(System.in);
      System.out.println("Escriba un número: ");
      int numero = sc.nextInt();
      System.out.println("Y tiene que ser múltiplo de?: ");
      int multiploDe = sc.nextInt();
      int cantASumar = multiploDe - numero % multiploDe;
      System.out.print("Al " + numero + " hay que sumarle " + cantASumar);
      System.out.println(" para que sea múltiplo de " + multiploDe);
   }
}
