/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomers;

import Business.Flight;
import Business.FlightSchedule;
import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class ViewBestFlightDealsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewBestFlightDealsJPanel
     */
    JPanel userProcessContainer;
    private TravelAgency travelAgency;
    public ViewBestFlightDealsJPanel(JPanel userProcessContainer, TravelAgency travelAgency) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
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
        expectPriceTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        depAirportTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        arrAirportTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        flightSearchTbl = new javax.swing.JTable();
        selectBookBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Best Deals");

        jLabel2.setText("Price lower than:");

        jLabel3.setText("Source: ");

        jLabel4.setText("Destination:");

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        flightSearchTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight No.", "Airliner Name", "Dep Time", "Arr TIme", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(flightSearchTbl);

        selectBookBtn.setText("Select And Book");
        selectBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBookBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<<back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel4)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(expectPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(depAirportTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(arrAirportTxt))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(searchBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(backBtn)
                        .addGap(149, 149, 149)
                        .addComponent(selectBookBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expectPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depAirportTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(arrAirportTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(searchBtn)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(backBtn))
                    .addComponent(selectBookBtn)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBookBtnActionPerformed
        // TODO add your handling code here:
        Flight flight = new Flight();
        int selectedRow = flightSearchTbl.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else {
            flight = (Flight)flightSearchTbl.getValueAt(selectedRow, 0);
        }
        
        BookCustomersJPanel panel = new BookCustomersJPanel(userProcessContainer, travelAgency, flight);
        userProcessContainer.add("BookCustomersJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_selectBookBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        // Price text field is allowed to be blank
                
        if (depAirportTxt.getText().equals("") || arrAirportTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please type the Source and Destination.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int expectPrice = 9999;
        if (!expectPriceTxt.getText().equals(""))
            expectPrice = Integer.parseInt(expectPriceTxt.getText());
        
        DefaultTableModel dtm = (DefaultTableModel) flightSearchTbl.getModel();
        dtm.setRowCount(0);
        Object[] row = new Object[5];
        
        for (FlightSchedule fS: travelAgency.getMTS().getmTS()) {
            for(Flight flight: fS.getFlightSchedule()) {
                if(flight.getDepartAirport().equals(depAirportTxt.getText()) &&
                        flight.getArrivalAirport().equals(arrAirportTxt.getText()) &&
                            flight.getSeat().get(0).getPrice() <= expectPrice) {                
                    row[0] = flight;
                    row[1] = fS.getAirliner().getAirlinerName();
                    row[2] = flight.getDepartTime();
                    row[3] = flight.getArrivalTime();
                    row[4] = "$"+flight.getSeat().get(0).getPrice();
                    dtm.addRow(row);
                }
            }
        }
         if(dtm.getRowCount() == 0)
            JOptionPane.showMessageDialog(null, "No Airliners found.");
    }//GEN-LAST:event_searchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arrAirportTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField depAirportTxt;
    private javax.swing.JTextField expectPriceTxt;
    private javax.swing.JTable flightSearchTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton selectBookBtn;
    // End of variables declaration//GEN-END:variables
}