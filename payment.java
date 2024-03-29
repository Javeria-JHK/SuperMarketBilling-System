

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author MAli
 */
public class payment extends javax.swing.JFrame {
    DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();

    /**
     * Creates new form payment
     */
    public payment() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cash = new javax.swing.JRadioButton();
        cred = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        custName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cardnumber = new javax.swing.JTextField();
        print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 800));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\MAli\\Downloads\\payn.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 10, 660, 640);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("Payment Methods");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(720, 40, 240, 50);

        jLabel4.setText("________________________________________________________________________________________________________");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(590, 90, 480, 20);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Pay by");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(660, 150, 110, 20);

        cash.setText("Cash");
        cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashActionPerformed(evt);
            }
        });
        getContentPane().add(cash);
        cash.setBounds(660, 180, 110, 21);

        cred.setText("Credit card");
        cred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                credActionPerformed(evt);
            }
        });
        getContentPane().add(cred);
        cred.setBounds(660, 210, 130, 21);

        jLabel5.setText("Customer's name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(660, 270, 100, 16);

        custName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custNameActionPerformed(evt);
            }
        });
        getContentPane().add(custName);
        custName.setBounds(660, 300, 170, 22);

        jLabel6.setText("Credit Card Number");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(660, 340, 110, 16);

        cardnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardnumberActionPerformed(evt);
            }
        });
        getContentPane().add(cardnumber);
        cardnumber.setBounds(660, 370, 170, 22);

        print.setBackground(new java.awt.Color(153, 153, 255));
        print.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setText("Print Bill");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        getContentPane().add(print);
        print.setBounds(680, 460, 140, 27);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cashActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
        String s1 = custName.getText();
        String s2 = cardnumber.getText();
            String g= "";
            if(cash.isSelected()){
                g = "cash";
           }else if (cred.isSelected()){
                g = "Credit Card";
           }
            
           SBS.addOrder(SBS.order_id,s1,date, g,s2 );
        System.out.println("printing....");
        JOptionPane.showMessageDialog(new JFrame(), "Printed Succeefully");
        dispose();
        AddToCart atc = new AddToCart();
        atc.setVisible(true);
        SBS.order_id++;
    }//GEN-LAST:event_printActionPerformed

    private void custNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custNameActionPerformed

    private void cardnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardnumberActionPerformed

    private void credActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_credActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_credActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cardnumber;
    private javax.swing.JRadioButton cash;
    private javax.swing.JRadioButton cred;
    private javax.swing.JTextField custName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton print;
    // End of variables declaration//GEN-END:variables
}
