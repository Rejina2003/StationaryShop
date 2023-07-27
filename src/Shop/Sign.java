package Shop;

import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Sign extends javax.swing.JFrame {
    Connection con;
    String qry;
    PreparedStatement pr;
    public Sign() {
        initComponents();
        connect();
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

        myBtn1 = new Shop.MyBtn();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        uphone = new javax.swing.JTextField();
        upass = new javax.swing.JTextField();
        uemail = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        myBtn1.setForeground(new java.awt.Color(255, 255, 255));
        myBtn1.setText("Sign In");
        myBtn1.setColor1("#ffffff");
        myBtn1.setColor2("#000000");
        myBtn1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        myBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(myBtn1);
        myBtn1.setBounds(890, 570, 90, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Email Id");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(780, 440, 67, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(770, 390, 73, 22);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("User Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(770, 340, 85, 22);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Sign In");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(900, 270, 90, 28);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("Phone");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(800, 490, 49, 30);

        uphone.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        uphone.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(uphone);
        uphone.setBounds(900, 490, 200, 40);

        upass.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        upass.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(upass);
        upass.setBounds(900, 380, 200, 40);

        uemail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        uemail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(uemail);
        uemail.setBounds(900, 430, 200, 40);

        uname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        uname.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(uname);
        uname.setBounds(900, 330, 200, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\ELCOT\\Downloads\\log4.png")); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 1410, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myBtn1ActionPerformed
        try{
          String sql="insert into login(useName,pass,email,phone) values(?,?,?,?)";
          pr=con.prepareStatement(sql);
          pr.setString(1, uname.getText());
          pr.setString(2, upass.getText());
          pr.setString(3, uemail.getText());
          pr.setString(4, uphone.getText());
          pr.executeUpdate();
         
        } catch (SQLException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        }
          JOptionPane.showMessageDialog(null,"Sign In successfulllllll.....");
        try { 
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        }
       Login2 lo=new Login2();
       lo.show();
    }//GEN-LAST:event_myBtn1ActionPerformed
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Mental".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private Shop.MyBtn myBtn1;
    private javax.swing.JTextField uemail;
    private javax.swing.JTextField uname;
    private javax.swing.JTextField upass;
    private javax.swing.JTextField uphone;
    // End of variables declaration//GEN-END:variables
}
