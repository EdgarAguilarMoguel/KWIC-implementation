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
public class Sort {
    public String[][] ascSort(String[][] combinations) {
        Arrays.sort(combinations, new SortElements());
     
        return combinations;
    }
}
