/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eec.arrays.utils;

/**
 *
 * @author erick
 */
public class ArrayUtils {
    
    public static void mostrarElementos(int[] array){
        System.out.print("\nArreglo : [");
        for(int element : array){
            System.out.print(element + " ,");
        }
        System.out.print("]\n");
    } //-- fin: de método mostrarElementos(array : int[])
    
    public static void ordenamientoBurbuja(int[] array){
        int n, burbuja;
        n = array.length;
        for(int i = 0; i < n - 1; i++){
            System.out.println("--PASADA: " + (i+1));
            System.out.println("# Índice límite SUPERIOR (Excluyente 'x' < [indiceLimSup]): " + (n-i-1));
            for(int j = 0; j < n - i - 1; j++){
                System.out.println(String.format("EVALUANDO (array[%d] > array[%d])... ([%d] > [%d])? ", j, j+1, array[j], array[j+1]));
                if(array[j] > array[j+1]){
                    // INTERCAMBIO de Elementos:
                    burbuja = array[j+1];
                    System.out.println(String.format("Burbuja [%d]", burbuja));
                    System.out.println("Se realiza el INTERCAMBIO.");
                    // elemento más "Pesado" se va al "Fondo" (más hacia la DERECHA):
                    array[j+1] = array[j];
                    // elemento más "LIVIANO" ('burbuja') se va a la "Superficie" (hacia la IZQ.)
                    array[j] = burbuja;
                }else{
                    System.out.println("NO se realiza Intercambio alguno.");
                }
                mostrarElementos(array);
            } // -- fin: FOR comparación de posiciones ADYACENTES ("Recorte" de Índice límite superior [n-i-1])
        } // -- fin: FOR externo PASADAS
    } //-- fin: método ordenamientoBurbuja(array : int[])
    
} // -- fin: clase ArrayUtils
