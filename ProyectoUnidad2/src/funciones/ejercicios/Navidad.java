package navideno;

public class Navidad {
	
	// An= n^2
	public static int nTermSquare(int n) {
		
		return x*x;
	}
	
	public static int sumSquare(int n) {
		
		int res =0;
		
		for (int i=0 ; i<= n ; i++) {
			
			res+=nTermSquare(i);
		}
		return res;
		
	}

	// 1 11 111 1111
	// 11= 10^1 +1
	// 111= 10^2+11
	// 1111=10^3+111
	// An= 10^n+An-1
	// A3=10^3 + A2 = 10^3 +111
	
	
	
	public static int nTermOnes(int n, int termAnterior) {
		
		return (int) (Math.pow(10, n) + termAnterior);
		
		
	}
	
	public static int sumOnes(int n) {
		
		
	int res =0;
	int term=0;
		
		for (int i=0 ; i<= n ; i++) {
			
			//res+=nTermOnes(i,termAnterior);
			
			term= (int) Math.pow(10,i) + term;
			
			res+=term;
			
		}
		
		return res;
		
	}
	
	
	public static boolean esPrimo(int num) {
		
		boolean esPrimo=true;
		
		
		for (int i=2; i<= num/2 &&!esPrimo ; i++) {
			
			if (num%2==0)
				esPrimo=false;
			
		}		
		
		return esPrimo;
	}
	
	// Hacer un procedimiento que muestre los n primeros
	//numeros primos
	// para los 7 primeros primos
	//1,2,3,4,5,6,7,8,9,10,11,12,13, 14 ->i
	//1,2,3   4   5        6      7    ->contarPrimos
	
	public static void muestraNPrimos(int n) {
		
		int contarPrimos=0;
		int i=1;
		
		while (contarPrimos<=n) {
			
			if (esPrimo(i)) {
				System.out.print(i + ", ");
				contarPrimos++;
			}
			
			i++;	
			
		}
		
		
	}
	
	
	/*
	 * 
	 * 9. Write a program in Java to find the number and sum of all integers
		between min and max which are divisible by 9.
		Expected Output :
		Numbers between 100 and 200, divisible by 9 :
		108 117 126 135 144 153 162 171 180 189 198
		The sum : 1683

	 * 
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

