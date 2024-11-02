/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package nc.vista.vendedor;

import java.util.Arrays;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import nc.controlador.PedidoController;
import nc.vista.PersonalizatedTableModel;

/**
 *
 * @author nicol
 */
public class PedidosMenuPanelVendedor extends javax.swing.JPanel {
    private enum filterMode{
        ID,
        VENDEDOR,
        CLIENTE,
        AMOUNTITEM,
        PRICE,
        ESTADO,
        NONE
    }
    private PersonalizatedTableModel modeloPedido;
    private PedidoController pedidos;
    private TableRowSorter<PersonalizatedTableModel> sorter;
    private filterMode actualFilter;
    private int vendedorID = -1;
    private VendoresFrame frameSuperior;
    /**
     * Creates new form ItemMenuPanel
     */
    public PedidosMenuPanelVendedor(){
        pedidos = new PedidoController();
        List<String> modeloTableName = Arrays.asList("ID", "Cliente", "Cantidad de Items", "Precio", "Estado");
        modeloPedido = new PersonalizatedTableModel(modeloTableName, pedidos.loadData());
        sorter = new TableRowSorter<>(modeloPedido);
        actualFilter = filterMode.ID;
        initComponents();
    
    }
    public void setFrameSuperior(VendoresFrame frame){
        this.frameSuperior = frame;
    }
    public void setVendedor(int ID){
        this.vendedorID = ID;
        this.pedidos.setID(ID, true);
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

        jButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        contentTable = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton3 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jPanel7.setLayout(new java.awt.GridBagLayout());

        contentTable.setAutoCreateRowSorter(true);
        contentTable.setModel(this.modeloPedido);
        contentTable.setRowSorter(sorter);
        jScrollPane10.setViewportView(contentTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel7.add(jScrollPane10, gridBagConstraints);

        jTextPane3.setEditable(false);
        jTextPane3.setText("Lista de Pedidos");
        jTextPane3.setToolTipText("");
        jTextPane3.setAutoscrolls(false);
        jTextPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPane3.setFocusable(false);
        jScrollPane13.setViewportView(jTextPane3);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel7.add(jScrollPane13, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        jPanel7.add(jSeparator1, gridBagConstraints);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(this.modeloPedido.getColumnName()));
        jComboBox1.setMinimumSize(new java.awt.Dimension(135, 22));
        jComboBox1.setPreferredSize(new java.awt.Dimension(135, 22));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);

        jTextPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextPane1.setToolTipText("");
        jTextPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextPane1.setPreferredSize(new java.awt.Dimension(180, 20));
        jTextPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextPane1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTextPane1);

        jPanel1.add(jScrollPane1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel7.add(jPanel1, gridBagConstraints);

        jButton3.setText("Ver detalle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel7.add(jButton3, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextPane1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPane1KeyPressed
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            String text;
            text = jTextPane1.getText();
            sorter.setRowFilter(null);
            jTextPane1.setText("");
            if(!text.isBlank()){
                try{
                    switch(actualFilter){
                        case ID-> sorter.setRowFilter(RowFilter.numberFilter(RowFilter.ComparisonType.EQUAL, Integer.valueOf(text), 0));
                        case VENDEDOR -> sorter.setRowFilter(RowFilter.regexFilter(text, 1));
                        case CLIENTE -> sorter.setRowFilter(RowFilter.regexFilter(text, 2));
                        case AMOUNTITEM -> sorter.setRowFilter(RowFilter.numberFilter(RowFilter.ComparisonType.EQUAL, Integer.valueOf(text), 3));
                        case PRICE -> sorter.setRowFilter(RowFilter.numberFilter(RowFilter.ComparisonType.EQUAL, Integer.valueOf(text), 4));
                        case ESTADO -> sorter.setRowFilter(RowFilter.regexFilter(text, 5));
                    }
                }catch(NumberFormatException e){}
            }
            
        }
    }//GEN-LAST:event_jTextPane1KeyPressed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        String currentSelection = (String) jComboBox1.getSelectedItem();
        switch (currentSelection) {
            case "Tipo de Búsqueda":
                this.actualFilter = filterMode.NONE;
                break;
            case "ID":
                this.actualFilter = filterMode.ID;
                break;
            case "Vendedor":
                this.actualFilter = filterMode.VENDEDOR;
                break;
            case "Cliente":
                this.actualFilter = filterMode.CLIENTE;
                break;
            case "Cantidad de Items":
                this.actualFilter = filterMode.AMOUNTITEM;
                break;
            case "Precio":
            this.actualFilter = filterMode.PRICE;
            case "Estado":
            this.actualFilter = filterMode.ESTADO;
            break;
            default:
                break;
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable contentTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane3;
    // End of variables declaration//GEN-END:variables
}