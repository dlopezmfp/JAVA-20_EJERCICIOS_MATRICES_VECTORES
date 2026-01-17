package Ejercicio9_rota_vector;
import java.util.Scanner;

public class Ejercicio9_rota_vector{
	public static void main(String[] args){
		int numeroDesplazamientos =0;
		int tamanioVector =0;
		int vector[] = null;

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el tamaño del vector: ");
		tamanioVector = sc.nextInt();
		vector = new int[tamanioVector];
		crearVector(vector);
		verVector(vector);
		System.out.print("\n Introduzca el número de desplazamientos: ");
		numeroDesplazamientos = sc.nextInt();
		desplazaVector(vector,numeroDesplazamientos);
		verVector(vector);
	}

	public static void crearVector(int[] vector){
		for(int i=0;i<vector.length;i++){
                	vector[i] = (int)(Math.random()*11);

                }
        }

        public static void verVector(int[] vector){
                System.out.println("EL VECTOR ES: ");
                for(int i=0;i<vector.length;i++){
                                System.out.print(vector[i] + "\t");
                }
        }

	public static void desplazaVector(int[] vector, int numeroDesplazamientos){
		int elemento = 0;

		for(int i = 0;i < numeroDesplazamientos;i++){

			elemento = vector[0];
			for(int j=0;j<vector.length;j++){
				if(j+1 <= (vector.length - 1)){
					vector[j] = vector[j+1];
				}else{
					vector[j] = elemento;
				}
			}
		}
	}
}
