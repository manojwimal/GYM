/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PrescribePayment.java
 *
 * Created on May 6, 2015, 7:29:40 PM
 */
package gym;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author ManoJ
 */
public class PrescribePayment extends javax.swing.JInternalFrame {

    /** Creates new form PrescribePayment */
    public PrescribePayment() {
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

        jLabel8 = new javax.swing.JLabel();
        tTFor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tPAmt = new javax.swing.JTextField();
        tPayNo = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        tTNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnClr = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnSearchT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Prescribe Payment");
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
            }
        });

        jLabel8.setText("Payment Amount :");

        tTFor.setEditable(false);
        tTFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTForActionPerformed(evt);
            }
        });

        jLabel13.setText("Member ID :");

        tPAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPAmtActionPerformed(evt);
            }
        });

        tPayNo.setEditable(false);
        tPayNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPayNoActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        tTNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTNoActionPerformed(evt);
            }
        });

        jLabel1.setText("Payment No :");

        btnClr.setText("Clear");
        btnClr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClrActionPerformed(evt);
            }
        });

        jLabel12.setText("Prescribe No :");

        btnSearchT.setText("Search");
        btnSearchT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchTActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Prescribe Payment");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tPayNo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(4, 4, 4)
                        .addComponent(tPAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnAdd)
                        .addGap(60, 60, 60)
                        .addComponent(btnClr)
                        .addGap(61, 61, 61)
                        .addComponent(btnExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tTNo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSearchT))
                            .addComponent(tTFor, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tPayNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel12))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tTNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearchT)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tTFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8))
                    .addComponent(tPAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd)
                    .addComponent(btnClr)
                    .addComponent(btnExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void tTForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTForActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_tTForActionPerformed

private void tPAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPAmtActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_tPAmtActionPerformed

private void tPayNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPayNoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_tPayNoActionPerformed


 Connection con;
Statement st;
String i;
String a,b,c,d,e,f,g;
	void set()
	{	try{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		String ds=("jdbc:odbc:GYM");
		con=DriverManager.getConnection(ds,"","");
		st=con.createStatement();
		}catch(Exception exc){JOptionPane.showMessageDialog(null,exc);}
	}
    	void search()
	{	set();

            try
		{
		ResultSet rs=st.executeQuery("select * from  PaymentT");
		while(rs.next())
		{       i=rs.getString(1);
			a=rs.getString(2);
                        b= rs.getString(3);
                        c= rs.getString(4);
                        d= rs.getString(5);
                                        
                }
		}catch(Exception hjhk){JOptionPane.showMessageDialog(null,hjhk);}
            
            Integer x = Integer.valueOf(i);         
            x=x+1;
            i = Integer.toString(x);
            tPayNo.setText(i); 
	}   
    
	void searchTrtm()
	{	set();

            try
		{
		ResultSet rs=st.executeQuery("select * from  PrescribeT");
		while(rs.next())
		{       i=rs.getString(1);
			a=rs.getString(2);
                        b= rs.getString(3);
                        c= rs.getString(4);
                        d= rs.getString(5);
                        
                        if(i.equals(tTNo.getText())){
                        tTFor.setText(a);
                        }

                }
		}catch(Exception hjhk){JOptionPane.showMessageDialog(null,hjhk);}

	}   

        
          void a(){
            try{       PreparedStatement pstmt = null;
               String sql = "UPDATE PrescribeT SET pNo=? WHERE presNo = ?";
               pstmt = con.prepareStatement(sql);
        
                  
                  pstmt.setString(1,tPayNo.getText() ); 
                  pstmt.setString(2,tTNo.getText()); 
                  pstmt.executeUpdate(); 

               
        
     
                con.close();
		}catch(Exception x){
                JOptionPane.showMessageDialog(null,x);}
        
        
        }

private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
               
                if (tPAmt.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Payment Amount Not Entered.");
                return;
                }
                if (tTNo.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Prescribe No Not Entered.");
                return;
                }           
                
                   
                String a1 = tPayNo.getText();
                String a2 = tPAmt.getText();               
                String a3 = tTNo.getText();
                //date to string
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                //set today date to string variable
                   Date date = new Date();
                  String stDate=dateFormat.format(date);
                     
    try{       
               PreparedStatement pstmt = null;
                String query = "insert into PaymentT(pNo,pAmt,pDate,pType,mmbrNo) values(?,?,?,?,?)";

     pstmt = con.prepareStatement(query); 
      pstmt.setString(1, a1); 
      pstmt.setString(2,a2 ); 
      pstmt.setString(3, stDate); 
      pstmt.setString(4, "Prescribe"); 
      pstmt.setString(5,tTNo.getText() ); 
 
      pstmt.executeUpdate(); 
     
     JOptionPane.showMessageDialog(null,"Prescribe Payment Added..!");
     
                a();
                con.close();
		}catch(Exception e3){
                JOptionPane.showMessageDialog(null,e3);}
    
}//GEN-LAST:event_btnAddActionPerformed

private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
this.dispose();// TODO add your handling code here:
}//GEN-LAST:event_btnExitActionPerformed

private void tTNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTNoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_tTNoActionPerformed

private void btnClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClrActionPerformed
tPAmt.setText("");
tTNo.setText(""); 
tTFor.setText("");


    // TODO add your handling code here:
}//GEN-LAST:event_btnClrActionPerformed

private void btnSearchTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchTActionPerformed
searchTrtm();
    
    // TODO add your handling code here:
}//GEN-LAST:event_btnSearchTActionPerformed

private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
search();// TODO add your handling code here:
}//GEN-LAST:event_formInternalFrameActivated

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClr;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSearchT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField tPAmt;
    private javax.swing.JTextField tPayNo;
    private javax.swing.JTextField tTFor;
    private javax.swing.JTextField tTNo;
    // End of variables declaration//GEN-END:variables
}