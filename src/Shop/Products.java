package Shop;

import com.sun.glass.events.KeyEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Products extends javax.swing.JFrame {
    Connection con;
    String qry;
    Statement sm;
    ResultSet rs;
    PreparedStatement pr;
     DefaultTableModel df;
    public Products() {
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

        myBtn5 = new Shop.MyBtn();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtqty = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        myBtn2 = new Shop.MyBtn();
        myBtn1 = new Shop.MyBtn();
        myBtn4 = new Shop.MyBtn();
        myBtn3 = new Shop.MyBtn();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        myBtn5.setForeground(new java.awt.Color(255, 255, 255));
        myBtn5.setText("Home");
        myBtn5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        myBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myBtn5ActionPerformed(evt);
            }
        });
        getContentPane().add(myBtn5);
        myBtn5.setBounds(1270, 10, 110, 50);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Stationary Items");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 70, 170, 28);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Item Code");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 170, 82, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Item Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 230, 86, 22);

        txtcode.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcodeKeyPressed(evt);
            }
        });
        getContentPane().add(txtcode);
        txtcode.setBounds(210, 150, 143, 36);

        txtname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(txtname);
        txtname.setBounds(210, 220, 143, 37);

        txtqty.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(txtqty);
        txtqty.setBounds(210, 370, 143, 38);

        txtprice.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(txtprice);
        txtprice.setBounds(210, 290, 143, 44);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 310, 39, 22);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Qty");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 380, 29, 22);

        myBtn2.setForeground(new java.awt.Color(255, 255, 255));
        myBtn2.setText("Delete");
        myBtn2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        myBtn2.setRadius(100);
        myBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myBtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(myBtn2);
        myBtn2.setBounds(390, 370, 96, 39);

        myBtn1.setForeground(new java.awt.Color(255, 255, 255));
        myBtn1.setText("Add");
        myBtn1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        myBtn1.setRadius(100);
        myBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(myBtn1);
        myBtn1.setBounds(400, 160, 65, 31);

        myBtn4.setForeground(new java.awt.Color(255, 255, 255));
        myBtn4.setText("Update");
        myBtn4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        myBtn4.setRadius(100);
        myBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myBtn4ActionPerformed(evt);
            }
        });
        getContentPane().add(myBtn4);
        myBtn4.setBounds(390, 300, 89, 40);

        myBtn3.setForeground(new java.awt.Color(255, 255, 255));
        myBtn3.setText("Clear");
        myBtn3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        myBtn3.setRadius(100);
        myBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myBtn3ActionPerformed(evt);
            }
        });
        getContentPane().add(myBtn3);
        myBtn3.setBounds(400, 230, 75, 40);

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Item Name", "Price", "Qty"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 460, 460, 190);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ELCOT\\Downloads\\mmm.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -100, 1400, 910);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myBtn5ActionPerformed
        Home ho=new Home();
        ho.show();
    }//GEN-LAST:event_myBtn5ActionPerformed

    private void myBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myBtn3ActionPerformed
        txtcode.setText("");
        txtname.setText("");
        txtprice.setText("");
        txtqty.setText("");
    }//GEN-LAST:event_myBtn3ActionPerformed

    private void myBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myBtn2ActionPerformed
            String id=txtcode.getText();
        try{
            sm=con.createStatement();
        qry="Delete From `items` where id="+id;
        pr=con.prepareStatement(qry);
        //pr.setString(1, itemcode);
        pr.execute();
         JOptionPane.showMessageDialog(null,"deleted");
         }
         catch(Exception ex){
             System.out.println("Error : "+ex);
             
         }
        //delete();
    }//GEN-LAST:event_myBtn2ActionPerformed

    private void myBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myBtn1ActionPerformed
        int price=Integer.parseInt(txtprice.getText());
        int qty=Integer.parseInt(txtqty.getText());
        df=(DefaultTableModel) jTable1.getModel();
        df.addRow(new Object[]
            {
                txtcode.getText(),
                txtname.getText(),
                txtprice.getText(),
                txtqty.getText().toString(),

            }
        );
        int sum=0;
        for(int i=0;i<jTable1.getRowCount();i++){
            sum=sum+Integer.parseInt(jTable1.getValueAt(i, 3).toString());
        }
        try{
            String sql="insert into items(id,itemname,price,qty) values(?,?,?,?)";
            pr=con.prepareStatement(sql);
            pr.setString(1, txtcode.getText());
            pr.setString(2, txtname.getText());
            pr.setString(3, txtprice.getText());
            pr.setString(4, txtqty.getText());
            pr.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"added");
        txtcode.setText("");
        txtname.setText("");
        txtprice.setText("");
        txtqty.setText("");
    }//GEN-LAST:event_myBtn1ActionPerformed

    private void myBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myBtn4ActionPerformed
      String id=txtcode.getText();
      String name=txtname.getText();
      String price=txtprice.getText();
      String qty=txtqty.getText();
      try{
           String sql="Update `items` set itemname="+name+", qty="+qty+",price="+price+" Where id="+id+" ";
            pr=con.prepareStatement(sql);
             pr.executeUpdate();
      } catch (SQLException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        }
       JOptionPane.showMessageDialog(null,"Updated");
      txtcode.setText("");
        txtname.setText("");
        txtprice.setText("");
        txtqty.setText("");
        txtcode.requestFocus();
    }//GEN-LAST:event_myBtn4ActionPerformed

    private void txtcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodeKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            try{
               String code=txtcode.getText();
               pr=con.prepareStatement("Select * from items Where id=?");
               pr.setString(1, code);
               rs=pr.executeQuery();
               if(rs.next()==false){
                   JOptionPane.showMessageDialog(this,"Item code not found");
               }
               else{
                   String itemname=rs.getString("itemname");
                   txtname.setText(itemname.trim());
                   String price=rs.getString("price");
                   txtprice.setText(price.trim());
                   String qty=rs.getString("qty");
                   txtqty.setText(qty.trim());
                   txtcode.requestFocus();
               }
               
           }
            catch(Exception ex){
                       System.out.println(ex);
                       }
               
    }                                  
    }//GEN-LAST:event_txtcodeKeyPressed
public void delete(String id){
         try{
        qry="Delete From police where id=?;";
        pr=con.prepareStatement(qry);
        pr.setString(1, id);
        pr.execute();
         }
         catch(Exception ex){
             System.out.println("Error : "+ex);
             
         }
     }
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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private Shop.MyBtn myBtn1;
    private Shop.MyBtn myBtn2;
    private Shop.MyBtn myBtn3;
    private Shop.MyBtn myBtn4;
    private Shop.MyBtn myBtn5;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtqty;
    // End of variables declaration//GEN-END:variables
}
