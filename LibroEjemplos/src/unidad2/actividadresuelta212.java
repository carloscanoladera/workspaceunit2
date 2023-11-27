package unidad2;

import java.util.Scanner;

public class actividadresuelta212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System. in) ; 
		int diasDe1Mes=0; // Aquí guardaremos el número de días que tiene el mes 
		System.out.println("introduzca día:"); 
		int dia = sc.nextInt() ; 
		System.out.println("Introduzca mes:"); 
		int mes = sc.nextInt() ; 
		System.out.println("Introduzca año:"); 
		int año = sc.nextInt() ; 
		// suponemos gue la fecha introducida es correcta 
		diasDe1Mes = switch (mes) { 
		 
		 //si hay una sola instrucción se puede obviar yield y ( } 
		case 2 -> 28; 
		case 4, 6, 9 , 11 -> 30; 
		default -> 31 ;
		
		};


		dia++; // incrementamos eI día 
		if (dia > diasDe1Mes) { // si supera eI número de días del mes 
			dia = 1; //reiniciamos día a 1 
			mes++; //e incrementamos el mes 
			if (mes > 12) { // si mes supera 12 
				mes =1; // 10 reiniciamos a 1 
				año++; //e incrementamos el año
			}
		// EI año -1 pase a1 año +1. EI año O nunca existió. 
		// Para evitar que el año pase del -1 a1 0
		}
		if (año ==0 ) { 
		
			año =1;
		}
		
	}

}
