package ejercicios.ejerciciosmios.refuerzo;

public class Ejercicio1anidados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1; i<=3; i++) {
			
			System.out.print("Externo: " + i);
			
			for (int j=1; j<=2 ; j++) {
				
				System.out.print("\tInterno: " + j);
								
			}
			
			System.out.println();
			
		}

	}

}
