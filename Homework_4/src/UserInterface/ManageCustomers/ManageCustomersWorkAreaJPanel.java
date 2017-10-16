/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomers;

import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class ManageCustomersWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomersWorkAreaJPanel
     */
    JPanel userProcessContainer;
    private TravelAgency travelAgency;
    public ManageCustomersWorkAreaJPanel(JPanel userProcessContainer, TravelAgency travelAgency) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.travelAgency = travelAgency;
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
        enterSearchBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Manage Customers");

        enterSearchBtn.setText("Search for Flights Best Deals");
        enterSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterSearchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(enterSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(enterSearchBtn))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void enterSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterSearchBtnActionPerformed
        // TODO add your handling code here:
        ViewBestFlightDealsJPanel panel = new ViewBestFlightDealsJPanel(userProcessContainer, travelAgency);
        userProcessContainer.add("ViewBestFlightDealsJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_enterSearchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enterSearchBtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}