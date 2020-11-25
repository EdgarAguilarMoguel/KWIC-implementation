/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwic;

import java.util.Scanner;

/**
 *
 * @author edgaraguilar
 */
public class Input {
    String string;

   public void setInput() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese cadena de texto");
       String scannedString = sc.nextLine();
       
       this.string = scannedString;
   }
   
   public String getString() {
       return this.string;
   }
    
}
