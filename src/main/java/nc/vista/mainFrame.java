/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nc.vista;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import nc.controlador.ItemMenuController;
import nc.modelo.ItemMenuDAOandMemory.ItemMenuMemory;
import nc.modelo.initGen;

/**
 *
 * @author nicol
 */
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    private ItemMenuTableModelo modeloItemMenu;
    private ItemMenuController itemsMenu;
    public mainFrame() {
        initGen.run();
        itemsMenu = new ItemMenuController(ItemMenuMemory.getInstancia());
        modeloItemMenu = new ItemMenuTableModelo(itemsMenu.loadData());
        initComponents();
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTable2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTable3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTable4.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable2.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable3.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable4.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jSplitPane7 = new javax.swing.JSplitPane();
        jButton4 = new javax.swing.JButton();
        jSplitPane8 = new javax.swing.JSplitPane();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextPane7 = new javax.swing.JTextPane();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextPane8 = new javax.swing.JTextPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jSplitPane5 = new javax.swing.JSplitPane();
        jButton3 = new javax.swing.JButton();
        jSplitPane6 = new javax.swing.JSplitPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextPane6 = new javax.swing.JTextPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jScrollPane18 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jSplitPane2 = new javax.swing.JSplitPane();
        jButton2 = new javax.swing.JButton();
        jSplitPane4 = new javax.swing.JSplitPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSplitPane1 = new javax.swing.JSplitPane();
        jButton1 = new javax.swing.JButton();
        jSplitPane3 = new javax.swing.JSplitPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane6.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jTabbedPane1.setToolTipText("");

        jPanel8.setLayout(new java.awt.GridBagLayout());

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane14.setViewportView(jTable4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel8.add(jScrollPane14, gridBagConstraints);

        jButton4.setText("Crear Nuevo Vendedor");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jSplitPane7.setLeftComponent(jButton4);

        jTextArea5.setColumns(20);
        jTextArea5.setRows(1);
        jTextArea5.setPreferredSize(new java.awt.Dimension(232, 10));
        jScrollPane15.setViewportView(jTextArea5);

        jSplitPane8.setRightComponent(jScrollPane15);

        jTextPane7.setEditable(false);
        jTextPane7.setText("Buscador:");
        jTextPane7.setAutoscrolls(false);
        jTextPane7.setFocusable(false);
        jScrollPane16.setViewportView(jTextPane7);

        jSplitPane8.setLeftComponent(jScrollPane16);

        jSplitPane7.setRightComponent(jSplitPane8);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel8.add(jSplitPane7, gridBagConstraints);

        jTextPane8.setEditable(false);
        jTextPane8.setText("Lista de Vendedores");
        jTextPane8.setToolTipText("");
        jTextPane8.setAutoscrolls(false);
        jTextPane8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPane8.setFocusable(false);
        jScrollPane17.setViewportView(jTextPane8);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel8.add(jScrollPane17, gridBagConstraints);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 819, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Clientes", jPanel3);

        jPanel7.setLayout(new java.awt.GridBagLayout());

        jTable3.setModel(this.modeloItemMenu);
        jTable3.setCellSelectionEnabled(true);
        jTable3.setRowSorter(new ItemMenuRowSorter(jTable3));
        jScrollPane10.setViewportView(jTable3);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel7.add(jScrollPane10, gridBagConstraints);

        jButton3.setText("Crear Nuevo ItemMenu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jSplitPane5.setLeftComponent(jButton3);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(1);
        jTextArea4.setPreferredSize(new java.awt.Dimension(232, 10));
        jScrollPane11.setViewportView(jTextArea4);

        jSplitPane6.setRightComponent(jScrollPane11);

        jTextPane6.setEditable(false);
        jTextPane6.setText("Buscador:");
        jTextPane6.setAutoscrolls(false);
        jTextPane6.setFocusable(false);
        jScrollPane12.setViewportView(jTextPane6);

        jSplitPane6.setLeftComponent(jScrollPane12);

        jSplitPane5.setRightComponent(jSplitPane6);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel7.add(jSplitPane5, gridBagConstraints);

        jTextPane3.setEditable(false);
        jTextPane3.setText("Lista de ItemMenu");
        jTextPane3.setToolTipText("");
        jTextPane3.setAutoscrolls(false);
        jTextPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPane3.setFocusable(false);
        jScrollPane13.setViewportView(jTextPane3);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel7.add(jScrollPane13, gridBagConstraints);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane18.setViewportView(jList1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        jPanel7.add(jScrollPane18, gridBagConstraints);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 819, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("ItemMenu", jPanel4);

        jPanel6.setLayout(new java.awt.GridBagLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel6.add(jScrollPane3, gridBagConstraints);

        jButton2.setText("Crear Nuevo Vendedor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jSplitPane2.setLeftComponent(jButton2);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(1);
        jTextArea3.setPreferredSize(new java.awt.Dimension(232, 10));
        jScrollPane8.setViewportView(jTextArea3);

        jSplitPane4.setRightComponent(jScrollPane8);

        jTextPane5.setEditable(false);
        jTextPane5.setText("Buscador:");
        jTextPane5.setAutoscrolls(false);
        jTextPane5.setFocusable(false);
        jScrollPane9.setViewportView(jTextPane5);

        jSplitPane4.setLeftComponent(jScrollPane9);

        jSplitPane2.setRightComponent(jSplitPane4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel6.add(jSplitPane2, gridBagConstraints);

        jTextPane2.setEditable(false);
        jTextPane2.setText("Lista de Vendedores");
        jTextPane2.setToolTipText("");
        jTextPane2.setAutoscrolls(false);
        jTextPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPane2.setFocusable(false);
        jScrollPane4.setViewportView(jTextPane2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel6.add(jScrollPane4, gridBagConstraints);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 819, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Pedidos", jPanel5);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel2.add(jScrollPane1, gridBagConstraints);

        jButton1.setText("Crear Nuevo Vendedor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jSplitPane1.setLeftComponent(jButton1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(1);
        jTextArea2.setPreferredSize(new java.awt.Dimension(232, 10));
        jScrollPane5.setViewportView(jTextArea2);

        jSplitPane3.setRightComponent(jScrollPane5);

        jTextPane4.setEditable(false);
        jTextPane4.setText("Buscador:");
        jTextPane4.setAutoscrolls(false);
        jTextPane4.setFocusable(false);
        jScrollPane7.setViewportView(jTextPane4);

        jSplitPane3.setLeftComponent(jScrollPane7);

        jSplitPane1.setRightComponent(jSplitPane3);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel2.add(jSplitPane1, gridBagConstraints);

        jTextPane1.setEditable(false);
        jTextPane1.setText("Lista de Vendedores");
        jTextPane1.setToolTipText("");
        jTextPane1.setAutoscrolls(false);
        jTextPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPane1.setFocusable(false);
        jScrollPane2.setViewportView(jTextPane1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel2.add(jScrollPane2, gridBagConstraints);

        jTabbedPane1.addTab("Vendedores", jPanel2);

        getContentPane().add(jTabbedPane1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JSplitPane jSplitPane4;
    private javax.swing.JSplitPane jSplitPane5;
    private javax.swing.JSplitPane jSplitPane6;
    private javax.swing.JSplitPane jSplitPane7;
    private javax.swing.JSplitPane jSplitPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTextPane jTextPane6;
    private javax.swing.JTextPane jTextPane7;
    private javax.swing.JTextPane jTextPane8;
    // End of variables declaration//GEN-END:variables
}