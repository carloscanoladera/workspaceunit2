package recursividad;

public class EjerciciosRecursion {

	static int numDigitsIterative(int number) {

		int cont = 0;

		while (number > 0) {

			cont++;
			number = number / 10;
		}

		return cont;
	}

	static int numDigits(int number) {

		if (number == 0) {

			return 0;
		} else {

			return 1 + numDigits(number / 10);
		}

	}

	static void imprimeDeNaUno(int n) {

		if (n == 0)
			return;
		else {
			System.out.print(n + " ");
			imprimeDeNaUno(n - 1);
			return;
		}

	}

	static void imprimeDeUnoAN(int n) {

		if (n == 0)
			return;
		else {
			imprimeDeUnoAN(n - 1);
			System.out.print(n + " ");
			return;

		}

	}

	// recursiva

	public static int sumaNPrimerosNumeros(int n) {

		// caso base

		if (n == 0)
			return 0;

		// definicion recursiva
		return n + sumaNPrimerosNumeros(n - 1);

	}
	
	
	

	public static int sumaNPrimerosNumerosAux(int n, int acumulador) {
		
		if (n==0)
			return acumulador;
		else
			return sumaNPrimerosNumerosAux(n-1, acumulador+n);

	}
	
	
	public static int sumaNPrimerosNumerosMejorado(int n) {
		
		
		return sumaNPrimerosNumerosAux(n,0);
	}
	
	
	private static int reverseNumberAux(int number, int result) {
		
		int digit=0;
		
		if (number==0)
			return result;
		else {
			
			digit = number%10;			
			result= digit + result*10;
			number=number/10;
			
			return reverseNumberAux(number,result);
			
		}
			
		
		
	}
	
	// input= 2354
	// the reversed number
	// output = 4532
	
	public static int reverseNumber(int number) {
		
		
		return reverseNumberAux( number, 0);
	}
	
	
	public static int terminoFibonacci(int n) {
		
		// 2 casos base
		
		if (n==0)
			return 1;
		else if (n==1) {
			return 1;
			
		} else {
			
			return terminoFibonacci(n-1) + terminoFibonacci(n-2);
						
		}
				 		
	}	
	
	//Para casa 
	// hacer la version mejorada de terminoFibonacci con programacion dinámica y 
	// función de auxiliar
	
	
	static int terminoFibonacciAux (int n, int an_2, int an_1) {
		
		int an_2aux, an_1aux;
		
		if (n==2) 
			return an_2 + an_1;
		else {
			
			
			an_1aux = an_2 +an_1;
			an_2aux= an_1;
			
			
			return terminoFibonacciAux(n-1,an_2aux,an_1aux);
			
		}
		
		
	
	}
	
	static int terminoFibonacciMejorado (int n) {
		
		
		return terminoFibonacciAux(n,1,1);
	}
	
	
	//Para casa 
		// hacer la version mejorada con programacion dinámica y 
		// función de auxiliar de la suma de n terminos de fibonacci
	
	
	static int sumaNterminoFibonacciAux (int n, int an_2, int an_1, int sum) {
		
		return 0;
	}
	
static int sumaNterminoFibonacciMejorado (int n) {
		
		
		return sumaNterminoFibonacciAux(n,1,1,0);
	}
	
	
	// suponemos que a es mayor que b
	public static int MCD( int a, int b) {
		
		if (b==0)
			return a;
		else
			return MCD (b, a%b);
				
		
	}
	// aqui nos da igual que a sea mayor o menor que b
	public static int MCDMejorado( int a, int b) {
	
		if (a>=b)
			return MCD (a,b);
		
		else 
			return MCD(b,a);
	
	}
	

	
	
	
	
	
	
	

	public static void main(String[] args) {

		imprimeDeUnoAN(3);

		System.out.println("numero de digitos para 130:" + numDigits(130));
		
		
		System.out.println("termino fib 5:" +terminoFibonacciMejorado(5));
	}

}
