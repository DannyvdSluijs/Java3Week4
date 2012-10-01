/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danny
 */
public class Gamma
    extends Thread 
{

    Alpha main;
    
    public Gamma(Alpha main)
    {
        this.main = main;
    }
    
    public void run ()
    {
        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                //System.out.println(e);

            }
            
            main.telAf();
            
            System.out.print(main.teller + " ");
        }
    }   
    
}
