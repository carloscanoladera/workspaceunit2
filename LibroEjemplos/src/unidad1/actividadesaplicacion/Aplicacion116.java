package unidad1.actividadesaplicacion;
import java.util.Scanner;

public class Aplicacion116 {

   public static void main(String[] args) {
      Scanner sc;
      sc = new Scanner(System.in);
      System.out.println("Escriba una cantidad de segundos: ");
      int segundos = sc.nextInt();
      int minutos = segundos / 60;
      segundos %= 60;
      
      int horas = minutos / 60;
      minutos %= 60;
      
      System.out.println("Horas: " + horas);
      System.out.println("Minutos: " + minutos);
      System.out.println("Segundos: " + segundos);
   }
}
