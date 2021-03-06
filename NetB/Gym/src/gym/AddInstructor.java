/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AddInstructor.java
 *
 * Created on May 5, 2015, 7:54:21 PM
 */
package gym;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ManoJ
 */
public class AddInstructor extends javax.swing.JInternalFrame {

    /** Creates new form AddInstructor */
    public AddInstructor() {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        iID = new javax.swing.JTextField();
        iAdd = new javax.swing.JTextField();
        iName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        iMob = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        btnClr = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        setClosable(true);
        setTitle("Add Instructor");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel5.setText("Mobile No :");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Add Instructor");

        jLabel2.setText("Instructor ID :");

        iID.setEditable(false);
        iID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iIDActionPerformed(evt);
            }
        });

        jLabel4.setText("Address :");

        jLabel3.setText("Name :");

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnClr.setText("Clear");
        btnClr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClrActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(iMob, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(iAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(37, 37, 37)
                                .addComponent(iName, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)))))
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iID, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addGap(46, 46, 46)
                .addComponent(btnClr)
                .addGap(45, 45, 45)
                .addComponent(btnExit)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iMob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClr)
                    .addComponent(btnAdd)
                    .addComponent(btnExit))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void iIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iIDActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_iIDActionPerformed

private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
this.dispose();
    
    // TODO add your handling code here:
}//GEN-LAST:event_btnExitActionPerformed

private void btnClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClrActionPerformed
                iName.setText("");
                iAdd.setText(""); 
                iMob.setText("");
search();
    
    
    // TODO add your handling code here:
}//GEN-LAST:event_btnClrActionPerformed

    Connection con;
Statement st;
String i,a,b,c,d;

	void set()
	{	try{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		String ds=("jdbc:odbc:GYM");
		con=DriverManager.getConnection(ds,"","");
		st=con.createStatement();
		}catch(Exception e){JOptionPane.showMessageDialog(null,e);}
	}
    	void search()
	{	set();
             try
		{
		ResultSet rs=st.executeQuery("select * FROM  InstructorT");
		while(rs.next())
		{
			i=rs.getString(1);
			a=rs.getString(2);
                        b=rs.getString(3);
                        c=rs.getString(4);

                                       System.out.println("no" +i);
            System.out.println("namr "+a);
            System.out.println("adrs "+b);
                    }
		}catch(Exception e){JOptionPane.showMessageDialog(null,e);}
            
            Integer x = Integer.valueOf(i);         
            x=x+1;
            i = Integer.toString(x);
            iID.setText(i); 

            

	}
private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
                    if (iName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Name Not Entered.");
                return;
                }  
                     if (iAdd.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Address Not Entered.");
                return;
                }
                      if (iMob.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Mobile No Not Entered.");
                return;
                }

                
                try{       
               PreparedStatement pstmt = null;
                String query = "insert into InstructorT(insId,insName,insAdd,insMob) values( ?, ?, ?, ?)";

     pstmt = con.prepareStatement(query); 
      pstmt.setString(1, i); 
      pstmt.setString(2,iName.getText() ); 
      pstmt.setString(3, iAdd.getText()); 
      pstmt.setString(4,iMob.getText()); 
      pstmt.executeUpdate(); 
     JOptionPane.showMessageDialog(null,"Instructor Added..!");
                con.close();
		}catch(Exception e){
                JOptionPane.showMessageDialog(null,e);}
    
    
    
    
    
    
    
    
    
    
    
    
    // TODO add your handling code here:
}//GEN-LAST:event_btnAddActionPerformed

private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
search();
     // TODO add your handling code here:
}//GEN-LAST:event_formInternalFrameActivated

private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
// TODO add your handling code here:
}//GEN-LAST:event_formInternalFrameOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClr;
    private javax.swing.JButton btnExit;
    private javax.swing.JTextField iAdd;
    private javax.swing.JTextField iID;
    private javax.swing.JTextField iMob;
    private javax.swing.JTextField iName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
