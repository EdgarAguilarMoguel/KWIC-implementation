/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwic;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author edgaraguilar
 */
public class KWIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Ingrese cadena de texto");
        
        String string = sc.nextLine();
        
        Input input = new Input(string);
        
        Divider devider = new Divider();
        
        String [] splitInput = devider.splitString(input.getString());
        
        Formatter formatter = new Formatter();
        
        String[][] combinations = formatter.getCombinatios(splitInput);
        
        Sort sort = new Sort();
        
        String[][] sortedCombinations = sort.ascSort(combinations);
        
        Output output = new Output();
        
        output.printArray(sortedCombinations);
    }
    
}
