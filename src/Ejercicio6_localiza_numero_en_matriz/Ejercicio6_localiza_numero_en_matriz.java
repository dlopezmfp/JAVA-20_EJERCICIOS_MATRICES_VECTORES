/*
Crea una matriz 4 x 4 y mediante funciones o procedimientos debes 
buscar si un número está dentro de la 
matriz y mostrar de forma ordenada cada fila o columna
*/

package Ejercicio6_localiza_numero_en_matriz;

import java.util.Scanner;

public class Ejercicio6_localiza_numero_en_matriz{
	public static void main(String[] args){

		int numeroABuscar = 0;
		Scanner sc = new Scanner(System.in);

		int[][] matriz = new int[4][4];

		creaMatriz(matriz.length,matriz);
		visualizaMatriz(matriz.length,matriz);
		System.out.print("Inique el número a buscar en la matriz: ");
		numeroABuscar = sc.nextInt();
		buscaNumero(numeroABuscar,matriz);

	}

	public static void creaMatriz(int tamanio,int[][] matriz){

		for(int i =0;i<tamanio;i++){
			for(int j=0;j<tamanio;j++){
				matriz[i][j] = (int)(Math.random()*11);
			} 

		}
	}

	public static void visualizaMatriz(int tamanio,int[][] matriz){

		System.out.println("LA MATRIZ ES: \n");
		for(int i=0;i< tamanio;i++){
			for(int j=0;j<tamanio;j++){
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void buscaNumero(int numero, int[][] matriz){
		boolean bandera = false;
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz.length;j++){
				if(matriz[i][j] == numero){
					System.out.println("El número "+numero+" se ha encontrado en la coordenada "+(i+1)+" "+(j+1));
					bandera = true;
				}
			}
		}
		if(!bandera) System.out.println("El número "+numero+" no se ha encontrado en la matriz");
	}

}
