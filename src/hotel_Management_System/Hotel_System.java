
package hotel_Management_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Hotel_System extends javax.swing.JFrame 
{
    
    Connection Conn = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    
    public void fetch()
    {
    try
        {   Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","123456");
            String s = "select * from hotel";
            Statement st = Conn.prepareStatement(s);
            ResultSet rs = st.executeQuery(s);
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        
        }catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, e);
        }
    }

    public Hotel_System()
    {   
        initComponents();
        fetch();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField0 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        TotalCost = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(255, 102, 51));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Firstname:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 80, 97, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 40, 94, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Lastname:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 120, 95, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address1:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 170, 89, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address2:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 210, 89, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mobile:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 260, 66, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 300, 56, 22);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 51, 51));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 2));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(230, 80, 220, 26);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 51, 51));
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 2));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(230, 290, 220, 26);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 51, 51));
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 2));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(230, 170, 220, 26);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 51, 51));
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 2));
        getContentPane().add(jTextField4);
        jTextField4.setBounds(230, 120, 220, 26);

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 51, 51));
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 2));
        getContentPane().add(jTextField5);
        jTextField5.setBounds(230, 250, 220, 26);

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 51, 51));
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 2));
        getContentPane().add(jTextField6);
        jTextField6.setBounds(230, 210, 220, 26);

        jTextField0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField0.setForeground(new java.awt.Color(255, 51, 51));
        jTextField0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 2));
        getContentPane().add(jTextField0);
        jTextField0.setBounds(230, 40, 220, 26);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Firstname:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 80, 97, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Customer:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 40, 94, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Lastname:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 120, 95, 22);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Address 1:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 170, 94, 22);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Address 2:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 210, 94, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Mobile:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 250, 66, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Email:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(20, 290, 56, 22);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Date_Of_Birth:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(20, 380, 137, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Nationality:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 340, 105, 20);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Gender:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(20, 420, 73, 22);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Check_In_Date:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(20, 470, 149, 22);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Check_Out_Date:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(20, 510, 161, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Room_Type:");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(20, 550, 113, 20);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Id_Type:");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(20, 630, 81, 22);

        jLocaleChooser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 2));
        getContentPane().add(jLocaleChooser1);
        jLocaleChooser1.setBounds(230, 340, 300, 22);

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer", "Firstname", "Lasname", "Address1", "Address2", "Mobile", "Email", "Nationality", "Date_Of_Birth", "Gender", "Check_In_Date", "Check_Out_Date", "Room_Type", "Room_Number", "Id_Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(28);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(690, 30, 1160, 620);

        jDateChooser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 2));
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(230, 470, 220, 26);

        jDateChooser2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 2));
        getContentPane().add(jDateChooser2);
        jDateChooser2.setBounds(230, 510, 220, 26);

        jDateChooser3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 2));
        getContentPane().add(jDateChooser3);
        jDateChooser3.setBounds(230, 380, 220, 26);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TotalCost.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TotalCost.setText("Total Cost");
        TotalCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalCostActionPerformed(evt);
            }
        });
        jPanel1.add(TotalCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 57, 210, 83));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Tax:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("Subtotal:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("Total:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jTextField17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 2));
        jPanel1.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 170, -1));

        jTextField20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 2));
        jPanel1.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 170, -1));

        jTextField21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 2));
        jPanel1.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 170, -1));

        reset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 60, 210, 83));

        Delete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 60, 210, 83));

        Exit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 60, 210, 83));

        update.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 210, 83));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 740, 1820, 210);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Room_Number:");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(20, 590, 143, 22);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Driving Lic.", "Aadhar Card", "Passport" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 2));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(230, 630, 220, 26);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 2));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(230, 420, 220, 26);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Classic", "Deluxe", "Executive", "Suite" }));
        jComboBox3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 2));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(230, 550, 220, 26);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("Room No.:");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(20, 590, 95, 22);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "001", "002", "003", "004", "005", "101", "102", "103", "104", "105", "201", "202", "203", "204", "205", "301", "302", "303", "304", "305" }));
        jComboBox4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 2));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(230, 590, 220, 26);

        jLabel28.setForeground(new java.awt.Color(255, 51, 51));
        jLabel28.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\architecture-beach-building-258154.jpg")); // NOI18N
        jLabel28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jLabel28);
        jLabel28.setBounds(0, 0, 1920, 1000);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
     DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
     if(jTable1.getSelectedRow()==-1)
     {
     if(jTable1.getSelectedColumn()==0)
     {
     JOptionPane.showMessageDialog(null, "hotel booking delete confirmed","Hotel Management System",
             JOptionPane.OK_OPTION);
     }
     else
     {
     JOptionPane.showMessageDialog(null, "hotel booking delete confirmed","Hotel Management System",
             JOptionPane.OK_OPTION);
     
     }    
     }
     else
     {
     model.removeRow(jTable1.getSelectedRow());
     
     }
    }//GEN-LAST:event_DeleteActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed

        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
          model.setRowCount(0);
          jTextField0.setText(null);
          jTextField1.setText(null);
          jTextField4.setText(null);
          jTextField3.setText(null);
          jTextField6.setText(null);
          jTextField5.setText(null);
          jTextField2.setText(null);
          jDateChooser3.setDate(null);
          jComboBox2.setSelectedIndex(0);
          jDateChooser1.setDate(null);
          jDateChooser2.setDate(null);
          jComboBox3.setSelectedIndex(0);
          jComboBox4.setSelectedIndex(0);
          jComboBox1.setSelectedIndex(0);
          jTextField20.setText(null);
          jTextField17.setText(null);
          jTextField21.setText(null);
          
          
        
          
          
    }//GEN-LAST:event_resetActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed
