/*
	Crea una función que reciba un array de enteros y devuelva un nuevo array con los elementos en orden inverso (no utilizar el método reverse).
*/

package Ejercicio13_orden_inverso;

import java.util.Scanner;

public class Ejercicio13_orden_inverso{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int dimension =0;
                int[][] matriz = null;
           
                System.out.print("Indique la dimensión de la matriz: ");
                dimension = sc.nextInt();
                matriz = new int[dimension][dimension];
                crearMatriz(matriz);
                verMatriz(matriz);
		invertirMatriz(matriz);
		verMatriz(matriz);
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

	public static void invertirMatriz(int[][] matriz){
		int contadorVector=0;
		int[] vectorTemporal = new int[(matriz.length)*(matriz.length)];
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz.length;j++){
				 vectorTemporal[contadorVector] = matriz[i][j];
				contadorVector++;
			}
		}
		contadorVector--;
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz.length;j++){
				 matriz[i][j] = vectorTemporal[contadorVector];
				 contadorVector--;
			}
		}
	}

}
