package Shop;

import javax.swing.JFrame;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myPanel1 = new Shop.MyPanel();
        myPanel2 = new Shop.MyPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        myBtn3 = new Shop.MyBtn();
        myBtn2 = new Shop.MyBtn();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        myPanel2.setRadius(400);
        myPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("LAKSHMI STATIONARY SHOP");
        myPanel2.add(jLabel1);
        jLabel1.setBounds(300, 170, 502, 90);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ELCOT\\Downloads\\blue-removebg-preview.png")); // NOI18N
        jLabel3.setText("jLabel3");
        myPanel2.add(jLabel3);
        jLabel3.setBounds(170, 280, 170, 180);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\ELCOT\\Downloads\\flow1-removebg-preview.png")); // NOI18N
        jLabel6.setText("jLabel4");
        myPanel2.add(jLabel6);
        jLabel6.setBounds(70, 260, 180, 140);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\ELCOT\\Downloads\\blue.png")); // NOI18N
        jLabel7.setText("jLabel5");
        myPanel2.add(jLabel7);
        jLabel7.setBounds(60, -40, 190, 276);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\ELCOT\\Downloads\\flow1-removebg-preview.png")); // NOI18N
        jLabel10.setText("jLabel4");
        myPanel2.add(jLabel10);
        jLabel10.setBounds(90, -60, 180, 140);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\ELCOT\\Downloads\\blue.png")); // NOI18N
        jLabel11.setText("jLabel5");
        myPanel2.add(jLabel11);
        jLabel11.setBounds(70, 100, 190, 276);

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\ELCOT\\Downloads\\blue.png")); // NOI18N
        jLabel13.setText("jLabel5");
        myPanel2.add(jLabel13);
        jLabel13.setBounds(170, -120, 190, 276);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ELCOT\\Videos\\Videos\\Projects\\pictures\\images (29).jpeg")); // NOI18N
        jLabel4.setText("jLabel4");
        myPanel2.add(jLabel4);
        jLabel4.setBounds(230, 100, 680, 250);

        myBtn3.setForeground(new java.awt.Color(255, 255, 255));
        myBtn3.setText("Sales");
        myBtn3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        myBtn3.setRadius(90);
        myBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myBtn3ActionPerformed(evt);
            }
        });
        myPanel2.add(myBtn3);
        myBtn3.setBounds(960, 250, 220, 90);

        myBtn2.setForeground(new java.awt.Color(255, 255, 255));
        myBtn2.setText("Products");
        myBtn2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        myBtn2.setRadius(90);
        myBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myBtn2ActionPerformed(evt);
            }
        });
        myPanel2.add(myBtn2);
        myBtn2.setBounds(960, 100, 220, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ELCOT\\Downloads\\wallpaperflare.com_wallpaper (3).jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        myPanel2.add(jLabel2);
        jLabel2.setBounds(-960, 0, 3878, 2160);

        getContentPane().add(myPanel2);
        myPanel2.setBounds(70, 100, 1220, 460);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ELCOT\\Downloads\\wallpaperflare.com_wallpaper (1).jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-10, 0, 1958, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myBtn2ActionPerformed
        Products pro=new Products();
        pro.show();
    }//GEN-LAST:event_myBtn2ActionPerformed

    private void myBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myBtn3ActionPerformed
        BookShop bk=new BookShop();
        bk.show();
    }//GEN-LAST:event_myBtn3ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private Shop.MyBtn myBtn2;
    private Shop.MyBtn myBtn3;
    private Shop.MyPanel myPanel1;
    private Shop.MyPanel myPanel2;
    // End of variables declaration//GEN-END:variables

}
