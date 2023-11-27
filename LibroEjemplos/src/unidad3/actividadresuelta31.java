package unidad3;

import java.util.Scanner;

public class actividadresuelta31 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ; 
		boolean espar, espositivo; // indicadores para el informe 
		System.out.println ("Introduzca número:"); 
		
		// leemos eI número 
		int num = sc.nextInt() ; 
		 // repetimos mientras eI número leído no sea O 
		while (num != 0) { 
		// si divido un número entre 2 y obtenga como resto O, significa que es par 
		//el operador (resto módulo) calcula el resto. Así sabretros la paridad 
		espar = num % 2 ==0 ? true : false; // si el resto es 0, será par 
		
		espositivo = num >= 0 ? true : false; //consideramos el 0 positivo 
		System.out.println("Es par?:"  + espar + "\nEs positivo? : " + espositivo) ; 
		System.out.println ( " Cuadrada"  + num * num) ; 
		System.out.print("Introduzca otro número: ") ; 
		num = sc.nextInt(); // volvemos a leer num 
		}

	}

}
