/*
Crea una matriz 4 x 4 y mediante funciones o procedimientos debes 
buscar si un número está dentro de la 
matriz y mostrar de forma ordenada cada fila o columna
*/

package Ejercicio6_localiza_numero_en_matriz;

public class Ejercicio6_localiza_numero_en_matriz{
	public static void main(String[] args){

		int[][] matriz = new int[4][4];

		creaMatriz(matriz.length,matriz);
		visualizaMatriz(matriz.length,matriz);

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
}
