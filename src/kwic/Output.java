/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwic;

import java.util.Arrays;

/**
 *
 * @author edgaraguilar
 */
public class Output {
    public void printArray(String[][] combinations) {
        System.out.println("Imprimiendo Combinaciones ordenadas:");
        for (int i = 0; i < combinations.length; i++) {
            System.out.println(Arrays.toString(combinations[i]));
        }
    }
}