private JFrame frame;
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "confirm if you want to exit", "Hotel Management System",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
        System.exit(0);
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void TotalCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalCostActionPerformed
        int Classic = 1500;
         int Deluxe = 2000;
         int Executive = 2500;
         int Suite = 4000;
        
         SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
         Date Check_In_Date = null;
         Date Check_Out_Date = null;
         
        try{
        Check_In_Date=format.parse(format.format(jDateChooser1.getDate()));
        Check_Out_Date=format.parse(format.format(jDateChooser2.getDate()));
       
        }catch(ParseException e){}
      
        long Diff = Check_Out_Date.getTime()-Check_In_Date.getTime();
        int days = (int) (Diff/1000/60/60/24);
        
        if(jComboBox3.getSelectedItem().equals("Classic"))
        {
        jTextField21.setText(Integer.toString(days*Classic));
        jTextField20.setText(Integer.toString(days*Classic));
        jTextField17.setText(Integer.toString(days*Classic));
        
        double q = Double.parseDouble(jTextField20.getText());
        q=(q*0.05);
        String tax = Double.toString(q);
        jTextField20.setText(tax);
        
        double st = Double.parseDouble(jTextField17.getText());
        String subtotal = Double.toString(st);
        jTextField17.setText(subtotal);
        
        double t = Double.parseDouble(jTextField21.getText());
         int tt = (int) (t+q);
        String total=Double.toString(tt);
        jTextField21.setText(total);
        }
        
        else if(jComboBox3.getSelectedItem().equals("Deluxe"))
        {
        jTextField21.setText(Integer.toString(days*Deluxe));
        jTextField20.setText(Integer.toString(days*Deluxe));
        jTextField17.setText(Integer.toString(days*Deluxe));
        
        double q = Double.parseDouble(jTextField20.getText());
        q=(q*0.05);
        String tax = Double.toString(q);
        jTextField20.setText(tax);
        
        double st = Double.parseDouble(jTextField17.getText());
        String subtotal = Double.toString(st);
        jTextField17.setText(subtotal);
        
        double t = Double.parseDouble(jTextField21.getText());
         int tt = (int) (t+q);
        String total=Double.toString(tt);
        jTextField21.setText(total);
        }
        
        else if(jComboBox3.getSelectedItem().equals("Executive"))
        {
        jTextField21.setText(Integer.toString(days*Executive));
        jTextField20.setText(Integer.toString(days*Executive));
        jTextField17.setText(Integer.toString(days*Executive));
        
        double q = Double.parseDouble(jTextField20.getText());
        q=(q*0.05);
        String tax = Double.toString(q);
        jTextField20.setText(tax);
        
        double st = Double.parseDouble(jTextField17.getText());
        String subtotal = Double.toString(st);
        jTextField17.setText(subtotal);
        
        double t = Double.parseDouble(jTextField21.getText());
         int tt = (int) (t+q);
        String total=Double.toString(tt);
        jTextField21.setText(total);
        }
        
        else if(jComboBox3.getSelectedItem().equals("Suite"))
        {
        jTextField21.setText(Integer.toString(days*Suite));
        jTextField20.setText(Integer.toString(days*Suite));
        jTextField17.setText(Integer.toString(days*Suite));
        
        double q = Double.parseDouble(jTextField20.getText());
        q=(q*0.05);
        String tax = Double.toString(q);
        jTextField20.setText(tax);
        
        double st = Double.parseDouble(jTextField17.getText());
        String subtotal = Double.toString(st);
        jTextField17.setText(subtotal);
        
        double t = Double.parseDouble(jTextField21.getText());
         int tt = (int) (t+q);
        String total=Double.toString(tt);
        jTextField21.setText(total);
        }
        
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
          model.addRow(new Object[]{
          jTextField0.getText(),
          jTextField1.getText(),
          jTextField4.getText(),
          jTextField3.getText(),
          jTextField6.getText(),
          jTextField5.getText(),
          jTextField2.getText(),
          jLocaleChooser1.getSelectedItem(),
          jDateChooser3.getDate(),
          jComboBox2.getSelectedIndex(),
          jDateChooser1.getDate(),
          jDateChooser2.getDate(),
          jComboBox3.getSelectedIndex(),
          jComboBox4.getSelectedIndex(),
          jComboBox1.getSelectedIndex(),
          jTextField20.getText(),
          jTextField17.getText(),
          jTextField21.getText(),
    });    
    }//GEN-LAST:event_TotalCostActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
         Connection conn= null;
            Statement st=null;
            ResultSet rs=null;
           try
           { 
               Class.forName("com.mysql.cj.jdbc.Driver");
               conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","123456");
               conn.setAutoCommit(false);
               st=conn.createStatement();
               int row=jTable1.getSelectedRow();
               String Customer=(jTable1.getValueAt(row, 0).toString());
               String Firstname=(jTable1.getValueAt(row, 1).toString()); 
               String Lastname=(jTable1.getValueAt(row, 2).toString()); 
               String Address1=(jTable1.getValueAt(row, 3).toString()); 
               String Address2=(jTable1.getValueAt(row, 4).toString()); 
               String Mobile=(jTable1.getValueAt(row, 5).toString()); 
               String Email=(jTable1.getValueAt(row, 6).toString()); 
               String Nationality=(jTable1.getValueAt(row, 7).toString()); 
               String Date_Of_Birth=(jTable1.getValueAt(row, 8).toString()); 
               String Gender=(jTable1.getValueAt(row, 9).toString()); 
               String Check_In_Date=(jTable1.getValueAt(row, 10).toString()); 
               String Check_Out_Date=(jTable1.getValueAt(row, 11).toString()); 
               String Room_Type=(jTable1.getValueAt(row, 12).toString()); 
               String Room_Number=(jTable1.getValueAt(row, 13).toString()); 
               String Id_Type=(jTable1.getValueAt(row, 14).toString()); 
               String s="select * from hotel where Customer='"+Customer+"'";
               rs=st.executeQuery(s);
               if(rs.next())
               {  int result= JOptionPane.showConfirmDialog(null, "user existing, Do you want to update data?");
                 if(result==JOptionPane.YES_OPTION)
                 {
                 String update="update hotel where Customer='"+Customer+"'";
                 st.executeUpdate(update);
                 }else{
                 JOptionPane.showMessageDialog(null, "nothing to do");
                 
                 }
               }else{
                String insert="insert into hotel(Customer,Firstname,Lastname,Address1,Address2,Mobile,Email,Nationality,Date_Of_Birth,Gender,Check_In_Date,Check_Out_Date,Room_Type,Room_Number,Id_Type) "
                       + "values('"+Customer+"','"+Firstname+"','"+Lastname+"','"+Address1+"','"+Address2+"','"+Mobile+"','"+Email+"','"+Nationality+"','"+Date_Of_Birth+"','"+Gender+"','"+Check_In_Date+"','"+Check_Out_Date+"','"+Room_Type+"','"+Room_Number+"','"+Id_Type+"')";
               st.executeUpdate(insert);
               
               }
               rs.close();
               st.close();
               conn.commit();
               conn.close();
           }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           
           }
    }//GEN-LAST:event_updateActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hotel_System().setVisible(true);
            }
        });
    
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Exit;
    private javax.swing.JButton TotalCost;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField0;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton reset;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

   
}
