/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package nc.vista.vendedor.dialog;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import nc.controller.ItemMenuController;
import nc.excepciones.ItemNoEncontradoException;

/**
 *
 * @author nicol
 */
public class ItemMenuVer extends javax.swing.JDialog {

    /**
     * Creates new form ItemPedidoVer
     */
    private ItemMenuController controller;
    private int ID;

    public ItemMenuVer(java.awt.Frame parent, boolean modal, int id, ItemMenuController controller) throws ItemNoEncontradoException {
        super(parent, modal);
        initComponents();
        this.controller = controller;
        this.ID = id;
        List propiedades = controller.getItemMenu(id);
        this.IDLabel.setText("ID: " + propiedades.get(0).toString());
        this.TextNombre.setText(propiedades.get(1).toString());
        this.TextDescripcion.setText(propiedades.get(2).toString());
        this.LabelVendedor.setText("Vendedor: " + propiedades.get(3).toString());
        this.TextPrecio.setText(propiedades.get(4).toString());
        this.BotonAceptar.setVisible(false);
        this.BotonAceptar.updateUI();

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

        jLabel2 = new javax.swing.JLabel();
        IDLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextNombre = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextDescripcion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextPrecio = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BotonCerrar = new javax.swing.JButton();
        BotonAceptar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JToggleButton();
        LabelVendedor = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        IDLabel.setText("ID: ");
        getContentPane().add(IDLabel, new java.awt.GridBagConstraints());

        jScrollPane1.setToolTipText("");
        jScrollPane1.setFocusable(false);

        TextNombre.setEnabled(false);
        TextNombre.setPreferredSize(new java.awt.Dimension(140, 21));
        jScrollPane1.setViewportView(TextNombre);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        TextDescripcion.setColumns(20);
        TextDescripcion.setRows(5);
        TextDescripcion.setEnabled(false);
        jScrollPane2.setViewportView(TextDescripcion);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jScrollPane2, gridBagConstraints);

        jLabel3.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        getContentPane().add(jLabel3, gridBagConstraints);

        TextPrecio.setEnabled(false);
        TextPrecio.setMinimumSize(new java.awt.Dimension(64, 21));
        TextPrecio.setPreferredSize(new java.awt.Dimension(140, 21));
        jScrollPane3.setViewportView(TextPrecio);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jScrollPane3, gridBagConstraints);

        jLabel4.setText("Precio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setText("Descripcion:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jLabel5, gridBagConstraints);

        BotonCerrar.setText("Cerrar");
        BotonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        getContentPane().add(BotonCerrar, gridBagConstraints);

        BotonAceptar.setText("Aceptar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        getContentPane().add(BotonAceptar, gridBagConstraints);

        BotonModificar.setText("Modificar");
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(BotonModificar, gridBagConstraints);

        LabelVendedor.setText("Vendedor:");
        getContentPane().add(LabelVendedor, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonCerrarActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        if (this.BotonModificar.isSelected()) {
            rutinaModificacion();
        } else {
            try {
                rutinaLimpieza();
            } catch (ItemNoEncontradoException ex) {
                Logger.getLogger(ItemMenuVer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void rutinaLimpieza() throws ItemNoEncontradoException {
        List propiedades = controller.getItemMenu(this.ID);
        this.IDLabel.setText("ID: " + propiedades.get(0).toString());
        this.TextNombre.setText(propiedades.get(1).toString());
        this.TextDescripcion.setText(propiedades.get(2).toString());
        this.LabelVendedor.setText(propiedades.get(3).toString());
        this.TextPrecio.setText(propiedades.get(4).toString());
        this.BotonAceptar.setVisible(false);
        this.BotonAceptar.updateUI();
        this.BotonCerrar.setVisible(true);
        this.BotonCerrar.updateUI();
        this.BotonModificar.setText("Modificar");
        this.BotonModificar.updateUI();
        this.TextNombre.setEnabled(false);
        this.TextDescripcion.setEnabled(false);
        this.TextPrecio.setEnabled(false);

    }

    private void rutinaModificacion() {
        this.TextNombre.setEnabled(true);
        this.TextDescripcion.setEnabled(true);
        this.TextPrecio.setEnabled(true);
        this.BotonCerrar.setVisible(false);
        this.BotonCerrar.updateUI();
        this.BotonAceptar.setVisible(true);
        this.BotonAceptar.updateUI();
        this.BotonModificar.setText("Cancelar");
        this.BotonModificar.updateUI();

    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAceptar;
    private javax.swing.JButton BotonCerrar;
    private javax.swing.JToggleButton BotonModificar;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JLabel LabelVendedor;
    private javax.swing.JTextArea TextDescripcion;
    private javax.swing.JTextPane TextNombre;
    private javax.swing.JTextPane TextPrecio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
