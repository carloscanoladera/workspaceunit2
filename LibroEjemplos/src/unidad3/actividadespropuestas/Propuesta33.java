package unidad3.actividadespropuestas;

import java.util.Scanner;

public class Propuesta33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba un número: ");
        int n = sc.nextInt();
        while (n > 0) {
            int unidad = n % 10;
            System.out.println(unidad);
            n /= 10;
        }
    }
}
