/*
 * EvfCatagoryTabelModel.java
 *
 * Created on November 23, 2007, 12:47 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package envirofish;

import javax.swing.table.*;

import java.util.*;
/**
 *
 * @author Donald Johnson
 */
public class EvfCatagoryTabelModel extends AbstractTableModel{
    
    /** Creates a new instance of EvfCatagoryTabelModel */
    public EvfCatagoryTabelModel(ArrayList<EvfCatagory> d) 
    {
        data = d;
    }
    
    public Object getValueAt(int row, int col)
    {
        if ( 0 <= row && row < data.size() )
        {
            switch(col)
            {
                case 0:
                    return data.get(row).getName();
                    
                case 1:
                    return data.get(row).getAmount();
                    
                default:
                    return "";
            }
        }
        else
        {
            return "";
        }  
    }
    
    public int getColumnCount()
    {
        return 2;
    }
    
    public int getRowCount()
    {
        return data.size();
    }
    
    public Class getColumnClass(int col)
    {
       switch(col)
       {
           case 0:
               return String.class;
           case 1:
               return Double.class;
           default:
               return Object.class;
           
       }
    }
    
    public String getColumnName(int col)
    {
        switch(col)
        {
            case 0:
                return "Catagory";
            case 1:
                return "Value";
            default:
                return "";
        }
    }
    
    public void setValueAt(Object o, int row, int col)
    {
        if ( 0 <= row && row < data.size() )
        {
            switch( col )
            {
                case 0:
                    data.get(row).setName((String) o);
                    break;
                case 1:
                    data.get(row).setAmount((Double) o);
                    break;
                default:
                    ;
            }
        }
    }
    
    public boolean isCellEditable(int row, int col)
    {
        return true;
    }
    
    public void clear()
    {
        data.clear();
        fireTableDataChanged();
    }
    
    private ArrayList<EvfCatagory> data;
    
}
