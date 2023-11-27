package unidad2;

import java.util.Scanner;

public class actividadresuelta29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero entre 0 y 99999");
		int num = sc.nextInt();
		if (num<10) {
			
			System.out.println("El numero tiene una cifra");
		} else if (num<100) {
			
			System.out.println("El numero tiene dos cifras");
		} else if (num<100) {
			
			System.out.println("El numero tiene tres cifras");
		} else if (num<1000) {
			
			System.out.println("El numero tiene cuatro cifras");
		} else if (num<10000) {
			
			System.out.println("El numero tiene cinco cifras");
		}

	}

}
