package unidad2.actividadesaplicacion;
import java.util.Scanner;

public class Aplicacion219 {

   public static void main(String[] args) {
      System.out.println("Grados del ángulo:");
      int grados = new Scanner(System.in).nextInt();
      grados %= 360;
      
      double radianes = grados*Math.PI/180;
      System.out.println("En radianes: " + radianes);
   }
}
