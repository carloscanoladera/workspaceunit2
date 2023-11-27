package unidad3.actividadesdeaplicacion;
import java.util.Scanner;

public class Aplicacion315 {

   public static void main(String[] args) {
      System.out.println("Cuántas filas?:");
      int n = new Scanner(System.in).nextInt();
      
      for(int fila=0; fila < n; fila++) {
         for(int elemento=0; elemento <= fila; elemento++) {
            int factN=1;
            for(int i=1; i<=fila; i++) {
               factN*=i;
            }
            int factM=1;
            for(int i=1; i<=elemento; i++) {
               factM*=i;
            }
            
            int factNMenosM = 1;
            for(int i=1; i<=fila-elemento; i++) {
               factNMenosM*=i;
            }
            
            int valor = factN/(factM*factNMenosM);
            System.out.print(valor + "  ");
         }
         System.out.println("");
      }
   }
   
}
