package Ejercicio8_numeros_pares;

import java.util.Scanner;

public class Ejercicio8_numeros_pares{
	public static void main(String[] args){
		int[][] matriz =null;
		int tamanioMatriz = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca el tamañó de la matriz: ");
		tamanioMatriz=sc.nextInt();
		matriz = new int[tamanioMatriz][tamanioMatriz];
		crearMatriz(matriz);
		verMatriz(matriz);
		numerosPares(matriz);

	}
	public static void numerosPares(int[][] matriz){
		System.out.println("Los números pares son: ");
		for(int i =0;i< matriz.length;i++){
			for(int j=0;j<matriz.length;j++){
			if(matriz[i][j]%2 == 0) System.out.print(matriz[i][j]+", ");
			}
		
		}
		System.out.println();



	}

	public static void crearMatriz(int[][] matriz){
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz.length;j++){
				matriz[i][j] = (int)(Math.random()*11);

			}

		}



	}

	public static void verMatriz(int[][] matriz){
		System.out.println("LA MATRIZ ES: ");
		for(int i=0;i< matriz.length;i++){
			for(int j=0;j<matriz.length;j++){
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
