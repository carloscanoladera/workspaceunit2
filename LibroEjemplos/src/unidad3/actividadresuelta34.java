package unidad3;

import java.util.Scanner;

public class actividadresuelta34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner (System. in) ; 
		int etiquetaArbolMasA1to; //númerc identificativo del árbol más alto 
		int alturaArbolMasAlto; //altura del árbol más alto 
		int etiqueta =0; //número identificativo del árbol del gue se piden los datos 
		int altura; //altura del árbol del que se piden los datos 
		System.out.print ("Altura del arbo1 (" + etiqueta + "):"); 
		altura = sc.nextInt() ; 
		alturaArbolMasAlto = altura; //el primer árbol será, por ahora, el más alta 
		etiquetaArbolMasA1to= 0; //el árbol con etiqueta 0 es, por ahora, ei más alto 
		while (altura != -1) { 
			if (altura > etiquetaArbolMasA1to) { //hemos encontrado un árbol más alto 
				alturaArbolMasAlto= altura; 
				etiquetaArbolMasA1to = etiqueta; 
			}
			etiqueta++;
		}

		System.out.print("Altura del arbol (" + etiqueta +"):");
		
		if(alturaArbolMasAlto == -1) {
			
			System.out.println("No hay ningun arbol");
		} else {
			System.out.println("El arbol mas alto mide: " + alturaArbolMasAlto);
			System.out.println("Etiqueta del Arbol: " + etiquetaArbolMasA1to);
			
			
		}
		
	}

}
