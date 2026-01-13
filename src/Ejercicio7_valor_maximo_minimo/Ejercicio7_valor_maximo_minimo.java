/*
	Dado un array de enteros, crea dos funciones que devuelvan el valor máximo y
   	el mínimo del array.
*/

package Ejercicio7_valor_maximo_minimo;

import java.util.Scanner;

public class Ejercicio7_valor_maximo_minimo{
	public static void main(String[] args){
		int[][] matriz = null;
		int tamanio = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Indica el tamaño de la matriz: ");
		tamanio=sc.nextInt();
		matriz = new int[tamanio][tamanio];
		creaMatriz(matriz);
		verMatriz(matriz);
		calculaMaximoMinimo(matriz);

	}

	public static void creaMatriz(int[][] matriz){
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz.length;j++){
				matriz[i][j] = (int)(Math.random()*11);
			 }
		}
	}

	public static void verMatriz(int[][] matriz){
		System.out.println("\n\nLA MATRIZ ES:\n");
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz.length;j++){
			
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}

	public static void calculaMaximoMinimo(int[][] matriz){
		int maximo=0, minimo = 100;

		for(int i =0;i<matriz.length;i++){
			for(int j=0;j<matriz.length;j++){
				if(maximo < matriz[i][j]) maximo = matriz[i][j];
				if(minimo > matriz[i][j]) minimo = matriz[i][j];
			}
		}

		System.out.println("El máximo de la matriz es: "+maximo+" y el mínimo de la matriz es: "+minimo);
	}

}
