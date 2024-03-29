/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package manager;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Manager_Video extends javax.swing.JFrame {

    /**
     * Creates new form Manager_Video
     */
    public Manager_Video() {
        initComponents();
        scanSQL();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Change = new javax.swing.JButton();
        txtVidID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_ManageVid = new javax.swing.JTable();
        txtVidCost = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtVidName = new javax.swing.JTextField();
        txtVidQua = new javax.swing.JTextField();
        Delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel10 = new javax.swing.JLabel();
        txtVidTyped = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Video's ID");

        Change.setText("Change");
        Change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeActionPerformed(evt);
            }
        });

        txtVidID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVidIDActionPerformed(evt);
            }
        });
        txtVidID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVidIDKeyTyped(evt);
            }
        });

        jLabel8.setText("Rent Cost");

        tb_ManageVid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Video ID", "Video Name", "Typed", "Rent Cost", "Quality"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_ManageVid);
        if (tb_ManageVid.getColumnModel().getColumnCount() > 0) {
            tb_ManageVid.getColumnModel().getColumn(0).setMinWidth(30);
            tb_ManageVid.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        txtVidCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVidCostActionPerformed(evt);
            }
        });

        jLabel9.setText("Quality");

        jLabel3.setText("Video's Name");

        txtVidQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVidQuaActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Manage Video");

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Out");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Typed");

        txtVidTyped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVidTypedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtVidID, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVidName))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Change)
                            .addComponent(Add))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Delete)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel10)))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtVidQua, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(txtVidCost)
                            .addComponent(txtVidTyped))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtVidID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add)
                    .addComponent(Delete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtVidName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Change)
                    .addComponent(jToggleButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVidTyped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVidQua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtVidCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void scanSQL(){
                try{    
                    DBAccess acc = new DBAccess();
                    String str = "select* from Video";
                    ResultSet rs = acc.Query(str);
                    DefaultTableModel tableModel = (DefaultTableModel)tb_ManageVid.getModel();
                    tableModel.setRowCount(0);
                    while(rs.next()){
                        String id = rs.getString(1);
                        String name = rs.getString(2);
                        String Typed = rs.getString(3);
                        String Quality = rs.getString(5);
                        String Cost = rs.getString(4);

                    String[] tb = {id, name, Typed, Cost, Quality};
                    tableModel.addRow(tb);   
                }
                }catch(Exception ex){

                }
            }
     private void CleanText(){
        txtVidID.setText("");  
        txtVidName.setText("");
        txtVidTyped.setText("");
        txtVidCost.setText("");
        txtVidQua.setText("");
    }
    private void ChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeActionPerformed
                // TODO add your handling code here:\
                String id = txtVidID.getText();
                String name = txtVidName.getText();
                String Typed = txtVidTyped.getText();
                String Cost = txtVidCost.getText();
                String Quality = txtVidQua.getText();
                DBAccess acc = new DBAccess();
                String str = "UPDATE Video set NameVideo ='"+ name+"', Typed = '"+Typed+"',RentCost = "+Cost+", Quality= "+Quality+" where ID_V="+id;
                acc.Query(str);
                scanSQL();
                CleanText();
    }//GEN-LAST:event_ChangeActionPerformed

    private void txtVidIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVidIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVidIDActionPerformed

    private void txtVidIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVidIDKeyTyped
        //
                DefaultTableModel tableModel = (DefaultTableModel) tb_ManageVid.getModel();
        tableModel.setRowCount(0);
        String ID = txtVidID.getText();
        try {
           DBAccess acc = new DBAccess();
            ResultSet rs = acc.Query("select* from Video where ID_V like '" +ID + "%'" );
            while (rs.next()) {
                String id = rs.getString(1);
                String name = rs.getString(2); 
                String Typed = rs.getString(3);
                String Quality = rs.getString(5);
                String Cost = rs.getString(4);                             
                txtVidName.setText(name);
                txtVidCost.setText(Cost);
                txtVidQua.setText(Quality);
                String[] QQ = {id, name, Typed, Cost, Quality};
                tableModel.addRow(QQ);
            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_txtVidIDKeyTyped

    private void txtVidCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVidCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVidCostActionPerformed

    private void txtVidQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVidQuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVidQuaActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
                // TODO add your handling code here:
                String id = txtVidID.getText();
                DBAccess acc = new DBAccess();
                String str = "DELETE FROM MembershipCard WHERE ID_V="+id;
                acc.Query(str);
                scanSQL();
                CleanText();
    }//GEN-LAST:event_DeleteActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
                // TODO add your handling code here:
                int Id = Integer.parseInt(txtVidID.getText());
                String name = txtVidName.getText();
                String Typed = txtVidTyped.getText();
                int Cost = Integer.parseInt(txtVidCost.getText());            
                int Quality = Integer.parseInt(txtVidQua.getText());
                DBAccess acc = new DBAccess();
                String str = "INSERT INTO Video (ID_V,NameVideo,Typed,RentCost, Quality) VALUES ("+Id+",'"+ name+"','"+Typed+"',"+Cost+","+Quality+")";
                acc.Query(str);
                scanSQL();
                CleanText();
    }//GEN-LAST:event_AddActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        //  dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void txtVidTypedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVidTypedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVidTypedActionPerformed

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
            java.util.logging.Logger.getLogger(Manager_Video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager_Video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager_Video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager_Video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager_Video().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Change;
    private javax.swing.JButton Delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tb_ManageVid;
    private javax.swing.JTextField txtVidCost;
    private javax.swing.JTextField txtVidID;
    private javax.swing.JTextField txtVidName;
    private javax.swing.JTextField txtVidQua;
    private javax.swing.JTextField txtVidTyped;
    // End of variables declaration//GEN-END:variables
}
