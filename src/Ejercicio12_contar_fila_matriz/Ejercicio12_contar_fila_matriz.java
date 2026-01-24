/*
	Función que reciba una matriz y un número de fila y devuelva la suma total de esa fila.
*/

package Ejercicio12_contar_fila_matriz;

import java.util.Scanner;

public class Ejercicio12_contar_fila_matriz{
	public static void main(String[] args){
		int fila =0,dimension =0,suma =0;
		int[][] matriz = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("Indique la dimensión de la matriz: ");
		dimension = sc.nextInt();
		matriz = new int[dimension][dimension];
		crearMatriz(matriz);
		verMatriz(matriz);
		System.out.print("Indique la fila a sumar: ");
		fila = sc.nextInt();
		suma = contarFilaMatriz(matriz,fila);
		System.out.println("La suma de la fila "+fila+" de la matriz es : "+suma);

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

	public static int contarFilaMatriz(int[][] matriz,int fila){
		int suma=0;
		for(int i =0;i<matriz.length;i++){
			suma += matriz[fila-1][i];
		}
		return suma;
	}
}
