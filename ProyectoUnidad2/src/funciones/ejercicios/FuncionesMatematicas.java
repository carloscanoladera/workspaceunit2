package funciones.ejercicios;

import java.util.Scanner;

public class FuncionesMatematicas {
	
							//	parámetros formales
	public static double media( int x , int y ) {
	
	double calculo;
	
	//calculo = (double) (x + y)  / 2;    
	return  (double) (x + y)  / 2;
	//También se puede poner Return  ((x + y)  / 2)
	}
	/*
	 * 
	 * The number passed as a parameter is reversed
	 * For instance if we make the call reverse(3456) the
	 * value returned by the function would be 6543
	 * 
	 */
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
	
	
	// this function returns the total of digits of a given number
	
	public static int  countDigits(int num) {
		

		int digitCounter=0;
		
		while (num>0) {
			
			
			num=num/10;
			//num/=10;
			digitCounter++;
			
		}
		
		return digitCounter;
		
	}
	// this function returns the number with all the ocurrences  of  a digit 
	// replaced by the new digit. For instance, if the number is 12373, the digit is
	// 3 and the new digit is five the returned value would be 12575
	
	public static int replaceDigits(int num, int digit, int newDigit) {
		
		
		int cifra,exponente=0, numRes=0;
		
		while (num>0) {
			
			cifra=num%10;
			
			if (cifra==digit) {
				
				
				cifra=newDigit;
			
								
			} 
			
			numRes+=  cifra* (int) Math.pow(10, exponente);
			exponente++;
			num=num/10;
			
		}
		
		return numRes;		
		
	}
	
	
	// this function replace the digit in the position the number passed as a parameter
	// with a new digit
		
		public static int replaceDigitByPosition(int num, int position, int newDigit) {
			
			
			
			return 0;
			
		}
	
		
		
		// this function receives a number and a digit and returns the first position of this digit
		// in the number. As a way to illustrate the input and output, providing that  this call is performed
		// digitPotition(54492,4) the returned value should be 3, the position of the first ocurrence of the digit 4
		
		public static int digitPosition(int num, int digit) {
			
			
			return 0;
			
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
	
	// int rotateOneToTheRight(int number)
	// input= 5376
	// output= 6537
	
	static int rotateOneToTheRight(int number) {
		
		int numDigits= countDigits(number);
		int digit=0;
		int result=0;
		
		digit= number%10; //=> we get the last digit 6
		
		// we transform 6 to 6000 
		result= (int) (digit*Math.pow(10,numDigits-1)); 
		
		// we obtain the rest of the number from 5376 to 537 by dividing by 10
		number= number/10;
		
		//6000+ 537 is the rotated number
		
		result= result+number;
				
		
		return result;
	}
	
	// int rotateNToTheRight(int number,int n)
		// input= 5376 , 2
		// output= 7653
	
	
	static int rotateNToTheRight(int number, int n) {
		
		int numDigits= countDigits(number);
		int digit=0;
		int result=0;
		int position=0;
		
		//n= n%numDigits;
		
		while (number>0) {
			
			digit=number%10;
			number=number/10;
			if(position<n) {
				
				result+= digit*Math.pow(10, position + n);
				//result+= digit*Math.pow(10,numDigits - n + position);
			} else {
				
				result+= digit*Math.pow(10, position-n);
				
			}
			position++;
			
			
		}
		
	return result;
	}
	
	// int rotateNToTheLeft(int number,int n)
			// input= 53765 , 3
			// output= 65735
	
	static int rotateNToTheLeft(int number, int n) {
		
		
		return 0;
	
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
	// countPrimes -> 
	// countNum -> to traverse all the numbers until you get n prime numbers 1,2,3,4,5,6,7,8,9,10,11
	// while (countPrimes <=n) {
		
	// if IsPrime(number) 
	//		countPrimes++
	// countNum++;
	
	
	
	public static int maximoComunDivisor(int a, int b) {
	    int max,min,temp;//
	    
	    max= a>=b?a:b;
	    min= a<b?a:b;
	    
	    while (min > 0) {
	        temp=min;
	        min = max % min;
	        a = temp;
	    }
	    return a;
	}
	
	// procedimiento para mostrar la simplificacion de una fraccion
	// pasamos la fraccion 18/20 resultado mostrado sea 18/20=9/10
	//Modularidad -> usamos el MCD para simplificar la fracción
	
	public void simplificarFraccion(int numerador, int denominador ) {
		
	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2;
		double result;
	/*	Scanner sc = new Scanner(System.in);
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

	     
	     */
	     System.out.println("the number rotates 2: " + rotateNToTheRight(85374,2));

	}

}
