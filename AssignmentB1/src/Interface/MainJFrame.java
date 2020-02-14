/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Address;
import Business.CheckingAccount;
import Business.Demographic;
import Business.Driverlicense;
import Business.MedicalRecord;
import Business.SavingAccount;

/**
 *
 * @author Keyu Liu
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */

    private Address address;
    private CheckingAccount checkingAccount;
    private Demographic demographic;
    private Driverlicense driverlicense;
    private MedicalRecord medicalRecord;
    private SavingAccount savingAccount;
    
    public MainJFrame() {
        initComponents();

        address = new Address();
        checkingAccount = new CheckingAccount();
        demographic = new Demographic();
        driverlicense =  new Driverlicense();
        medicalRecord = new MedicalRecord();
        savingAccount = new SavingAccount();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        leftPanel = new javax.swing.JPanel();
        btnViewReport = new javax.swing.JButton();
        btnCreateAddress = new javax.swing.JButton();
        btnCreateCheckingAccount = new javax.swing.JButton();
        btnCreateDemographic = new javax.swing.JButton();
        btnCreateDriverLicense = new javax.swing.JButton();
        btnCreateMedicalRecord = new javax.swing.JButton();
        btnCreateSavingAccount = new javax.swing.JButton();
        btnViewAddress = new javax.swing.JButton();
        btnViewCheckingAccount = new javax.swing.JButton();
        btnViewDemographic = new javax.swing.JButton();
        btnViewDriverLicense = new javax.swing.JButton();
        btnViewMedicalRecord = new javax.swing.JButton();
        btnViewSavingAccount = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jSplitPane1.setLeftComponent(jPanel2);

        btnViewReport.setText("View Report");
        btnViewReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewReportActionPerformed(evt);
            }
        });

        btnCreateAddress.setText("Create Address Information");
        btnCreateAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAddressActionPerformed(evt);
            }
        });

        btnCreateCheckingAccount.setText("Create Checking Account Information");
        btnCreateCheckingAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCheckingAccountActionPerformed(evt);
            }
        });

        btnCreateDemographic.setText("Create Demographic Information");
        btnCreateDemographic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDemographicActionPerformed(evt);
            }
        });

        btnCreateDriverLicense.setText("Create Driver's License Information");
        btnCreateDriverLicense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDriverLicenseActionPerformed(evt);
            }
        });

        btnCreateMedicalRecord.setText("Create Medical Record Information");
        btnCreateMedicalRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateMedicalRecordActionPerformed(evt);
            }
        });

        btnCreateSavingAccount.setText("Create Saving Account Information");
        btnCreateSavingAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateSavingAccountActionPerformed(evt);
            }
        });

        btnViewAddress.setText("View Address Information");
        btnViewAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAddressActionPerformed(evt);
            }
        });

        btnViewCheckingAccount.setText("View Checking Account Information");
        btnViewCheckingAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCheckingAccountActionPerformed(evt);
            }
        });

        btnViewDemographic.setText("View Demographic Information");
        btnViewDemographic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDemographicActionPerformed(evt);
            }
        });

        btnViewDriverLicense.setText("View Driver's License Information");
        btnViewDriverLicense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDriverLicenseActionPerformed(evt);
            }
        });

        btnViewMedicalRecord.setText("View Medical Record Information");
        btnViewMedicalRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMedicalRecordActionPerformed(evt);
            }
        });

        btnViewSavingAccount.setText("View Saving Account Information");
        btnViewSavingAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSavingAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCreateDriverLicense))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewReport)
                            .addComponent(btnCreateAddress)
                            .addComponent(btnCreateCheckingAccount)
                            .addComponent(btnCreateDemographic)
                            .addComponent(btnCreateMedicalRecord)
                            .addComponent(btnCreateSavingAccount)
                            .addComponent(btnViewAddress)
                            .addComponent(btnViewCheckingAccount)
                            .addComponent(btnViewDemographic)
                            .addComponent(btnViewDriverLicense)
                            .addComponent(btnViewMedicalRecord)
                            .addComponent(btnViewSavingAccount))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(btnCreateAddress)
                .addGap(18, 18, 18)
                .addComponent(btnCreateCheckingAccount)
                .addGap(18, 18, 18)
                .addComponent(btnCreateDemographic)
                .addGap(18, 18, 18)
                .addComponent(btnCreateDriverLicense)
                .addGap(18, 18, 18)
                .addComponent(btnCreateMedicalRecord)
                .addGap(18, 18, 18)
                .addComponent(btnCreateSavingAccount)
                .addGap(18, 18, 18)
                .addComponent(btnViewAddress)
                .addGap(18, 18, 18)
                .addComponent(btnViewCheckingAccount)
                .addGap(18, 18, 18)
                .addComponent(btnViewDemographic)
                .addGap(18, 18, 18)
                .addComponent(btnViewDriverLicense)
                .addGap(18, 18, 18)
                .addComponent(btnViewMedicalRecord)
                .addGap(18, 18, 18)
                .addComponent(btnViewSavingAccount)
                .addGap(28, 28, 28)
                .addComponent(btnViewReport)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(leftPanel);

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1252, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(rightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAddressActionPerformed
        // TODO add your handling code here:
        CreateAddressJPanel creatJPanel= new CreateAddressJPanel(address);
        jSplitPane1.setRightComponent(creatJPanel);
    }//GEN-LAST:event_btnCreateAddressActionPerformed

    private void btnViewAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAddressActionPerformed
        // TODO add your handling code here:
        ViewAddressJPanel viewJPanel= new ViewAddressJPanel(address);
        jSplitPane1.setRightComponent(viewJPanel);
    }//GEN-LAST:event_btnViewAddressActionPerformed

    private void btnCreateCheckingAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCheckingAccountActionPerformed
        // TODO add your handling code here:
        CreateCheckingAccountJPanel creatJPanel= new CreateCheckingAccountJPanel(checkingAccount);
        jSplitPane1.setRightComponent(creatJPanel);
    }//GEN-LAST:event_btnCreateCheckingAccountActionPerformed

    private void btnCreateDemographicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDemographicActionPerformed
        // TODO add your handling code here:
        CreateDemographicJPanel creatJPanel= new CreateDemographicJPanel(demographic);
        jSplitPane1.setRightComponent(creatJPanel);
    }//GEN-LAST:event_btnCreateDemographicActionPerformed

    private void btnCreateDriverLicenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDriverLicenseActionPerformed
        // TODO add your handling code here:
        CreateDriverLicenseJPanel creatJPanel= new CreateDriverLicenseJPanel(driverlicense);
        jSplitPane1.setRightComponent(creatJPanel);
    }//GEN-LAST:event_btnCreateDriverLicenseActionPerformed

    private void btnCreateMedicalRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateMedicalRecordActionPerformed
        // TODO add your handling code here:
        CreateMedicalRecordJPanel creatJPanel= new CreateMedicalRecordJPanel(medicalRecord);
        jSplitPane1.setRightComponent(creatJPanel);
        System.out.println(medicalRecord.getAlergy1());
    }//GEN-LAST:event_btnCreateMedicalRecordActionPerformed

    private void btnCreateSavingAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateSavingAccountActionPerformed
        // TODO add your handling code here:
        CreateSavingAccountJPanel creatJPanel= new CreateSavingAccountJPanel(savingAccount);
        jSplitPane1.setRightComponent(creatJPanel);
    }//GEN-LAST:event_btnCreateSavingAccountActionPerformed

    private void btnViewCheckingAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCheckingAccountActionPerformed
        // TODO add your handling code here:
        ViewCheckingAccountJPanel viewJPanel= new ViewCheckingAccountJPanel(checkingAccount);
        jSplitPane1.setRightComponent(viewJPanel);
    }//GEN-LAST:event_btnViewCheckingAccountActionPerformed

    private void btnViewDemographicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDemographicActionPerformed
        // TODO add your handling code here:
        ViewDemographicJPanel viewJPanel= new ViewDemographicJPanel(demographic);
        jSplitPane1.setRightComponent(viewJPanel);
    }//GEN-LAST:event_btnViewDemographicActionPerformed

    private void btnViewDriverLicenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDriverLicenseActionPerformed
        // TODO add your handling code here:
        ViewDriverLicenseJPanel viewJPanel= new ViewDriverLicenseJPanel(driverlicense);
        jSplitPane1.setRightComponent(viewJPanel);
    }//GEN-LAST:event_btnViewDriverLicenseActionPerformed

    private void btnViewMedicalRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMedicalRecordActionPerformed
        // TODO add your handling code here:
        ViewMedicalRecordJPanel viewJPanel= new ViewMedicalRecordJPanel(medicalRecord);
        jSplitPane1.setRightComponent(viewJPanel);
    }//GEN-LAST:event_btnViewMedicalRecordActionPerformed

    private void btnViewSavingAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSavingAccountActionPerformed
        // TODO add your handling code here:
        ViewSavingAccountJPanel viewJPanel= new ViewSavingAccountJPanel(savingAccount);
        jSplitPane1.setRightComponent(viewJPanel);
    }//GEN-LAST:event_btnViewSavingAccountActionPerformed

    private void btnViewReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewReportActionPerformed
        // TODO add your handling code here:
        ViewReportJPanel viewJPanel= new ViewReportJPanel(address,checkingAccount,demographic,driverlicense,medicalRecord,savingAccount);
        jSplitPane1.setRightComponent(viewJPanel);
    }//GEN-LAST:event_btnViewReportActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAddress;
    private javax.swing.JButton btnCreateCheckingAccount;
    private javax.swing.JButton btnCreateDemographic;
    private javax.swing.JButton btnCreateDriverLicense;
    private javax.swing.JButton btnCreateMedicalRecord;
    private javax.swing.JButton btnCreateSavingAccount;
    private javax.swing.JButton btnViewAddress;
    private javax.swing.JButton btnViewCheckingAccount;
    private javax.swing.JButton btnViewDemographic;
    private javax.swing.JButton btnViewDriverLicense;
    private javax.swing.JButton btnViewMedicalRecord;
    private javax.swing.JButton btnViewReport;
    private javax.swing.JButton btnViewSavingAccount;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel rightPanel;
    // End of variables declaration//GEN-END:variables
}