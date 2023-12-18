package funciones.fundamentos;
import java.util.Scanner;

public class AverageApp {
	
							//	formal parameters
	public static double average( int x , int y ) {
	
	double res;
	
	res = (double) (x + y)  / 2;    
	return res;
	//También se puede poner Return  ((x + y)  / 2)
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2;
		double result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Prompt the first number");
		num1= sc.nextInt();
		
		System.out.println( "Prompt the second number");
		num2= sc.nextInt();
		 //real and formal parameters
		result=average(num1,num2);



		System.out.println( "The average is:" + result) ;


	}

}
