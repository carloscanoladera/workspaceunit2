package unidad2.actividadespropuestas;

import java.util.Scanner;

public class Propuesta24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un número:");
        int num1 = sc.nextInt();
        System.out.println("Escriba otro número:");
        int num2 = sc.nextInt();
        
        boolean multiplos = num1 % num2 == 0;
        System.out.println(num1 + " es multiplo de " + num2 + ": " + multiplos);
    }
}
