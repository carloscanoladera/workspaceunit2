package unidad1.actividadesaplicacion;
public class Aplicacion120 {

   public static void main(String[] args) {
      java.util.Scanner sc = new java.util.Scanner(System.in).useLocale(java.util.Locale.US);
      System.out.println("Escriba un número: ");
      double numero = sc.nextDouble();
      double raizCuadrada = java.lang.Math.sqrt(numero);
      System.out.println("La raiz cuadrada es: " + raizCuadrada);
   }
}
