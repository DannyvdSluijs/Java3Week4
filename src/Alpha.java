/**
 *
 * @author danny
 */
public class Alpha
{

    int teller;  
    
    synchronized void telOp()
    {
        this.teller++;
        
        if (this.teller == 5) {
            try { 
                this.wait(); 
            } catch(InterruptedException e) { 
                //System.out.println(e); 
            }
        }
    }
    
    synchronized void telAf()
    {
        this.teller--;
        
        if (this.teller == 0) {
            this.notifyAll();
        }
    }
    
}