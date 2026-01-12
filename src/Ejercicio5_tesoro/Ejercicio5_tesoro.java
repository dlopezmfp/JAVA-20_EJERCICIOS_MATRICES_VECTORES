/*
Crea una matriz de 5 x 5 con caracteres en donde una de las casillas tenga la letra ‘T’
correspondiente a un tesoro.
El usuario tendrá 4 intentos para averiguar dónde está el tesoro, por cada intento que
falle se le indicará dos frases dando pistas (comentando si el tesoro está por encima,
en la misma línea o debajo donde está buscando, o si está a la izquierda, derecha o misma columna).
Deberá haber como mínimo una función o procedimiento para crear la matriz situando el tesoro de forma
aleatoria y otra función para decir al usuario si ha acertado o fallado, y dar las pistas adecuadas.
*/

package Ejercicio5_tesoro;

import java.util.Scanner;
public class Ejercicio5_tesoro {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        short[] coordenadasIntroducidas= new short[2];
	short[] coordenadasTesoro = new short[2];
        char[][] matriz;
        matriz = new char[5][5];
        coordenadasTesoro=creaMatriz(matriz);
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("El tesoro se encuentra en la coordenada: "+(coordenadasTesoro[0])+" "+(coordenadasTesoro[1]));
        System.out.print("Indique la coordenada X: ");
        coordenadasIntroducidas[0] = sc.nextShort();
        System.out.print("Indique la coordenada Y: ");
        coordenadasIntroducidas[1] = sc.nextShort();
	compruebaTesoro(coordenadasIntroducidas,coordenadasTesoro);




    }
    private static short[] creaMatriz(char[][] matriz){
        short[] coordenadas = new short[2];
        short filaAleatoria   = (short) (Math.random()*(matriz.length));
        short columnaAleatoria= (short) (Math.random()*(matriz.length));
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                int asciiLetra =((short)(Math.random()*25)+97);
                matriz[i][j]=(char)asciiLetra;
            }
        }
        matriz[filaAleatoria][columnaAleatoria]='T';
        coordenadas[0]=(short)(filaAleatoria+1);
        coordenadas[1]=(short)(columnaAleatoria+1);
        return coordenadas;
    }
    private static void compruebaTesoro(short coordenadas[],short coordenadasTesoro[]){
        int coordenadaX = coordenadasTesoro[0] - coordenadas[0];
        int coordenadaY = coordenadasTesoro[1] - coordenadas[1];

        if(coordenadaX == 0 && coordenadaY==0) {
            System.out.println("¡HAS ENCONTRADO EL TESORO!");
            return;
        }
        if(coordenadaY > 0) {
            System.out.println("El tesoro está más derecha");
        }else if(coordenadaY<0){
            System.out.println("El tesoro etá más izquierda");
        } 

	if(coordenadaX > 0){
		System.out.println("El tesoro está más a la abajo");
	}else if (coordenadaX <0){
		System.out.println("El tesoro está más a la arriba");
	} 

    }
}
