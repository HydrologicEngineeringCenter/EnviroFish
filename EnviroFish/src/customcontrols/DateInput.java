/*
 * DateInput.java
 *
 * Created on March 31, 2005, 2:28 PM
 */

package customcontrols;

/**
 *
 * @author  b4edhdwj
 */
public class DateInput extends javax.swing.JPanel {
    
    /** Creates new form DateInput */
    public DateInput() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        monthModel = new javax.swing.DefaultComboBoxModel(months);
        jMonthDisplayBox = new javax.swing.JComboBox(monthModel);
        dayModel = new javax.swing.DefaultComboBoxModel(days);
        jDayDisplayBox = new javax.swing.JComboBox(dayModel);

        setLayout(new java.awt.GridBagLayout());

        setPreferredSize(new java.awt.Dimension(48, 24));
        jMonthDisplayBox.setEditable(true);
        jMonthDisplayBox.setPreferredSize(new java.awt.Dimension(24, 22));
        jMonthDisplayBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMonthDisplayBoxActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 1);
        add(jMonthDisplayBox, gridBagConstraints);

        jDayDisplayBox.setEditable(true);
        jDayDisplayBox.setPreferredSize(new java.awt.Dimension(24, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        add(jDayDisplayBox, gridBagConstraints);

    }//GEN-END:initComponents

    private void jMonthDisplayBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMonthDisplayBoxActionPerformed
        String selection = (String) jMonthDisplayBox.getSelectedItem();
        
        if(selection.equals("Feb"))
        {
            remove31();
            remove30();
        }
        else if(selection.equals("Apr") || selection.equals("Jun") ||
                selection.equals("Sep") || selection.equals("Nov") )
        {
            add30();
            remove31();
        }
        else
        {
            add30();
            add31();
        }
    }//GEN-LAST:event_jMonthDisplayBoxActionPerformed
    
    void remove31()
    {
        dayModel.removeElement("31");
    }
    
    void remove30()
    {
        dayModel.removeElement("30");
    }
    
    void add30()
    {
        if ( dayModel.getIndexOf("30") == -1 )
        {
            dayModel.addElement("30");
        }
    }
    
    void add31()
    {
        if ( dayModel.getIndexOf("31") == -1 )
        {
            dayModel.addElement("31");
        }
    }
    
    /** Get the String Abrevation for the month */
    
    public String getMonthString()
    {
        return (String) jMonthDisplayBox.getSelectedItem();
    }
    
    /** Get the number of the mounth 1..12 */
    
    public int getMonthInt()
    {
        int pos=  jMonthDisplayBox.getSelectedIndex();
        return pos + 1;
    }
    
    /* Get the day as a numberic string */
    
    public String getDayString()
    {
        return  (String) jDayDisplayBox.getSelectedItem();
    }
    
    /* Get the day as an int */
    
    public int getDayInt()
    {
        int pos=  jDayDisplayBox.getSelectedIndex();
        return pos + 1;
    }
    
    /** Set the month with an int [1,12] 
        Values outside of the valid range are ignored */
    
    public void setMonth(int i)
    {
        if ( i >= 1 && i <= 12)
        {
            jMonthDisplayBox.setSelectedIndex(i-1);
        }
    }
 
     /** Set the month with an abrevation string 
      *  unkown abrevations are ignored are ignored 
      *  legal strings are "Jan","Feb","Mar","Apr","May",
      *  "Jun","Jul","Aug","Sep","Oct","Nov","Dec"} */   
    
    public void setMonth(String str)
    {
        int pos = monthModel.getIndexOf(str);
        
        if(pos != -1)
        {
            jMonthDisplayBox.setSelectedIndex(pos);
        }
    }
    
    public void setDay(int d)
    {
        int pos = dayModel.getIndexOf(Integer.toString(d));
        
        if(pos != -1)
        {
            jDayDisplayBox.setSelectedIndex(pos);
        }        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jDayDisplayBox;
    private javax.swing.JComboBox jMonthDisplayBox;
    // End of variables declaration//GEN-END:variables
    
    //user variables
    
    String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    String[] days = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16",
                  "17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
                  
    javax.swing.DefaultComboBoxModel dayModel;
    javax.swing.DefaultComboBoxModel monthModel;
    
}
