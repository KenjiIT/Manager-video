/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package manager;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinhneee
 */
public class Video extends javax.swing.JFrame {

    /**
     * Creates new form Video
     */
    public Video() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMemID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMemName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMemStatus = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMemPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtVidID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtVidName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtVidCost = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtVidQuality = new javax.swing.JTextField();
        Borrow = new javax.swing.JButton();
        Return = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtActive = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtVidTyped = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtActive1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtBdate = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Member");

        jLabel2.setText("Member's ID");

        txtMemID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMemIDKeyTyped(evt);
            }
        });

        jLabel3.setText("Member's Name");

        txtMemName.setEditable(false);
        txtMemName.setEnabled(false);

        jLabel4.setText("Status");

        txtMemStatus.setEditable(false);
        txtMemStatus.setEnabled(false);

        jLabel5.setText("Phone");

        txtMemPhone.setEditable(false);
        txtMemPhone.setEnabled(false);

        jLabel6.setText("Video");

        jLabel7.setText("Video's ID");

        txtVidID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVidIDKeyTyped(evt);
            }
        });

        jLabel8.setText("Video's Name");

        txtVidName.setEditable(false);
        txtVidName.setEnabled(false);

        jLabel9.setText("Rent Cost");

        txtVidCost.setEditable(false);
        txtVidCost.setEnabled(false);

        jLabel10.setText("Quality");

        txtVidQuality.setEditable(false);
        txtVidQuality.setEnabled(false);

        Borrow.setText("Borrow");
        Borrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrowActionPerformed(evt);
            }
        });

        Return.setText("Return");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });

        jLabel11.setText("Active");

        txtActive.setEditable(false);
        txtActive.setEnabled(false);

        jLabel12.setText("Typed");

        txtVidTyped.setEditable(false);
        txtVidTyped.setEnabled(false);

        jLabel13.setText("RDate");

        txtActive1.setEditable(false);
        txtActive1.setEnabled(false);

        jLabel14.setText("BDate");

        txtBdate.setEditable(false);
        txtBdate.setEnabled(false);

        jMenu1.setText("Member");

        jMenuItem1.setText("Manage Member");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Video");

        jMenuItem2.setText("Manage Video");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(366, 366, 366)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)
                                        .addComponent(txtActive1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)
                                        .addComponent(txtActive))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)
                                        .addComponent(txtMemPhone))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtMemID))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMemName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(56, 56, 56)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtBdate)
                                            .addComponent(txtMemStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtVidQuality, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtVidName)
                                            .addComponent(txtVidID, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtVidTyped, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtVidCost, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(Borrow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(Return)
                        .addGap(189, 189, 189)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVidID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVidName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtVidTyped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtVidQuality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtVidCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMemID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMemStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtActive1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtMemPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtActive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Borrow)
                    .addComponent(Return))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void txtVidIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVidIDKeyTyped
        // TODO add your handling code here:
        String text = txtVidID.getText();
        DBAccess acc = new DBAccess();
        String ID = text;
        try {   
            ResultSet rs = acc.Query("select* from Video where ID_V like '" +ID + "%'");
            while(rs.next())
            {
                String id = rs.getString(1);
                String Name = rs.getString(2);
                String Typed = rs.getString(3);
                String Quality = rs.getString(4);
                String RentCost = rs.getString(5);
                
                txtVidName.setText(Name);
                txtVidTyped.setText(Typed);
                txtVidQuality.setText(Quality);
                txtVidCost.setText(RentCost);
            }
           
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_txtVidIDKeyTyped

    private void loadsql()
    {
        String ID = txtMemID.getText();
            try {
            DBAccess acc = new DBAccess();
            ResultSet rs = acc.Query("select* from MembershipCard where ID_MC like '" +ID + "%'" );
            while (rs.next()) {
                String name = rs.getString(2);
                String status = rs.getString(5);
                String StatusT;
                if(Integer.parseInt(status) == 1)
                {
                     StatusT = "Rented";
                }
                else if(Integer.parseInt(status) == 0)
                {
                     StatusT = "not";
                }
                else
                {
                    StatusT = "Overdue";
                }
                String Active = rs.getString(8);
                String ActiveT;
                if(Integer.parseInt(Active) == 1)
                {
                     ActiveT = "yes";
                }
                else
                {
                     ActiveT = "no";
                }
                String Bdate = rs.getString(6);
                String Rdate = rs.getString(7);
                String Phone = rs.getString(3);
                
                txtBdate.setText(Bdate);
                txtActive1.setText(Rdate);                           
                txtMemName.setText(name);
                txtMemStatus.setText(StatusT);
                txtMemPhone.setText(Phone);
                txtActive.setText(ActiveT);
            }
        } catch (Exception ex) {

        }
            ID = txtMemID.getText();
            try {
            DBAccess acc = new DBAccess();
            ResultSet rs = acc.Query("select* from MembershipCard where ID_MC like '" +ID + "%'" );
            while (rs.next()) {
                String name = rs.getString(2);
                String status = rs.getString(5);
                String StatusT;
                if(Integer.parseInt(status) == 1)
                {
                     StatusT = "Rented";
                }
                else if(Integer.parseInt(status) == 0)
                {
                     StatusT = "not";
                }
                else
                {
                    StatusT = "Overdue";
                }
                String Active = rs.getString(8);
                String ActiveT;
                if(Integer.parseInt(Active) == 1)
                {
                     ActiveT = "yes";
                }
                else
                {
                     ActiveT = "no";
                }
                String Bdate = rs.getString(6);
                String Rdate = rs.getString(7);
                String Phone = rs.getString(3);
                
                txtBdate.setText(Bdate);
                txtActive1.setText(Rdate);                           
                txtMemName.setText(name);
                txtMemStatus.setText(StatusT);
                txtMemPhone.setText(Phone);
                txtActive.setText(ActiveT);
            }
        } catch (Exception ex) {

        }
    }
    private void txtMemIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMemIDKeyTyped
        // TODO add your handling code here:
            String ID = txtMemID.getText();
            try {
            DBAccess acc = new DBAccess();
            ResultSet rs = acc.Query("select* from MembershipCard where ID_MC like '" +ID + "%'" );
            while (rs.next()) {
                String name = rs.getString(2);
                String status = rs.getString(5);
                String StatusT;
                if(Integer.parseInt(status) == 1)
                {
                     StatusT = "Rented";
                }
                else if(Integer.parseInt(status) == 0)
                {
                     StatusT = "not";
                }
                else
                {
                    StatusT = "Overdue";
                }
                String Active = rs.getString(8);
                String ActiveT;
                if(Integer.parseInt(Active) == 1)
                {
                     ActiveT = "yes";
                }
                else
                {
                     ActiveT = "no";
                }
                String Bdate = rs.getString(6);
                String Rdate = rs.getString(7);
                String Phone = rs.getString(3);
                
                txtBdate.setText(Bdate);
                txtActive1.setText(Rdate);                           
                txtMemName.setText(name);
                txtMemStatus.setText(StatusT);
                txtMemPhone.setText(Phone);
                txtActive.setText(ActiveT);
            }
        } catch (Exception ex) {

        }
            
        
    }//GEN-LAST:event_txtMemIDKeyTyped

    private void BorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrowActionPerformed
        // TODO add your handling code here:
           String ID = txtMemID.getText();
            try {
            DBAccess acc = new DBAccess();
            ResultSet rs = acc.Query("select* from MembershipCard where ID_MC like '" +ID + "%'" );
            String id = null, name, StatusT = null;
            while (rs.next()) {
                id = rs.getString(1);
                name = rs.getString(2);
                String status = rs.getString(5);
                if(Integer.parseInt(status) == 1)
                {
                     StatusT = "Rented";
                }
                else if(Integer.parseInt(status) == 0)
                {
                     StatusT = "not";
                }
                else
                {
                    StatusT = "Overdue";
                }
                String Active = rs.getString(8);
                String ActiveT;
                if(Integer.parseInt(Active) == 1)
                {
                     ActiveT = "yes";
                }
                else
                {
                     ActiveT = "no";
                }
                String Phone = rs.getString(3);  
                String Bdate = rs.getString(6);
                String Rdate = rs.getString(7);
                
                txtBdate.setText(Bdate);
                txtActive1.setText(Rdate);
                txtMemName.setText(name);
                txtMemStatus.setText(StatusT);
                txtMemPhone.setText(Phone);
                txtActive.setText(ActiveT);
            }
            LocalDate Datenow = LocalDate.now();
            String check = txtMemStatus.getText();
            String Active = txtActive.getText();    
            if(Active.equals("yes"))
            {
                if(check.equals("not"))
                {            
                    rs = acc.Query("UPDATE MembershipCard set Status = 1,BorrowDay = '"+Datenow.toString()+"', ReturnDay = null where ID_MC = "+id);
                    String text = txtVidID.getText();
                     acc = new DBAccess();
                    ID = text;
                    try {   
                         rs = acc.Query("select* from Video where ID_V like '" +ID + "%'");
                         id = null;
                        while(rs.next())
                        {
                             id = rs.getString(1);
                            String Name = rs.getString(2);
                            String Typed = rs.getString(3);
                            String Quality = rs.getString(4);
                            String RentCost = rs.getString(5);

                            txtVidName.setText(Name);
                            txtVidTyped.setText(Typed);
                            txtVidQuality.setText(Quality);
                            txtVidCost.setText(RentCost);
                        }
                      int Quality = Integer.parseInt(txtVidQuality.getText()) ;
                      if(Quality>0)
                      {
                          Quality -=1;
                          rs = acc.Query("UPDATE Video set Quality = "+Quality+" where ID_V = "+id);
                          JOptionPane.showMessageDialog(null,"Successfull");
                          loadsql();
                      }
                      else
                      {
                        JOptionPane.showMessageDialog(null,"Out of Stock!!!");
                      }
                    } catch (Exception ex) {

                    }        
                     
                }
                else
                {
                   JOptionPane.showMessageDialog(null,"The member had Rented!"); 
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"The Account has lock!");
            }
                
            
        } catch (Exception ex) {

        }
    
    }//GEN-LAST:event_BorrowActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new Manager_Member().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new Manager_Video().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        // TODO add your handling code here:
        String ID = txtMemID.getText();
       
            try {
            DBAccess acc = new DBAccess();
            ResultSet rs = acc.Query("select* from MembershipCard where ID_MC like '" +ID + "%'" );
            String Memid = null, name, StatusT = null;
            while (rs.next()) {
                Memid = rs.getString(1);
                name = rs.getString(2);
                String status = rs.getString(5);
                if(Integer.parseInt(status) == 1)
                {
                     StatusT = "Rented";
                }
                else if(Integer.parseInt(status) == 0)
                {
                     StatusT = "not";
                }
                else
                {
                    StatusT = "Overdue";
                }
                String Active = rs.getString(8);
                String Bdate = rs.getString(6);
                String Rdate = rs.getString(7);
                String ActiveT;
                if(Integer.parseInt(Active) == 1)
                {
                     ActiveT = "yes";
                }
                else
                {
                     ActiveT = "no";
                }
                String Phone = rs.getString(3);
                txtBdate.setText(Bdate);
                txtActive1.setText(Rdate);
                txtMemName.setText(name);
                txtMemStatus.setText(StatusT);
                txtMemPhone.setText(Phone);
                txtActive.setText(ActiveT);
            }
            String dateB = txtBdate.getText();
            String dateR = txtActive1.getText();
            String check = txtMemStatus.getText();
            String Active = txtActive.getText();
            String id;            
            if(Active.equals("yes"))
            {
                if(check.equals("Rented"))
                {            
                    
                    String text = txtVidID.getText();
                     acc = new DBAccess();
                    ID = text;
                    try {   
                         rs = acc.Query("select* from Video where ID_V like '" +ID + "%'");
                         id = null;
                        while(rs.next())
                        {
                             id = rs.getString(1);
                            String Name = rs.getString(2);
                            String Typed = rs.getString(3);
                            String Quality = rs.getString(4);
                            String RentCost = rs.getString(5);

                            txtVidName.setText(Name);
                            txtVidTyped.setText(Typed);
                            txtVidQuality.setText(Quality);
                            txtVidCost.setText(RentCost);
                        }
                        LocalDate BDate = LocalDate.parse(dateB);
                        LocalDate Rdate1 = BDate.plusDays(15);
                        LocalDate Rdate2 = LocalDate.now();
                        if(Rdate2.isAfter(Rdate1))
                        {
                            rs = acc.Query("UPDATE MembershipCard set Status = 2, ReturnDay = '"+Rdate2.toString()+"' where ID_MC = "+Memid);
                            JOptionPane.showMessageDialog(null,"The member has Overdue");
                            int Quality = Integer.parseInt(txtVidQuality.getText()) ;
                            Quality +=1;
                            rs = acc.Query("UPDATE Video set Quality = "+Quality+" where ID_V = "+id);
                            JOptionPane.showMessageDialog(null,"Successfull");
                            loadsql();
                        }
                        else
                        {
                            rs = acc.Query("UPDATE MembershipCard set Status = 0, ReturnDay = '"+Rdate2.toString()+"' where ID_MC = "+Memid);
                            int Quality = Integer.parseInt(txtVidQuality.getText()) ;
                            Quality +=1;
                            rs = acc.Query("UPDATE Video set Quality = "+Quality+" where ID_V = "+id);
                            JOptionPane.showMessageDialog(null,"Successfull");
                            loadsql();
                        }                    
                                                
                    } catch (Exception ex) {

                    }        
                     
                }
                else
                {
                   JOptionPane.showMessageDialog(null,"The member has not rent yet!"); 
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"The Account has lock!");
            }
                
            
        } catch (Exception ex) {

        }
    
    }//GEN-LAST:event_ReturnActionPerformed

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
            java.util.logging.Logger.getLogger(Video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Video().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrow;
    private javax.swing.JButton Return;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTextField txtActive;
    private javax.swing.JTextField txtActive1;
    private javax.swing.JTextField txtBdate;
    private javax.swing.JTextField txtMemID;
    private javax.swing.JTextField txtMemName;
    private javax.swing.JTextField txtMemPhone;
    private javax.swing.JTextField txtMemStatus;
    private javax.swing.JTextField txtVidCost;
    private javax.swing.JTextField txtVidID;
    private javax.swing.JTextField txtVidName;
    private javax.swing.JTextField txtVidQuality;
    private javax.swing.JTextField txtVidTyped;
    // End of variables declaration//GEN-END:variables
}
