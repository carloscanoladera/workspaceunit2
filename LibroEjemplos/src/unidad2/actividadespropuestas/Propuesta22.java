package unidad2.actividadespropuestas;

import java.util.Scanner;

public class Propuesta22 {

    public static void main(String[] args) {
        System.out.println("Escriba un número: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        boolean esPositivo = numero > 0;
        System.out.println("Es " + numero + " positivo? " + esPositivo);
    }
}
