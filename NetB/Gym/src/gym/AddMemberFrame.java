/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AddMemberFrame.java
 *
 * Created on Mar 27, 2015, 5:18:16 PM
 */
package gym;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 *
 * @author ManoJ
 */
//import java.sql.*;

public class AddMemberFrame extends javax.swing.JInternalFrame {

    /** Creates new form AddMemberFrame */
    public AddMemberFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        txtMemNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMemName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMemAdrs = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMemWeight = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMemEmail = new javax.swing.JTextField();
        btnAddMember = new javax.swing.JButton();
        btnClr = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtMemGender = new javax.swing.JTextField();
        txtMemYr = new com.toedter.calendar.JDateChooser();
        today = new javax.swing.JLabel();

        setBorder(new javax.swing.border.SoftBevelBorder(0));
        setClosable(true);
        setTitle("Add Member");
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

        jLabel1.setText("Member No :");

        txtMemNo.setEditable(false);
        txtMemNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemNoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Add Member");

        jLabel3.setText("Name :");

        jLabel4.setText("Address :");

        jLabel5.setText("Date Of Birth :");

        jLabel6.setText("Gender :");

        jLabel7.setText("Weight :");

        jLabel8.setText("Email :");

        btnAddMember.setText("Add");
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

        txtMemYr.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtMemYr.setDateFormatString("yyyy-MM-dd");

        today.setText("Date: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(today, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(txtMemNo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)
                        .addGap(46, 46, 46)
                        .addComponent(txtMemName, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4)
                        .addGap(34, 34, 34)
                        .addComponent(txtMemAdrs, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5)
                        .addGap(10, 10, 10)
                        .addComponent(txtMemYr, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel6)
                        .addGap(38, 38, 38)
                        .addComponent(txtMemGender, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7)
                        .addGap(39, 39, 39)
                        .addComponent(txtMemWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8)
                        .addGap(49, 49, 49)
                        .addComponent(txtMemEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnAddMember)
                        .addGap(41, 41, 41)
                        .addComponent(btnClr)
                        .addGap(37, 37, 37)
                        .addComponent(btnExit)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(today)))
                    .addComponent(txtMemNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(txtMemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(txtMemAdrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5))
                    .addComponent(txtMemYr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(txtMemGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(txtMemWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8))
                    .addComponent(txtMemEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddMember)
                    .addComponent(btnClr)
                    .addComponent(btnExit))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void txtMemNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemNoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtMemNoActionPerformed

private void btnClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClrActionPerformed
// TODO add your handling code here:
                      
                        txtMemName.setText("");
                        txtMemAdrs.setText("");               
                        txtMemWeight.setText("");
                        txtMemEmail.setText("");
                        txtMemGender.setText("");                
                          
    
}//GEN-LAST:event_btnClrActionPerformed


Connection con;
Statement st;
String i,a;

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
		ResultSet rs=st.executeQuery("select * from  MemberT");
		while(rs.next())
		{
			i=rs.getString(1);
			a=rs.getString(2);
                        a= rs.getString(3);
                        a= rs.getString(4);
                        a = rs.getString(5);
                        a=rs.getString(6);
                        a=rs.getString(7);
                        a=rs.getString(8);
                        
		}
		}catch(Exception e){}
            
            Integer x = Integer.valueOf(i);         
            x=x+1;
            i = Integer.toString(x);
            txtMemNo.setText(i); 
	}

private void btnAddMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMemberActionPerformed
               
                if (txtMemName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Name Not Entered.");
                return;
                }
                if (txtMemAdrs.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Address Not Entered.");
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
                String MemName = txtMemName.getText();
                String MemAdrs = txtMemAdrs.getText();               
                String MemWeight = txtMemWeight.getText();
                String MemEmail = txtMemEmail.getText();
                String MemGender = txtMemGender.getText();
                //date to string
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String MemYear = dateFormat.format(txtMemYr.getDate());
                //set today date to string variable
                   Date date = new Date();
                  String reg=dateFormat.format(date);
    
    
    
    try{       
               PreparedStatement pstmt = null;
                String query = "insert into MemberT(memNo,memFN,memAd,memDOB,memGndr,memWght,memEml,memRegFor) values(?,?, ?, ?, ?, ?, ?, ? )";

     pstmt = con.prepareStatement(query); 
      pstmt.setString(1, i); 
      pstmt.setString(2,MemName ); 
      pstmt.setString(3, MemAdrs); 
      pstmt.setString(4,MemYear); 
      pstmt.setString(5,MemGender ); 
      pstmt.setString(6,MemWeight); 
      pstmt.setString(7,MemEmail); 
      pstmt.setString(8,reg); 
      pstmt.executeUpdate(); 
     JOptionPane.showMessageDialog(null,"Member Added..!");
                con.close();
		}catch(Exception e){
                JOptionPane.showMessageDialog(null,e);}
}//GEN-LAST:event_btnAddMemberActionPerformed

private void txtMemGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemGenderActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtMemGenderActionPerformed

private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
       //get the sys  date
       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
       Date date = new Date();
       today.setText("Date: "+dateFormat.format(date));
    
     search();
}//GEN-LAST:event_formInternalFrameActivated

private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
// TODO add your handling code here:
    
}//GEN-LAST:event_formInternalFrameOpened

private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
// TODO add your handling code here:
    this.dispose();
}//GEN-LAST:event_btnExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMember;
    private javax.swing.JButton btnClr;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel today;
    private javax.swing.JTextField txtMemAdrs;
    private javax.swing.JTextField txtMemEmail;
    private javax.swing.JTextField txtMemGender;
    private javax.swing.JTextField txtMemName;
    private javax.swing.JTextField txtMemNo;
    private javax.swing.JTextField txtMemWeight;
    private com.toedter.calendar.JDateChooser txtMemYr;
    // End of variables declaration//GEN-END:variables
}