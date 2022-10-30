/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Vitals;

import Model.Doctor.Doctor;
import Model.Doctor.DoctorDirectory;
import Model.Encounter.EncounterDirectory;
import Model.Hospital.HospitalDirectory;
import Model.Patient.PatientDirectory;
import Model.SignUp.SignUpDirectory;
import Model.Vitals.Vitals;
import Model.Vitals.VitalsDirectory;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author sejalchandak
 */
public class ReadVitalsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReadVitalsJPanel
     */
    SignUpDirectory SignUpDirectory;
    HospitalDirectory HospitalDirectory;
    DoctorDirectory DoctorDirectory;
    PatientDirectory PatientDirectory;
    EncounterDirectory EncounterDirectory;
    VitalsDirectory VitalsDirectory;
    public ReadVitalsJPanel(SignUpDirectory SignUpDirectory, HospitalDirectory HospitalDirectory, DoctorDirectory DoctorDirectory, PatientDirectory PatientDirectory,String DID, EncounterDirectory EncounterDirectory, VitalsDirectory VitalsDirectory) {
        initComponents();
        this.SignUpDirectory = SignUpDirectory;
        this.HospitalDirectory = HospitalDirectory;
        this.DoctorDirectory = DoctorDirectory;
        this.PatientDirectory = PatientDirectory;
        this.EncounterDirectory = EncounterDirectory;
        this.VitalsDirectory = VitalsDirectory;
        for(Doctor selectedSignUp : DoctorDirectory.getDoctorDirectory()){
            if (String.valueOf(selectedSignUp.getDoctorID()).equals(DID)){
            txtDoctorID.setText(String.valueOf(selectedSignUp.getDoctorID()));
            txtDoctorName.setText(String.valueOf(selectedSignUp.getDoctorName())); 
            }
        }
        populateTable();
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
        txtDoctorID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDoctorName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSearchPerson = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVitalsDirectory = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEncounterID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtTimeStamp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtHeartRate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtBPS = new javax.swing.JTextField();
        txtBPD = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        btnPersonDelete = new javax.swing.JButton();
        btnUpdateSignUp = new javax.swing.JButton();

        jLabel1.setText("Doctor ID:");

        txtDoctorID.setEditable(false);
        txtDoctorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorIDActionPerformed(evt);
            }
        });

        jLabel5.setText("Doctor's Name:");

        txtDoctorName.setEditable(false);

        jLabel3.setText("Search:");

        txtSearchPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchPersonActionPerformed(evt);
            }
        });
        txtSearchPerson.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchPersonKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        jLabel2.setText("Vitals History");

        tblVitalsDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Doctor's Name", "VitalID", "DoctorID", "Patient's Name", "EncounterID", "PatientID", "Date", "TimeStamp", "Temperature", "HeartRate", "BPS", "BPD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVitalsDirectory);

        jLabel4.setText("Patient's Name:");

        txtPatientName.setEditable(false);

        jLabel6.setText("Encounter ID:");

        txtEncounterID.setEditable(false);

        jLabel7.setText("Patient ID:");

        txtPatientID.setEditable(false);

        jLabel12.setText("Date:");

        txtDate.setEditable(false);

        jLabel13.setText("Time Stamp:");

        txtTimeStamp.setEditable(false);

        jLabel8.setText("Temperature:");

        jLabel10.setText("Heart Rate:");

        jLabel9.setText("BP Systolic (H):");

        jLabel11.setText("BP Diastolic (L):");

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnPersonDelete.setText("Delete");
        btnPersonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonDeleteActionPerformed(evt);
            }
        });

        btnUpdateSignUp.setText("Update");
        btnUpdateSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSignUpActionPerformed(evt);
            }
        });
        btnUpdateSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnUpdateSignUpKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDoctorName, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                                    .addComponent(txtSearchPerson)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(txtBPS)
                                                            .addComponent(txtTemperature, javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(txtDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(11, 11, 11)
                                                                .addComponent(jLabel11))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel10))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel13))))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(txtEncounterID, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel7)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtHeartRate)
                                                        .addComponent(txtBPD)
                                                        .addComponent(txtTimeStamp, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnView)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnPersonDelete)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnUpdateSignUp)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSearchPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnPersonDelete)
                    .addComponent(btnUpdateSignUp))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEncounterID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimeStamp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(txtBPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBPD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(233, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDoctorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorIDActionPerformed

    private void txtSearchPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchPersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchPersonActionPerformed

    private void txtSearchPersonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchPersonKeyPressed
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel)tblVitalsDirectory.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tableModel);
        tblVitalsDirectory.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearchPerson.getText().trim()));
    }//GEN-LAST:event_txtSearchPersonKeyPressed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblVitalsDirectory.getSelectedRow();

        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblVitalsDirectory.getModel();
        Vitals selectedSignUp = (Vitals) model.getValueAt(selectedRowIndex,0);

        txtPatientName.setText(String.valueOf(selectedSignUp.getPatientName()));
        txtPatientID.setText(String.valueOf(selectedSignUp.getPatientID()));
        txtEncounterID.setText(String.valueOf(selectedSignUp.getEncounterID()));
        txtDate.setText(String.valueOf(selectedSignUp.getDate()));
        txtTimeStamp.setText(String.valueOf(selectedSignUp.getTimeStamp()));
        txtTemperature.setText(String.valueOf(selectedSignUp.getTemperature()));
        txtHeartRate.setText(String.valueOf(selectedSignUp.getHeartRate()));
        txtBPS.setText(String.valueOf(selectedSignUp.getBPS()));
        txtBPD.setText(String.valueOf(selectedSignUp.getBPD()));
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnPersonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonDeleteActionPerformed
        // TODO add your handling code here:

        txtPatientName.setText("");
        txtPatientID.setText("");
        txtEncounterID.setText("");
        txtDate.setText("");
        txtTimeStamp.setText("");
        txtTemperature.setText("");
        txtHeartRate.setText("");
        txtBPS.setText("");
        txtBPD.setText("");

        int selectedRowIndex = tblVitalsDirectory.getSelectedRow();

        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblVitalsDirectory.getModel();
        Doctor selectedSignUp = (Doctor) model.getValueAt(selectedRowIndex,0);

        DoctorDirectory.deleteEmployee(selectedSignUp);

        JOptionPane.showMessageDialog(this, "Person Details deleted.");

        populateTable();
    }//GEN-LAST:event_btnPersonDeleteActionPerformed

    private void btnUpdateSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSignUpActionPerformed

        if(tblVitalsDirectory.getSelectedRow()<0) {
            JOptionPane.showMessageDialog(this , "Please select a row to update.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblVitalsDirectory.getModel();
        Doctor su = (Doctor) model.getValueAt(tblVitalsDirectory.getSelectedRow(), 0);

        if (tblVitalsDirectory.getSelectedRowCount()==1) {

            int DoctorID = Integer.parseInt(txtDoctorID.getText());
            String DoctorName = txtDoctorName.getText();
            String PatientName = txtPatientName.getText();
            int EncounterID = Integer.parseInt(txtEncounterID.getText());
            int PatientID = Integer.parseInt(txtPatientID.getText());
            String Date = txtDate.getText();
            String TimeStamp = txtTimeStamp.getText();
            Double Temperature = Double.parseDouble(txtTemperature.getText());
            int HeartRate = Integer.parseInt(txtHeartRate.getText());
            int BPS = Integer.parseInt(txtBPS.getText());
            int BPD = Integer.parseInt(txtBPD.getText());

            Vitals v = VitalsDirectory.addNewVitals();

            v.setDoctorID(DoctorID);
            v.setDoctorName(DoctorName);
            v.setPatientName(PatientName);
            v.setEncounterID(EncounterID);
            v.setPatientID(PatientID);
            v.setDate(Date);
            v.setTimeStamp(TimeStamp);
            v.setTemperature(Temperature);
            v.setHeartRate(HeartRate);
            v.setBPS(BPS);
            v.setBPD(BPD);
    
            model.setValueAt(DoctorName, tblVitalsDirectory.getSelectedRow(), 0);
            model.setValueAt(DoctorID, tblVitalsDirectory.getSelectedRow(), 2);
            model.setValueAt(PatientName, tblVitalsDirectory.getSelectedRow(), 3);
            model.setValueAt(EncounterID, tblVitalsDirectory.getSelectedRow(), 4);
            model.setValueAt(PatientID, tblVitalsDirectory.getSelectedRow(), 5);
            model.setValueAt(Date, tblVitalsDirectory.getSelectedRow(), 6);
            model.setValueAt(TimeStamp, tblVitalsDirectory.getSelectedRow(), 7);
            model.setValueAt(Temperature, tblVitalsDirectory.getSelectedRow(), 8);
            model.setValueAt(HeartRate, tblVitalsDirectory.getSelectedRow(), 9);
            model.setValueAt(BPS, tblVitalsDirectory.getSelectedRow(), 10);
            model.setValueAt(BPD, tblVitalsDirectory.getSelectedRow(), 11);

            JOptionPane.showMessageDialog(this, "Person Details Updated");

            txtPatientName.setText("");
            txtPatientID.setText("");
            txtEncounterID.setText("");
            txtDate.setText("");
            txtTimeStamp.setText("");
            txtTemperature.setText("");
            txtHeartRate.setText("");
            txtBPS.setText("");
            txtBPD.setText("");

            populateTable();
    }//GEN-LAST:event_btnUpdateSignUpActionPerformed
    }
    private void btnUpdateSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnUpdateSignUpKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateSignUpKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPersonDelete;
    private javax.swing.JButton btnUpdateSignUp;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVitalsDirectory;
    private javax.swing.JTextField txtBPD;
    private javax.swing.JTextField txtBPS;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDoctorID;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtEncounterID;
    private javax.swing.JTextField txtHeartRate;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtSearchPerson;
    private javax.swing.JTextField txtTemperature;
    private javax.swing.JTextField txtTimeStamp;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
     DefaultTableModel model = (DefaultTableModel) tblVitalsDirectory.getModel();
        model.setRowCount(0);
        
        for (Vitals su : VitalsDirectory.getVitalsDirectory()){
            if (String.valueOf(su.getEncounterID()).equals(txtEncounterID.getText())){
            Object[] row = new Object[13];
            row[0] = su;
            row[1] = su.getVitalID();
            row[2] = su.getDoctorID();
            row[3] = su.getPatientName();
            row[4] = su.getEncounterID();
            row[5] = su.getPatientID();
            row[6] = su.getDate();
            row[7] = su.getTimeStamp();
            row[8] = su.getTemperature();
            row[9] = su.getHeartRate();
            row[10] = su.getBPS();
            row[11] = su.getBPD();
            
            model.addRow(row);
            }
        }
    }   
}
