/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwic;

import java.util.Comparator;

/**
 *
 * @author edgaraguilar
 */
public class SortElements implements Comparator<String[]>{
    public int compare(String[] a, String[] b) {
        return a[0].compareTo(b[0]);

    }
}
