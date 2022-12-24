/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.vehicle.service.management.system;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author devadathan
 */
public class EditService extends javax.swing.JFrame {

    Connection con = null;
    Statement st = null;
    PreparedStatement pst = null;  
    ResultSet rs = null;
    /**
     * Creates new form EditService
     */
    public EditService() {
        try {
            initComponents();
            final String URL = "jdbc:mysql://localhost:3306/serviceDB";
            final String username = "sqluser";
            final String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
                        con = DriverManager.getConnection(URL, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NewService.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vehicleNumberField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        vehicleTypeField = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        serviceTypeField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        serviceHeadIdField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        customerNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        customerContactNumberField = new javax.swing.JTextField();
        editBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        vehicleModelField = new javax.swing.JTextField();
        fetchBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        serviceStatusField = new javax.swing.JTextField();
        messageField = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        serviceDateField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vehicle Management Service System");

        jPanel1.setBackground(new java.awt.Color(136, 183, 181));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EDIT SERVICE");

        jLabel2.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 102));
        jLabel2.setText("VEHICLE NUMBER :");

        vehicleNumberField.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        vehicleNumberField.setForeground(new java.awt.Color(51, 0, 102));
        vehicleNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleNumberFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 102));
        jLabel4.setText("VEHICLE TYPE :");

        vehicleTypeField.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        vehicleTypeField.setForeground(new java.awt.Color(51, 0, 102));
        vehicleTypeField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "car", "motorcycle", "truck", "bus" }));
        vehicleTypeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleTypeFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 102));
        jLabel5.setText("SERVICE TYPE :");

        serviceTypeField.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        serviceTypeField.setForeground(new java.awt.Color(51, 0, 102));
        serviceTypeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceTypeFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 102));
        jLabel6.setText("SERVICE HEAD ID :");

        serviceHeadIdField.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        serviceHeadIdField.setForeground(new java.awt.Color(51, 0, 102));
        serviceHeadIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceHeadIdFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 102));
        jLabel7.setText("CUSTOMER NAME :");

        customerNameField.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        customerNameField.setForeground(new java.awt.Color(51, 0, 102));
        customerNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 102));
        jLabel3.setText("CUSTOMER CONTACT NUMBER : ");

        customerContactNumberField.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        customerContactNumberField.setForeground(new java.awt.Color(51, 0, 102));
        customerContactNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerContactNumberFieldActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(49, 10, 49));
        editBtn.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        editBtn.setForeground(new java.awt.Color(204, 255, 255));
        editBtn.setText("EDIT");
        editBtn.setToolTipText("");
        editBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        homeBtn.setBackground(new java.awt.Color(0, 102, 255));
        homeBtn.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn.setText("HOME");
        homeBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 102));
        jLabel8.setText("VEHICLE MODEL :");

        vehicleModelField.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        vehicleModelField.setForeground(new java.awt.Color(51, 0, 102));
        vehicleModelField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleModelFieldActionPerformed(evt);
            }
        });

        fetchBtn.setBackground(new java.awt.Color(49, 10, 49));
        fetchBtn.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        fetchBtn.setForeground(new java.awt.Color(204, 255, 255));
        fetchBtn.setText("FETCH DATA");
        fetchBtn.setToolTipText("");
        fetchBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        fetchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fetchBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 102));
        jLabel9.setText("SERVICE STATUS : ");

        serviceStatusField.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        serviceStatusField.setForeground(new java.awt.Color(51, 0, 102));
        serviceStatusField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceStatusFieldActionPerformed(evt);
            }
        });

        messageField.setFont(new java.awt.Font("Monospaced", 3, 24)); // NOI18N
        messageField.setForeground(new java.awt.Color(255, 51, 0));

        jLabel10.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 102));
        jLabel10.setText("SERVICE DATE : ");

        serviceDateField1.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        serviceDateField1.setForeground(new java.awt.Color(51, 0, 102));
        serviceDateField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceDateField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vehicleModelField, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122)
                                .addComponent(vehicleNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(serviceTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vehicleTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(163, 163, 163)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(customerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(serviceHeadIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(customerContactNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(serviceDateField1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(serviceStatusField, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fetchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 75, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vehicleNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehicleModelField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vehicleTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serviceTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(fetchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serviceHeadIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerContactNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serviceDateField1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serviceStatusField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void vehicleModelFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleModelFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicleModelFieldActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        System.out.println("`Home button clicked");
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        System.out.println("Submit button pressed");
        
        
        
        final String vehicleNumber = vehicleNumberField.getText();
        final String vehicleModel = vehicleModelField.getText();
        final String vehicleType = vehicleTypeField.getSelectedItem().toString();
        final String serviceType = serviceTypeField.getText();
        final String serviceHeadId = serviceHeadIdField.getText();
        final String customerName = customerNameField.getText();
        final String customerNumber = customerContactNumberField.getText();
        final String serviceDate = serviceStatusField.getText();
        final String serviceStatus = serviceStatusField.getText();
        
        if (vehicleNumber.isEmpty() | vehicleModel.isEmpty() | vehicleType.isEmpty() | serviceType.isEmpty() | serviceHeadId.isEmpty() | customerName.isEmpty() | customerNumber.isEmpty()){
            messageField.setForeground(Color.red);
            messageField.setText("Please fill all the values");
        }
        else{
            try {
                pst = con.prepareStatement("UPDATE services SET vehicle_number = ?, vehicleType = ?, vehicle_model = ?, service_type = ?, service_head_id = ?, customer_name = ?, customer_number = ?, service_date = ?, service_status = ?");
                pst.setString(1, vehicleNumber);
                pst.setString(2, vehicleType);
                pst.setString(3, vehicleModel);
                pst.setString(4, serviceType);
                pst.setString(5, serviceHeadId);
                pst.setString(6, customerName);
                pst.setString(7, customerNumber);
                pst.setString(8, serviceDate);
                pst.setString(9, serviceStatus);
                pst.executeUpdate();
                messageField.setForeground(Color.GREEN);
                messageField.setText("Successfully updated record");
           
            }
            catch (SQLIntegrityConstraintViolationException ex) {
                messageField.setForeground(Color.red);
                messageField.setText("Data already exists in database");
                Logger.getLogger(NewService.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (SQLException ex) {
                messageField.setForeground(Color.red);
                messageField.setText("ERROR : Could not edit the record.");
                Logger.getLogger(NewService.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void customerContactNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerContactNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerContactNumberFieldActionPerformed

    private void customerNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNameFieldActionPerformed

    private void serviceHeadIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceHeadIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serviceHeadIdFieldActionPerformed

    private void serviceTypeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceTypeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serviceTypeFieldActionPerformed

    private void vehicleTypeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleTypeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicleTypeFieldActionPerformed

    private void vehicleNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicleNumberFieldActionPerformed

    private void fetchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fetchBtnActionPerformed
        try {
            // TODO add your handling code here:
            String vehicleNumber = vehicleNumberField.getText();
            pst = con.prepareStatement("SELECT * FROM services WHERE vehicle_number = (?)");
            pst.setString(1, vehicleNumber);
            rs = pst.executeQuery();

            boolean isEmpty = true;
            while(rs.next()){
                System.out.println(rs.getString("customer_name"));
                vehicleNumberField.setText(rs.getString("vehicle_number"));
                vehicleTypeField.setSelectedItem(rs.getString("vehicleType"));
                vehicleModelField.setText(rs.getString("vehicle_model"));
                serviceTypeField.setText(rs.getString("service_type"));
                customerNameField.setText(rs.getString("customer_name"));
                customerContactNumberField.setText(rs.getString("customer_number"));
                serviceStatusField.setText(rs.getString("service_date"));
                serviceHeadIdField.setText(rs.getString("service_head_id"));
                serviceStatusField.setText(rs.getString("service_status"));
                serviceDateField1.setText(rs.getString("service_date"));
                isEmpty = false;
                messageField.setText("");
            }
            
            if (isEmpty){
                messageField.setForeground(Color.RED);
                messageField.setText("Could not find any data for that vehicle number.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(EditService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_fetchBtnActionPerformed

    private void serviceStatusFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceStatusFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serviceStatusFieldActionPerformed

    private void serviceDateField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceDateField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serviceDateField1ActionPerformed

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
            java.util.logging.Logger.getLogger(EditService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditService().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField customerContactNumberField;
    private javax.swing.JTextField customerNameField;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton fetchBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel messageField;
    private javax.swing.JTextField serviceDateField1;
    private javax.swing.JTextField serviceHeadIdField;
    private javax.swing.JTextField serviceStatusField;
    private javax.swing.JTextField serviceTypeField;
    private javax.swing.JTextField vehicleModelField;
    private javax.swing.JTextField vehicleNumberField;
    private javax.swing.JComboBox<String> vehicleTypeField;
    // End of variables declaration//GEN-END:variables
}
