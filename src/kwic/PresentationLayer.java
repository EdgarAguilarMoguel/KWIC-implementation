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
public class PresentationLayer {
    private Input input;
    private Output output;
    
    public PresentationLayer() {
        input = new Input();
        output = new Output();
    }
    
    public void executeLayer() {
        input.setInput();
        Layer layer = new Layer();
        String[][] response = layer.executeLayer(input.getString());
        output.printArray(response);
    }
    
}
