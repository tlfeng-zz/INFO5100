/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageTravelAgency;

import Business.Flight;
import Business.FlightSchedule;
import Business.TravelAgency;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class ManageTravelAgencyWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageTravelAgencyWorkAreaJPanel
     */
    JPanel userProcessContainer;
    private TravelAgency travelAgency;
    public ManageTravelAgencyWorkAreaJPanel(JPanel userProcessContainer, TravelAgency travelAgency) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.travelAgency = travelAgency;
        addItemToComboBox();
    }
    
    public void addItemToComboBox() {
        ArrayList<String> allAirportNames = new ArrayList<>();
        for (FlightSchedule fS: travelAgency.getMTS().getmTS()) {
            for(Flight flight: fS.getFlightSchedule()) {
                allAirportNames.add(flight.getDepartAirport());
                allAirportNames.add(flight.getArrivalAirport());
            }
        }
        //remove duplicates
        HashSet<String> hs = new HashSet<>();
        hs.addAll(allAirportNames);
        allAirportNames.clear();
        allAirportNames.addAll(hs);
        
        for (String airportName: allAirportNames) {
            depCBox.addItem(airportName);
            arrCBox.addItem(airportName);
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        arrCBox = new javax.swing.JComboBox<>();
        searchFlightBtn = new javax.swing.JButton();
        depCBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        flightTbl = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Manage Travel Agency");

        jLabel2.setText("Source ");

        jLabel3.setText("Destination");

        arrCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        searchFlightBtn.setText("Search");
        searchFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFlightBtnActionPerformed(evt);
            }
        });

        depCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        flightTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight No.", "Airliner Name", "Dep Time", "Arr Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(flightTbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(depCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(arrCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(412, 412, 412)
                        .addComponent(searchFlightBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(depCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(arrCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addComponent(searchFlightBtn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFlightBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) flightTbl.getModel();
        dtm.setRowCount(0);
        Object[] row = new Object[4];
        
        for (FlightSchedule fS: travelAgency.getMTS().getmTS()) {
            for(Flight flight: fS.getFlightSchedule()) {
                if(flight.getDepartAirport().equals(depCBox.getSelectedItem()) &&
                        flight.getArrivalAirport().equals(arrCBox.getSelectedItem())) {                
                    row[0] = flight;
                    row[1] = fS.getAirliner().getAirlinerName();
                    row[2] = flight.getDepartTime();
                    row[3] = flight.getArrivalTime();
                    dtm.addRow(row);
                }
            }
        }
         if(dtm.getRowCount() == 0)
            JOptionPane.showMessageDialog(null, "No Airliners found.");
    }//GEN-LAST:event_searchFlightBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> arrCBox;
    private javax.swing.JComboBox<String> depCBox;
    private javax.swing.JTable flightTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchFlightBtn;
    // End of variables declaration//GEN-END:variables
}