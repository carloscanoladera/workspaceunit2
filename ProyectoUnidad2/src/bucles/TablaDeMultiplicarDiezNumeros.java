package bucles;

import java.util.Scanner;

public class TablaDeMultiplicarDiezNumeros {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// calcular su tabla de multiplicar del 1 hasta el 10
		
		//Por ejemplo para el 1
		// 1x1=1
		// 1x2=2
		//....
		// 1x10=10
		
		//Por ejemplo para el 2
		// 2x1=2
		// 2x2=4
		//....
		// 2x10=20
		
		//Por ejemplo para el 3
		// 3x1=3
		// 3x2=6
		//....
		// 3x10=30
		
		for (int i=1; i<=10; i++) {
			
			System.out.println("Tabla de multiplicar para el " + i);
			System.out.println("------------------------------");
		
			for (int j=1; j<=10 ; j++) {
				
				System.out.println(i+"x"+j+"="+ (i*j));
			}
			
			System.out.println("******************************");
		
		}

	}

}
