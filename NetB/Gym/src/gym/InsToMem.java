/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * InsToMem.java
 *
 * Created on Apr 1, 2015, 4:44:54 PM
 */
package gym;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ManoJ
 */
public class InsToMem extends javax.swing.JInternalFrame {

    /** Creates new form InsToMem */
    public InsToMem() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtMemId = new javax.swing.JTextField();
        memSrch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtMemName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtInsId = new javax.swing.JTextField();
        insSrch = new javax.swing.JButton();
        txtInsName = new javax.swing.JTextField();
        btnAs = new javax.swing.JButton();
        btnEx = new javax.swing.JButton();
        btnCl = new javax.swing.JButton();

        setBorder(new javax.swing.border.SoftBevelBorder(0));
        setClosable(true);
        setTitle("Assign Instructor");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel2.setText("Assign Instructor ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel1.setText("Member ID :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, -1, -1));
        getContentPane().add(txtMemId, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 58, 99, -1));

        memSrch.setText("Search");
        memSrch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memSrchActionPerformed(evt);
            }
        });
        getContentPane().add(memSrch, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 57, -1, -1));

        jLabel3.setText("Member Name :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 89, -1, -1));
        getContentPane().add(txtMemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 86, 174, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 117, 315, 10));

        jLabel4.setText("Instructor Name :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel5.setText("Instructor ID :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 137, -1, -1));
        getContentPane().add(txtInsId, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 134, 99, -1));

        insSrch.setText("Search");
        insSrch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insSrchActionPerformed(evt);
            }
        });
        getContentPane().add(insSrch, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 133, -1, -1));
        getContentPane().add(txtInsName, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 167, 174, -1));

        btnAs.setText("Assign");
        btnAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsActionPerformed(evt);
            }
        });
        getContentPane().add(btnAs, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 233, -1, -1));

        btnEx.setText("Exit");
        btnEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExActionPerformed(evt);
            }
        });
        getContentPane().add(btnEx, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 233, -1, -1));

        btnCl.setText("Clear");
        btnCl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClActionPerformed(evt);
            }
        });
        getContentPane().add(btnCl, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 233, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    Connection con;
Statement st;
String i;
String a,b,c,d,e,f;

	void set()
	{	try{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		String ds=("jdbc:odbc:GYM");
		con=DriverManager.getConnection(ds,"","");
		st=con.createStatement();
		}catch(Exception e){}
	}
    	void search1(String z)
	{	set();
            try
		{
		ResultSet rs=st.executeQuery("select * from  MemberT");
		while(rs.next())
		{       i=rs.getString(1);
			a=rs.getString(2);
                        b= rs.getString(3);
                        c= rs.getString(4);
                        d = rs.getString(5);
                        e=rs.getString(6);
                        f=rs.getString(7);
                        
                       if( i.equals(z)){
                        txtMemId.setText(z);
                        txtMemName.setText(a);                                                                                              
                      }                               
                }
		}catch(Exception ex){}
	}

        
        void search2(String z)
	{	set();
            try
		{
		ResultSet rs=st.executeQuery("select * from  InstructorT");
		while(rs.next())
		{       i=rs.getString(1);
			a=rs.getString(2);
                        b= rs.getString(3);
                        c= rs.getString(4);
                      
                        
                       if( i.equals(z)){
                        txtInsName.setText(a);                                                                                                               
                      }                               
                }
		}catch(Exception exc){}
	}


    
    
    
    
    
    
    
private void memSrchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memSrchActionPerformed
// TODO add your handling code here:
      if (txtMemId.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Member ID Not Entered.");
                return;
                }  
    
     String mId = txtMemId.getText();
    search1(mId);  
    
   
}//GEN-LAST:event_memSrchActionPerformed

private void insSrchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insSrchActionPerformed
  if (txtInsId.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Instructor ID Not Entered.");
                return;
                }  
    String iId = txtInsId.getText();
    search2(iId); 
    
    // TODO add your handling code here:
}//GEN-LAST:event_insSrchActionPerformed

private void btnAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsActionPerformed
                String MemId = txtMemId.getText(); 
                String MemName = txtMemName.getText(); 
                String InsId= txtInsId.getText();             
                
            if (txtInsId.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Instructor ID Not Entered.");
                return;
                }  
            
              if (txtMemId.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Member ID Not Entered.");
                return;
                }  
              
                
                try{       
               PreparedStatement pstmt = null;
                String query = "insert into MemIns(memID,insID) values(?, ?)";

     pstmt = con.prepareStatement(query); 
      pstmt.setString(1, MemId); 
      pstmt.setString(2,InsId ); 
      pstmt.executeUpdate(); 
     JOptionPane.showMessageDialog(null,"Instructor Assign To "+MemName+"..!");
                con.close();
		}catch(Exception exc){JOptionPane.showMessageDialog(null,exc);}    
    
    

    
    
    // TODO add your handling code here:
}//GEN-LAST:event_btnAsActionPerformed

private void btnClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClActionPerformed
txtMemId.setText("");
txtMemName.setText("");
txtInsId.setText("");
txtInsName.setText("");
    
    
    // TODO add your handling code here:
}//GEN-LAST:event_btnClActionPerformed

private void btnExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExActionPerformed

    this.dispose();
    
    // TODO add your handling code here:
}//GEN-LAST:event_btnExActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAs;
    private javax.swing.JButton btnCl;
    private javax.swing.JButton btnEx;
    private javax.swing.JButton insSrch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton memSrch;
    private javax.swing.JTextField txtInsId;
    private javax.swing.JTextField txtInsName;
    private javax.swing.JTextField txtMemId;
    private javax.swing.JTextField txtMemName;
    // End of variables declaration//GEN-END:variables
}
