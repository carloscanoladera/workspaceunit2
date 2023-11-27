package unidad2.actividadesaplicacion;
import java.util.Scanner;

public class Aplicacion218 {

   public static void main(String[] args) {
      int solucion = 0;
      int n1 = (int) (Math.random() * 99 + 1);
      int n2 = (int) (Math.random() * 99 + 1);
      int operacion = (int) (Math.random() * 3 + 1);
      switch (operacion) {
         case 1:
            System.out.println(n1 + " + " + n2 + "?:");
            solucion = n1 + n2;
            break;
         case 2:
            System.out.println(n1 + " - " + n2 + "?:");
            solucion = n1 - n2;
            break;
         case 3:
            System.out.println(n1 + " * " + n2 + "?:");
            solucion = n1 * n2;
            break;
      }
      
      int respuesta = new Scanner(System.in).nextInt();
      if (respuesta != solucion) {
         System.out.println("Operación incorrecta.\nLa solución es: " + solucion);
      } else {
         System.out.println("Correcto");
      }
   }
}
