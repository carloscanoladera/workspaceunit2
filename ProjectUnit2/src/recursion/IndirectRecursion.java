package recursion;

import java.util.Scanner;

public class IndirectRecursion {

	static void sum(int a, int b) {

		sumaux(a, b, 0);
	}

	static void sumaux(int a, int b, int S1) {

		int ant = S1;
		if (a <= b) {

			S1 = S1 + a;
			print(a, b, S1, ant);

		}

	}

	static void print(int a, int b, int S1, int ant) {

		System.out.println(ant + "+" + b + "=" + S1);

		a++;
		sumaux(a, b, S1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// suma de todos los valores entre dos enteros

		int a = 0, b = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number  a: ");
		a = sc.nextInt();

		System.out.print("Enter another number b greater than a: ");
		b = sc.nextInt();

		sum(a, b);

	}

}
