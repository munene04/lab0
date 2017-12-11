

package labs2;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Labs2 {
    
 public static int ages[] = {20, 45, 47, 38, 35, 67, 18, 34};
 
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("The ages are:");
                
                for (int i=0; i<ages.length;i++){
                    System.out.println(ages[i]);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                for ( int c = 0; c < ages.length; c++ ){
               
             int a  = ages[c] - 18; 
             
             System.out.println("Number of years elapsed after acquiring id:\n" + a );
            }
            }
        });
        Thread t3 = new Thread(new Runnable() {

            @Override
            public void run() {
                  int ages[] = {20, 45, 47, 38, 35, 67, 18, 34};
            
            for ( int c = 0; c < ages.length; c++ ){
             
             int f = ((ages[c]+2)/5)-3;
             //(age-18)/5)+1
             System.out.println("Number of times voted: \n"+f);
             }
              
            }
        });
        /*
    t1.start();
    t2.start();
    t3.start();
                */
        t1.start();
     try {
         t1.join();
     } catch (InterruptedException ex) {
         Logger.getLogger(Labs2.class.getName()).log(Level.SEVERE, null, ex);
     }
     catch (Exception ex){
         
     }
     t2.start();
     t3.start();
    }
    
}
