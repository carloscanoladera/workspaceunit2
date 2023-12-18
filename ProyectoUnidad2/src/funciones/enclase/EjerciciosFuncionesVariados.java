package funciones.enclase;

import java.util.Scanner;

public class EjerciciosFuncionesVariados {
	
	
	static void nombreEnPantalla (String nombre) {
		
		
		System.out.println("Hola " + nombre + " como estas");
		
	}
	static boolean  esMultiplo(int num1, int num2) {
		
		//No hace falta hacer variables siempre
		//puedo devolver el valor true o false
		// directamente porque num1%num2==0 es una
		// expresion booleana
		//boolean esMult= num1%num2==0;
		
		//return esMult;
		
		return num1%num2==0;
		
	}
	
	
	static double  mediaTemperatura(double tempMin, double tempMax) {
		
		
		return (tempMax+tempMin)/2;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String nombre;
		int num1,num2;
		System.out.println("Escribe un nombre por pantalla: ");
		nombre= sc.next();
		nombreEnPantalla(nombre);
	    //Los procedimientos no devuelven nada no se pueden
		//asignar, las funciones si porque devuelven un valor
		//String nombreytexto= nombreEnPantalla(nombre);
		
		System.out.println("Introduce num1: ");
		num1= sc.nextInt();
		System.out.println("Introduce num21: ");
		num2= sc.nextInt();
		
		// las funciones devuelven valores y se pueden asignar a variables
		boolean esMult= esMultiplo(num1, num2);
		System.out.println(num1 + " y " + num2 + " son multiplos:"+esMult);
		
		
		// hacerlo con un if
		// La manera correcta es llamar a la funcion directamente
		// cuantas menas asignaciones menos
		if (esMultiplo(num1,num2)) 
			System.out.println(num1 + " y " + num2 + " son multiplos");
		else
			System.out.println(num1 + " y " + num2 + " no son multiplos");
		
		
		esMultiplo((int) 5.0, (int) 7.2);
		
		
	}

}
