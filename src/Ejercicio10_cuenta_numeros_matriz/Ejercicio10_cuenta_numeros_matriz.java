/*
	Función que devuelva cuántas veces aparece un número en un array.
*/
package Ejercicio10_cuenta_numeros_matriz;

import java.util.Scanner;
public class Ejercicio10_cuenta_numeros_matriz{

	public static void main(String[] args){
		int dimension = 0,numero =0,frecuencia =0;
	
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Indique la dimensión de la matriz: ");
		dimension = sc.nextInt();
		int[][] matriz = new int[dimension][dimension];
		crearMatriz(matriz);
		verMatriz(matriz);
		System.out.print("Indique el número a encontrar en la matriz: ");
		numero = sc.nextInt();
		frecuencia = buscaNumeroMatriz(matriz,numero);
		if(frecuencia !=0){
			System.out.println("El número "+numero+" ha aparecido "+frecuencia+" veces en la matriz");
		}else{
			System.out.println("El número "+numero+" no se ha encontrado en la matriz");
		}
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
	public static int buscaNumeroMatriz(int[][] matriz,int numero){
		int contador =0;
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz.length;j++){
				if(numero == matriz[i][j]) contador++;
			}
	
		}
		return contador;
	}

}
