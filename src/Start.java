/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danny
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alpha alpha = new Alpha();
        
        Beta beta = new Beta(alpha);
        Gamma gamma = new Gamma(alpha);
        
        System.out.println("Press Control-C to stop."); 
        
        beta.start();
        gamma.start();
    }
}
