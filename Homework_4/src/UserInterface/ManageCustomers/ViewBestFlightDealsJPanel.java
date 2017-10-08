/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomers;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class ViewBestFlightDealsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewBestFlightDealsJPanel
     */
    JPanel userProcessContainer;
    public ViewBestFlightDealsJPanel(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Best Deals");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 28, -1, -1));

        jTextField1.setText("jTextField1");
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 83, -1, -1));

        jLabel2.setText("Price");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 86, -1, -1));

        jLabel3.setText("Source ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 117, -1, -1));

        jTextField2.setText("jTextField2");
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 114, -1, -1));

        jLabel4.setText("Destination");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 148, -1, -1));

        jTextField3.setText("jTextField2");
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 145, -1, -1));

        jButton1.setText("Search");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 195, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 229, 379, 134));

        jButton2.setText("Select And Book");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 374, -1, -1));

        jLabel5.setText("Other Fields If You Want better if there is sorting on price ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 183, 288, -1));

        jButton3.setText("<<back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        BookCustomersJPanel panel = new BookCustomersJPanel(userProcessContainer);
        userProcessContainer.add("BookCustomersJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
