/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UpdateMember.java
 *
 * Created on Mar 28, 2015, 9:01:15 PM
 */
package gym;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ManoJ
 */
public class UpdateMember extends javax.swing.JInternalFrame {

    /** Creates new form UpdateMember */
    public UpdateMember() {
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

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMemEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAddMember = new javax.swing.JButton();
        txtMemAdrs = new javax.swing.JTextField();
        btnClr = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        txtMemName = new javax.swing.JTextField();
        txtMemGender = new javax.swing.JTextField();
        txtMemNo = new javax.swing.JTextField();
        txtMemYr = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMemWeight = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();

        setBorder(new javax.swing.border.SoftBevelBorder(0));
        setClosable(true);
        setTitle("Update Member");
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

        jLabel6.setText("Gender :");

        jLabel7.setText("Weight :");

        jLabel5.setText("Date Of Birth :");

        jLabel8.setText("Email :");

        jLabel4.setText("Address :");

        btnAddMember.setText("Update");
        btnAddMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMemberActionPerformed(evt);
            }
        });

        btnClr.setText("Clear");
        btnClr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClrActionPerformed(evt);
            }
        });

        jLabel3.setText("Name :");

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtMemGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemGenderActionPerformed(evt);
            }
        });

        txtMemNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemNoActionPerformed(evt);
            }
        });

        txtMemYr.setText("YYYY - MM - DD");
        txtMemYr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemYrActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel2.setText("Update Member");

        jLabel1.setText("Member No :");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(btnAddMember)
                                .addGap(41, 41, 41)
                                .addComponent(btnClr)
                                .addGap(37, 37, 37)
                                .addComponent(btnExit))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMemNo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMemYr, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMemEmail)
                                        .addComponent(txtMemWeight)
                                        .addComponent(txtMemGender, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMemName, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                        .addComponent(txtMemAdrs)))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMemNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMemAdrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemYr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMemGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMemWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMemEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnClr)
                    .addComponent(btnAddMember))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btnAddMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMemberActionPerformed

    if (txtMemName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Name Not Entered.");
                return;
                }
                if (txtMemAdrs.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Address Not Entered.");
                return;
                }
                if (txtMemYr.getText().equals("YYYY-MM-DD")){
                JOptionPane.showMessageDialog(null,"DOB Not Entered.");
                return;
                }                
                
                if (txtMemGender.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Gender Not Entered.");
                return;
                }                
                if (txtMemWeight.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Weight Not Entered.");
                return;
                }                             
                if (txtMemEmail.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Email Not Entered.");
                return;
                }  
                String MemNo = txtMemNo.getText();
                String MemName = txtMemName.getText();
                String MemAdrs = txtMemAdrs.getText();               
                String MemWeight = txtMemWeight.getText();
                String MemEmail = txtMemEmail.getText();
                String MemGender = txtMemGender.getText();
                String MemYear = txtMemYr.getText();             
                            
                //System.out.print(dob);
                //System.out.println(dob);System.out.println(MemName);System.out.println(MemAdrs);System.out.println(MemWeight);
                //   System.out.println(MemEmail);System.out.println(MemGender);
    
    
    
    try{       PreparedStatement pstmt = null;
               String sql = "UPDATE MemberT SET memFN=?,memAd=?,memDOB=?,memGndr=?,memWght=?,memEml=? WHERE memNo = ?";
               pstmt = con.prepareStatement(sql);
        
                  
                  pstmt.setString(1,MemName ); 
                  pstmt.setString(2, MemAdrs); 
                  pstmt.setString(3,MemYear); 
                  pstmt.setString(4,MemGender ); 
                  pstmt.setString(5,MemWeight); 
                  pstmt.setString(6,MemEmail); 
                  pstmt.setString(7,MemNo ); 
                  pstmt.executeUpdate(); 

               
        
     JOptionPane.showMessageDialog(null,"Member "+MemName+" Updated..!");
                con.close();
		}catch(Exception x){
                JOptionPane.showMessageDialog(null,x);}
    
    
}//GEN-LAST:event_btnAddMemberActionPerformed

private void btnClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClrActionPerformed
// TODO add your handling code here:
                        txtMemNo.setText("");
                        txtMemName.setText("");
                        txtMemAdrs.setText("");               
                        txtMemWeight.setText("");
                        txtMemEmail.setText("");
                        txtMemGender.setText("");                
                        txtMemYr.setText("YYYY-MM-DD");  
}//GEN-LAST:event_btnClrActionPerformed

private void txtMemGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemGenderActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtMemGenderActionPerformed

private void txtMemNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemNoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtMemNoActionPerformed

private void txtMemYrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemYrActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtMemYrActionPerformed

private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
// TODO add your handling code here:
         
    
    
}//GEN-LAST:event_formInternalFrameActivated

private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
// TODO add your handling code here:
  
}//GEN-LAST:event_formInternalFrameOpened


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
		}catch(Exception m){JOptionPane.showMessageDialog(null,m);}
	}
    	void search(String z)
	{	set();String ss;
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
                        ss=rs.getString(8);
                        
                       if( i.equals(z)){
                        txtMemNo.setText(z);
                        txtMemName.setText(a);
                        txtMemAdrs.setText(b);               
                        txtMemWeight.setText(e);
                        txtMemEmail.setText(f);
                        txtMemGender.setText(d);                
                        txtMemYr.setText(c);                                                                          
                      }                               
                }
		}catch(Exception ex){}
	}




private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
// TODO add your handling code here:
    
    String MemNo = txtMemNo.getText();
    search(MemNo);
    
    
    
    
}//GEN-LAST:event_btnSearchActionPerformed

private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
this.dispose();// TODO add your handling code here:
}//GEN-LAST:event_btnExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMember;
    private javax.swing.JButton btnClr;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtMemAdrs;
    private javax.swing.JTextField txtMemEmail;
    private javax.swing.JTextField txtMemGender;
    private javax.swing.JTextField txtMemName;
    private javax.swing.JTextField txtMemNo;
    private javax.swing.JTextField txtMemWeight;
    private javax.swing.JTextField txtMemYr;
    // End of variables declaration//GEN-END:variables
}