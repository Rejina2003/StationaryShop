package Shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login2 extends javax.swing.JFrame {
    Connection con;
    String qry;
    PreparedStatement pr;
    Statement sm;
    ResultSet rs;
    public Login2() {
        initComponents();
        connect();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
public void connect(){
        String url,uname,pwd;
         try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         url="jdbc:mysql://localhost:3306/stationaryshop";
         uname="rejina";
         pwd="rejina";
         con=DriverManager.getConnection(url, uname, pwd);
         }
         catch(Exception ex){
             System.out.println("Error : "+ex);
         }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtuname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        btnedit = new Shop.MyBtn();
        myBtn2 = new Shop.MyBtn();
        myBtn1 = new Shop.MyBtn();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LAKSHMI STATIONERY SHOP");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 90, 502, 42);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 250, 280, 42);

        txtuname.setBackground(new java.awt.Color(204, 204, 255));
        txtuname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtuname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtunameActionPerformed(evt);
            }
        });
        getContentPane().add(txtuname);
        txtuname.setBounds(340, 330, 195, 38);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 330, 113, 29);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 400, 98, 28);

        txtpass.setBackground(new java.awt.Color(204, 204, 255));
        txtpass.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(txtpass);
        txtpass.setBounds(340, 400, 190, 37);

        btnedit.setText("Reset");
        btnedit.setColor1("#ffffff");
        btnedit.setColor2("#000000");
        btnedit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        getContentPane().add(btnedit);
        btnedit.setBounds(360, 490, 118, 39);

        myBtn2.setText("Login");
        myBtn2.setColor1("#ffffff");
        myBtn2.setColor2("#000000");
        myBtn2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        myBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myBtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(myBtn2);
        myBtn2.setBounds(200, 490, 118, 39);

        myBtn1.setForeground(new java.awt.Color(255, 255, 255));
        myBtn1.setText("Sign In");
        myBtn1.setColor1("#ffffff");
        myBtn1.setColor2("#000000");
        myBtn1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        myBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(myBtn1);
        myBtn1.setBounds(1217, 60, 130, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\ELCOT\\Downloads\\log2.png")); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, -30, 1420, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myBtn1ActionPerformed
       Sign sn=new Sign();
       sn.show();
    }//GEN-LAST:event_myBtn1ActionPerformed

    private void txtunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtunameActionPerformed

    }//GEN-LAST:event_txtunameActionPerformed

    private void myBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myBtn2ActionPerformed
        String uname= txtuname.getText();
        String pass= txtpass.getText();
      try {
          sm=con.createStatement();
        String qry="Select * From login Where useName='"+uname+"' And pass='"+pass+"' ";
        rs=sm.executeQuery(qry);
        if(rs.next()){
            //JOptionPane.showMessageDialog(this,"Login Success");
            Home ho=new Home();
            ho.show();
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(this,"Failed Try Again");
            txtuname.setText(" ");
            txtpass.setText(" ");
            txtuname.requestFocus();

        }
        } catch (SQLException ex) {
          Logger.getLogger(Login2.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_myBtn2ActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        txtuname.setText("");
        txtpass.setText("");
    }//GEN-LAST:event_btneditActionPerformed

    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Shop.MyBtn btnedit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private Shop.MyBtn myBtn1;
    private Shop.MyBtn myBtn2;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuname;
    // End of variables declaration//GEN-END:variables

}
