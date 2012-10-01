/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danny
 */
public class Beta 
    extends Thread
{
    Alpha main;
    
    public Beta(Alpha main)
    {
        this.main = main;
    }
    
    public void run ()
    {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //System.out.println(e);
            }
            main.telOp();
            System.out.print(main.teller + " ");
        }
    }
    
}
