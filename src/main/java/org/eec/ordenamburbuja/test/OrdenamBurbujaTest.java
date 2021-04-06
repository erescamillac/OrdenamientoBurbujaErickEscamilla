/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eec.ordenamburbuja.test;

import org.eec.arrays.utils.ArrayUtils;
/**
 *
 * @author erick
 */
public class OrdenamBurbujaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {51, 44, 52, 53, 46, 24};
        System.out.println("--Test Ordenamiento burbuja--");
        System.out.println("Arreglo ORIGINAL:");
        ArrayUtils.mostrarElementos(arreglo);
        System.out.println("Aplicando algoritmo de Ordenamiento por Burbuja...");
        ArrayUtils.ordenamientoBurbuja(arreglo);
        System.out.println("# DESPUÉS de haber ordenado el Arreglo:");
        ArrayUtils.mostrarElementos(arreglo);
    } //-- fin: métod main(args : String[])
    
} //-- fin: clase OrdenamBurbujaTest
