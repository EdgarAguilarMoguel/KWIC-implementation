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
public class Formatter {
    
    public String[][] getCombinatios(String[] string) {
        int arraySize = string.length;
        String [][] combinations = new String[arraySize][arraySize];
        for (int k = 0; k < string.length; k++) {
            for (int i = 0; i < 1; i++) {
                int j;
                String last;
                last = string[string.length - 1];
                for (j = string.length - 1; j > 0; j--) {
                    string[j] = string[j - 1];
                }
                string[0] = last;
            }
            
            for (int j = 0; j < arraySize; j++) {
                combinations[k][j] = string[j];
            }
            
        }
        
        return combinations;
    }
}
