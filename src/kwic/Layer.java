/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwic;

/**
 *
 * @author edgaraguilar
 */
public class Layer {
    private Divider divider;
    private Formatter formatter;
    private Sort sort;
    
    public Layer() {
        divider = new Divider();
        formatter = new Formatter();
        sort = new Sort();
    }
    
    public String[][] executeLayer(String string){
        String[][] combinations = formatter.getCombinatios(divider.splitString(string));
        return sort.ascSort(combinations);
    }
}
