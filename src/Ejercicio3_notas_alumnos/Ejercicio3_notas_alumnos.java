
/*Crea un programa que defina una matriz con las notas de 4 alumnos distintos en 3 asignaturas distintas.
Con un array paralelo de tamaño 4 define el nombre de los 4 alumnos y uno de tamaño 3 con el nombre de las asignaturas.
A continuación, tendrás que definir una función para mostrar cada alumno junto a su nota en cada asignatura.
Realizarás otra función para calcular la nota media de cada alumno, otra para averiguar cuál es el mejor alumno
en cada asignatura, otra para calcular cuál es la asignatura que mejor se le da a cada alumno.
*/
package Ejercicio3_notas_alumnos;

public class Ejercicio3_notas_alumnos {
    public static void main(String[] args){
        String[] alumnos = {"Antonio", "Pepe", "María", "Rafael"};
        String[] asignaturas= {"Informática","Matemáticas","Sociales"};
        int[][] notas = new int[alumnos.length][asignaturas.length];
        calculaNotas(alumnos.length,asignaturas.length,notas);
        visualizaNotas(alumnos,asignaturas,notas);
        notaMedia(alumnos,asignaturas,notas);
        mejorAlumnoAsignatura(alumnos,asignaturas,notas);
        mejorAsignaturaAlumno(alumnos,asignaturas,notas);
    }

    private static void calculaNotas(int alumnos,int asignaturas, int[][] notas){
        for(int i=0;i<alumnos;i++){
            for(int j=0;j<asignaturas;j++){
                notas[i][j] = (int)(Math.random() * 11); // 1..10
            }
        }
    }

    private static void visualizaNotas(String[] alumnos, String[] asignaturas,int[][] notas){
        System.out.println("VISUALIZACIÓN DE ALUMNOS");
        System.out.print("\t\t");
        for(int i=0;i<asignaturas.length;i++){System.out.print(asignaturas[i]+"\t");}
        System.out.println();
        for(int i=0;i<alumnos.length;i++){
            System.out.print(alumnos[i]+"\t");
            for(int j=0;j<asignaturas.length;j++){
                System.out.print(notas[i][j]+"\t\t\t");
            }
            System.out.println();
        }
    }

    private static void notaMedia(String[] alumnos, String[] asignaturas, int[][] notas){
        double notaMedia = 0.00;
        for(int i=0;i<alumnos.length;i++) {
            for (int j = 0; j < asignaturas.length; j++) {
                notaMedia += notas[i][j];
            }
            notaMedia = notaMedia/asignaturas.length;
            System.out.println("La nota media del alumno; "+alumnos[i]+" es: "+ String.format("%.2f",notaMedia));
            notaMedia=0;
        }
    }
    private static void mejorAlumnoAsignatura(String[] alumnos,String[] asignaturas,int[][] notas){
        System.out.println("MEJOR ALUMNO POR ASIGNATURA");
        int notaMaxima =0;
        int mejorAlumnoAsignatura =0;
        for(int i=0;i<asignaturas.length;i++){
            notaMaxima=0;
            mejorAlumnoAsignatura =0;
            for(int j=0;j<alumnos.length;j++){
                if(notas[j][i]>=notaMaxima){
                    notaMaxima=notas[j][i];
                    mejorAlumnoAsignatura=j;
                }
            }
            System.out.println("La asignatura "+asignaturas[i]+" tiene como mejor alumno a "+alumnos[mejorAlumnoAsignatura]);
        }
    }
    private static void mejorAsignaturaAlumno(String[] alumnos,String[] asignaturas,int[][] notas) {
        System.out.println("MEJOR ASIGNATURA POR ALUMNO");
        int notaMaxima = 0;
        int mejorAsignaturaAlumno = 0;
        for (int i = 0; i < alumnos.length; i++) {
            notaMaxima = 0;
            mejorAsignaturaAlumno = 0;
            for (int j = 0; j < asignaturas.length; j++) {
                if (notas[i][j] >= notaMaxima) {
                    notaMaxima = notas[i][j];
                    mejorAsignaturaAlumno = j;
                }
            }
            System.out.println("Al alumno " + alumnos[i] + " tiene como mejor asignatura a " + asignaturas[mejorAsignaturaAlumno]);
        }
    }
}