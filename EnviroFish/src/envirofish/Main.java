/*
 * Main.java
 *
 * Created on April 1, 2005, 8:16 AM
 */

package envirofish;

/**
 *
 * @author b4edhdwj
 */
public class Main {
    
    /** Creates a new instance of Main */
    public Main() {
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        }); 
    }
    
}
