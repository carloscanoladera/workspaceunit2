package unidad3.actividadespropuestas;

import java.util.Scanner;

public class Propuesta31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba una edad: ");
        int edad = sc.nextInt();
        int edadMax = edad;
        int edadMin = edad;
        while (edad != -1) {
            if (edadMin > edad) {
                edadMin = edad;
            }
            if (edadMax < edad) {
                edadMax = edad;
            }
            System.out.print("Escriba una edad: ");
            edad = sc.nextInt();
        }
        
        System.out.println("La edad máxima es: " + edadMax);
        System.out.println("La edad mínima es: " + edadMin);
    }
}
