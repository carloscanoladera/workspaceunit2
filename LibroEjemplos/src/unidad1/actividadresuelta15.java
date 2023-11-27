package unidad1;

public class actividadresuelta15 {
	
	/*
	 * 
	 * EI tipo short permite almacenar valores comprendidos entre —32768 y 32 767. Escribir 
un programa que compruebe que el rango de valores de un tipo se comporta de forma cr- 
clica, es decir, el valor siguiente al máximo es el valor mínimo. 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			short num; 
			num = 32767; //valor máximo dentro del rango de short 
			System.out.println ( "Valor máximo para eI tipo short:" + num); 
			num++; // incrementamos en . para evitar salirse del rango, la 
			// variable num tomará eI valor mínimo para eI tipo short 
			System.out.println( "Valor mínimo para eI tipo short : " +	num); 


	}

}
