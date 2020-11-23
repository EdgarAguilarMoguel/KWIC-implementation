/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwic;

import java.lang.reflect.Array;

/**
 *
 * @author edgaraguilar
 */
public class Divider {
    public String[] splitString(String string) {
        String[] arrOfStr = string.split(" ");
        return arrOfStr;
    }
}
