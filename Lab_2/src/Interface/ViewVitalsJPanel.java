/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.VitalSignHistory;
import Business.VitalSigns;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Keyu Liu
 */
public class ViewVitalsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewVitalsJPanel
     */
    private VitalSignHistory vsh;
    public ViewVitalsJPanel(VitalSignHistory vsh) {
        initComponents();
        this.vsh = vsh;
        populateTable();
    }
    public void populateTable()
    {
        DefaultTableModel dtm = (DefaultTableModel)tblVitalSigns.getModel();
        dtm.setRowCount(0);
        
        for(VitalSigns vs : vsh.getVitalSignHistory()){
            Object row[] = new Object[2];
            row[0] = vs;
            row[1] = vs.getPulse();
            dtm.addRow(row);
        }
        
    }
    private void setFiledEnabled(boolean b){
        txtTemperature.setEnabled(b);
        txtBloodPressure.setEnabled(b);
        txtPulse.setEnabled(b);
        txtDate.setEnabled(b);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblVitalSigns = new javax.swing.JTable();
        btnViewDetails = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPulse = new javax.swing.JTextField();
        txtBloodPressure = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(600, 628));

        tblVitalSigns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Temperature", "Pulse"
            }
        ));
        jScrollPane1.setViewportView(tblVitalSigns);

        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel2.setText("Temperature");

        txtTemperature.setEnabled(false);
        txtTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperatureActionPerformed(evt);
            }
        });

        jLabel3.setText("Blood Pressure");

        jLabel4.setText("Date");

        jLabel5.setText("Pulse");

        txtPulse.setEnabled(false);
        txtPulse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPulseActionPerformed(evt);
            }
        });

        txtBloodPressure.setEnabled(false);

        txtDate.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 102, 0));
        jLabel6.setText("View Vital Sign");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(273, Short.MAX_VALUE)
                        .addComponent(btnUpdate)
                        .addGap(29, 29, 29)
                        .addComponent(btnViewDetails)
                        .addGap(27, 27, 27)
                        .addComponent(btnDelete))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnConfirm)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(113, 113, 113)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewDetails)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnConfirm)
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemperatureActionPerformed

    private void txtPulseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPulseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPulseActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        int selectedrow = tblVitalSigns.getSelectedRow();
        
        if(selectedrow >= 0)
        {
           VitalSigns vs = (VitalSigns)tblVitalSigns.getValueAt(selectedrow, 0);
           txtBloodPressure.setText(String.valueOf(vs.getBloodPressure()));
           txtTemperature.setText(String.valueOf(vs.getTemperature()));
           txtPulse.setText(String.valueOf(vs.getPulse()));
           txtDate.setText(vs.getDate());        
        }
        else 
            JOptionPane.showMessageDialog(null,"Please select one row");
    

    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
         int selectedrow = tblVitalSigns.getSelectedRow();
        
        if(selectedrow >= 0)
        {
             VitalSigns vs = (VitalSigns)tblVitalSigns.getValueAt(selectedrow, 0);
             vsh.deleteVitals(vs);
             JOptionPane.showMessageDialog(null,"Vital sign with 'Temperature = "+vs+"'has been deleted");
             populateTable();
        }
        else 
             JOptionPane.showMessageDialog(null,"Please select one row");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        setFiledEnabled(true);
        btnConfirm.setEnabled(true);
  int selectedrow = tblVitalSigns.getSelectedRow();
        
        if(selectedrow >= 0)
        {
           VitalSigns vs = (VitalSigns)tblVitalSigns.getValueAt(selectedrow, 0);
            txtTemperature.setText(vs.getTemperature()+"");
            txtBloodPressure.setText(vs.getBloodPressure()+"");
            txtPulse.setText(vs.getPulse()+"");
            txtDate.setText(vs.getDate()+"");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
     
        int selectedrow = tblVitalSigns.getSelectedRow();
        if(selectedrow >= 0)
        {
           VitalSigns vs = (VitalSigns)tblVitalSigns.getValueAt(selectedrow, 0);
           vs.setTemperature(Double.parseDouble(txtTemperature.getText()));
           vs.setDate(txtDate.getText());
           vs.setBloodPressure(Double.parseDouble(txtBloodPressure.getText()));
           vs.setPulse(Integer.parseInt(txtPulse.getText()));
           
           JOptionPane.showMessageDialog(null,"Vital Sign successfully updated!");
           populateTable();
           setFiledEnabled(false);
           btnConfirm.setEnabled(false);
        }else{
            JOptionPane.showMessageDialog(null,"Please select any row");
           
          

        }
           
        
    }//GEN-LAST:event_btnConfirmActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVitalSigns;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}
