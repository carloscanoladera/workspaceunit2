package unidad1;

import java.util.Scanner;


/* escribe un programa que pida un numero por pantalla y pida su valor absoluto */
public class actividadresuelta112 {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in) ;
	System.out.println ("Escriba un número (positivo o negativo) : " ) ; 
	int n 	= sc.nextInt(); 
	int valorAbso1uto = n > 0 ? n : n*-1;
	//int valorAbso1uto = Math.abs(n);
	System.out.println ("EI valor absoluto de "+ n + " es "	+ valorAbso1uto) ; 
	}
}
