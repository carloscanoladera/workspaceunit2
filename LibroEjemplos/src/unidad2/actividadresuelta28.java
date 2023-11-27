package unidad2;

import java.util.Scanner;

public class actividadresuelta28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double a,b,c;
		double x1,x2,d;
		System.out.println("Introduzca el primer coeficiente a:");
		a = sc.nextDouble();
		System.out.println("Introduzca el segundo coeficiente a:");
		b = sc.nextDouble();
		System.out.println("Introduzca el tercer coeficiente a:");
		c = sc.nextDouble();
		
		d= (b*b -4*a*c);
		
		if (d<0) {
			
			System.out.println("No hay soluciones para la ecuación");
		} else {
			
			if (a==0) {
				
				System.out.println("No es ecuación de segundo grado");
			} else {
				
				x1= (-b + Math.sqrt(d))/(2*a);
				x2= (-b - Math.sqrt(d))/(2*a);
				System.out.println("Solución 1: " + x1);
				System.out.println("Solución 2: " + x2);
				
			}
		}

	}

}
