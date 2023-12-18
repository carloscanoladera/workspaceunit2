package recursion;

import java.util.Scanner;

public class Factorial {
	
	static long factorial(long n)
	{
	    // Puede causar overflow
	    //
	    if (n == 1)
	    	return 1;

	    else
	        return n*factorial(n-1);
	}

	
	static long factorialOverflow(long n)
	{
	    // Puede causar overflow
	    //
	    if (n == 100)
	    	return 1;

	    else
	        return n*factorialOverflow(n-1);
	}
	
static long factorialTail(long n, long acumulador) {
		
		if (n<= 1) 
			return acumulador;
		else
			return factorialTail (n-1, n*acumulador);
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      long num; //número introducido por el usuario
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter anumber to compute its factorial ");
	      num = sc.nextInt();

		System.out.println(factorial(num));
		
		System.out.println(factorialOverflow(num));
		
		System.out.println(factorialOverflow(num));
	}

}
