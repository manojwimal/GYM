/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UpPhysiotherapist.java
 *
 * Created on May 5, 2015, 9:54:57 AM
 */
package gym;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ManoJ
 */
public class UpPhysiotherapist extends javax.swing.JInternalFrame {

    /** Creates new form UpPhysiotherapist */
    public UpPhysiotherapist() {
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

        btnAdd2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        iID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnClr = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        iAdd = new javax.swing.JTextField();
        iName = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setClosable(true);
        setTitle("Update Physiotherapist");

        btnAdd2.setText("Update");
        btnAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Update Physiotherapist");

        jLabel2.setText("Physiotherapist ID :");

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        iID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iIDActionPerformed(evt);
            }
        });

        jLabel3.setText("Name :");

        btnClr.setText("Clear");
        btnClr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClrActionPerformed(evt);
            }
        });

        jLabel4.setText("Address :");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(66, 66, 66)
                                .addComponent(iName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(54, 54, 54)
                                .addComponent(iAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(iID, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearch))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnAdd2)
                        .addGap(46, 46, 46)
                        .addComponent(btnClr)
                        .addGap(46, 46, 46)
                        .addComponent(btnExit)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(iID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3))
                    .addComponent(iName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4))
                    .addComponent(iAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExit)
                        .addComponent(btnClr)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

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
		}catch(Exception e){JOptionPane.showMessageDialog(null,e);}
	}
    	void search(String z)
	{	set();
 try
		{
		ResultSet rs=st.executeQuery("select * from  PhysiotherapistT");
		while(rs.next())
		{   
			i=rs.getString(1);
			a=rs.getString(2);
                        b= rs.getString(3);
                        
                       if( i.equals(z)){
                        iID.setText(z);
                        iName.setText(a);
                        iAdd.setText(b);                                                                         
                      }                               
                }
		}catch(Exception ex){}
	}

 
    
private void btnAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd2ActionPerformed
                    if (iName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Name Not Entered.");
                return;
                }  
                     if (iAdd.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Address Not Entered.");
                return;
                }

                String No = iID.getText();
                String Name = iName.getText();
                String Adrs = iAdd.getText();                         
       
    
    try{       PreparedStatement pstmt = null;
               String sql = "UPDATE PhysiotherapistT SET phtpName=?,phtpAdd=? WHERE phtpId = ?";
               pstmt = con.prepareStatement(sql);
        
                  
                  pstmt.setString(1,Name ); 
                  pstmt.setString(2, Adrs);  
                  pstmt.setString(3,No); 
                  pstmt.executeUpdate(); 

               
        
     JOptionPane.showMessageDialog(null,"Physiotherapist "+Name+" Updated..!");
                con.close();
		}catch(Exception x){
                JOptionPane.showMessageDialog(null,x);}
    
                      
                      
                   
    
    // TODO add your handling code here:
}//GEN-LAST:event_btnAdd2ActionPerformed

private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
this.dispose();
    
    // TODO add your handling code here:
}//GEN-LAST:event_btnExitActionPerformed

private void iIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iIDActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_iIDActionPerformed

private void btnClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClrActionPerformed
                iName.setText("");
                iAdd.setText(""); 
    
    
    // TODO add your handling code here:
}//GEN-LAST:event_btnClrActionPerformed

private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
// TODO add your handling code here:
    
    String No = iID.getText();
    search(No);
    
    
    
    
}//GEN-LAST:event_btnSearchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd2;
    private javax.swing.JButton btnClr;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTextField iAdd;
    private javax.swing.JTextField iID;
    private javax.swing.JTextField iName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
