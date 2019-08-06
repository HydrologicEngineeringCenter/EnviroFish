/*
 * EvfCatagory.java
 *
 * Created on November 23, 2007, 12:42 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package envirofish;

/**
 *
 * @author Donald Johnson
 */
public class EvfCatagory {
    
    /** Creates a new instance of EvfCatagory */
    public EvfCatagory() 
    {
        name = "";
        amount = 0.0;
    }
    
    public EvfCatagory(String n, double a)
    {
        name = n;
        amount = a;
    }
    
    public String getName() { return name; }
    public double getAmount() { return amount; }
    
    public void setName(String n) { name = n; }
    public void setAmount(double a) { amount = a; }
    
    private String name;
    private double amount;
    
}
