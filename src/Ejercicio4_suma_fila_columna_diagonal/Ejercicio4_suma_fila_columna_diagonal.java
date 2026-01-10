/*
Crea una matriz de 3 x 3 y utiliza funciones para devolver la suma de cada fila, de cada columna y
de sus dos diagonales.
 */
package Ejercicio4_suma_fila_columna_diagonal;

import java.util.Scanner;

public class Ejercicio4_suma_fila_columna_diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short filaColumna=0;
        short diagonal=0;
        int[][] matriz = new int[3][3];

        creaMatriz(matriz, 3);
        visualizaMatriz(matriz);
        System.out.print("Indique la fila de la matriz que desea sumar: ");
        filaColumna = sc.nextShort();
        System.out.println("La suma de la fila "+filaColumna+" es "+sumaFila(matriz,filaColumna-1));
        System.out.print("Indique la columna de la matriz que desea sumar: ");
        filaColumna = sc.nextShort();
        System.out.println("La suma de la columna "+filaColumna+" es "+sumaColumna(matriz,filaColumna-1));
        System.out.print("Indique la diagonal que desea sumar(Principal ->0, Secundaria: 1): ");
        diagonal = sc.nextShort();
        System.out.print("La suma de la diagonal "+((diagonal == 0) ? "Principal" : "Secundaria")+" es "+sumaDiagonal(matriz,diagonal));
    }

    private static void creaMatriz(int[][] matriz, int tamanio) {
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                matriz[i][j] = (int) (Math.random() * 11);
            }
        }
    }

    private static void visualizaMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int sumaFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[fila][i];
        }
        return suma;
    }
    private static int sumaColumna(int[][] matriz, int columna) {
        int suma = 0;
        for(int i=0;i<matriz.length;i++){
            suma += matriz[i][columna];
        }
        return suma;
    }
    private static int sumaDiagonal(int[][] matriz, short diagonal) {
        int suma=0;
        if(diagonal==0){
            for(int i=0;i<matriz.length;i++){
                suma+=matriz[i][i];
            }
        }else{
            for(int i=0;i<matriz.length;i++){
                suma+=matriz[i][matriz.length-1-i];
            }
        }
        return suma;
    }
}