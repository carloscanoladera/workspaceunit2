package funciones;

import java.util.Scanner;

public class FuncionesMatematicas {
	
							//	parámetros formales
	public static double media( int x , int y ) {
	
	double calculo;
	
	calculo = (double) (x + y)  / 2;    
	return calculo;
	//También se puede poner Return  ((x + y)  / 2)
	}
	
	public static int reverse(int num) {
		
		int cifra,numRes=0;
		
		
		while (num>0) {
			numRes*=10;
			cifra= num%10;
			numRes+= cifra; //numRes= numRes+cifra;
			num/=10;
								
		}				
		
		return numRes;
	}
	
	//delete the n digit of a given number num
	// for example, for the number 45634 if N is 3 the expected outcome is 4534 as 
	// the 6 in the middle is drop
	
	public static int deleteNDigit(int num, int N) {

		int cifra,exponente=0, contPosicion=1,numRes=0;
		
		while (num>0) {
			
			if (contPosicion!=N) {
				
				cifra=num%10;
				numRes= numRes +  cifra* (int) Math.pow(10, exponente);
				exponente++;
				
				
			} 
			contPosicion++;	
			num=num/10;
			
		}
		
		return numRes;
		
		
	}
	
	// to code this function use what you already have in this class
	//
	
	static boolean isCapicua (int num) {
		
						
		return reverse(num)==num;
	}
	
	// program a function called isPrimeNumber that guesses if a number is a prime number
	
	static boolean isPrimeNumber(int num) {
		
		return true;
	}
	
	
	// use modularity
	// write a procedure named by rangedPrimeList that prints out the primer numbers in a min max range
	// for instance, the prime numbers between 7 and 15 are 7, 11, 13
	
	
	// use modularity
	// write a procedure named by nPrimeList that prints out the first n prime numbers. 
	// the  list of the first five (n==5) prime numbers is as following:  2, 3, 5, 7, 11
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2;
		double result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el primer Numero");
		num1= sc.nextInt();
		
		System.out.println( "Dame el segundo Numero");
		num2= sc.nextInt();
		result=media(num1,num2);

	 //parámetros ACTUALES O REALES n1 y n2

		//System.out.println( "La media es:" + result) ;
		
	
		//System.out.println("the reversed number for "+  num1+ " is " + reverse(num1));
		
		 int outcome= deleteNDigit(num1, num2);
		
	     System.out.println("the number after taking out the " + num2 + " position for "+  num1+ " is " + outcome);


	}

}
