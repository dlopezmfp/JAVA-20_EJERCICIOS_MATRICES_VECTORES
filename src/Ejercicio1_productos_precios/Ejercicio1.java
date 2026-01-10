package Ejercicio1_productos_precios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        String[] productos = {
                "Alicates de corte",
                "Tijeras",
                "Guantes",
                "Bridas(100 uds.)",
                "Flexometro",
                "Grapas(50 uds.)",
                "Bote silicona",
                "Loctite(3gr)",
                "Martillo",
                "Juego llaves allen",
                "Llave inglesa",
                "Destornillador eléctrico Bosch",
                "Juego destornilladores marca Acme",
                "Nivel",
                "Alicates",
                "Multímetro digital",
                "Cable eléctrico(10 metros)",
                "Juego llaves fijas",
                "Reloj digital de pared",
                "ventilador de techo DC",
                "Taladro marca Makita"
        };
        int precios[] = new int[productos.length];
        int descuento = 0;
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<productos.length;i++) precios[i]=(int)(Math.floor(Math.random()*(11))+10);
        System.out.print("Indique cuál es la cuantía del descuento en tanto por ciento: ");
        descuento = sc.nextInt();
        System.out.println("El descuento seleccionado es: " + descuento+"%");
        verProductos(productos,precios);
        aplicarDescuento(descuento,precios);
        System.out.println("Los nuevos precios son: ");
        verProductos(productos,precios);
    }
    private static void aplicarDescuento(int descuento, int[] precios){
        for(int i=0;i<precios.length;i++){
            precios[i]=precios[i]-(precios[i]*descuento/100);
        }
    }
    private static void verProductos(String[] productos,int[] precios){
        for(int i =0;i< productos.length;i++){
            System.out.println("Producto: "+productos[i]+" Precio: "+precios[i]);
        }
    }
}
