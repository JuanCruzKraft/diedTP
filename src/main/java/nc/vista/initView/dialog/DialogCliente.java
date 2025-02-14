/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package nc.vista.initView.dialog;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import nc.vista.initView.ClientesMenuPanel;

/**
 *
 * @author kraft
 */
public class DialogCliente extends javax.swing.JDialog {

   double coorX, coorY;
   ClientesMenuPanel panelSuperior;
   int id;
    public DialogCliente(java.awt.Frame parent, boolean modal, ArrayList clientData, ClientesMenuPanel panelSuperior) {
        super(parent, modal);
        initComponents();
        txtID.setText(String.valueOf(clientData.get(0)));
        id = (int)clientData.get(0);
        txtNombre.setText((String) clientData.get(1));
        txtDireccion.setText((String) clientData.get(2));
        txtMail.setText((String) clientData.get(3));
        txtCuit.setText(String.valueOf(clientData.get(4)));
        txtCoordenadas.setText("Longitud: " + String.valueOf(clientData.get(5)) + "\n    Latitud: " + String.valueOf(clientData.get(6)));
        coorX= (double) clientData.get(5);
        coorY= (double) clientData.get(6);
        this.panelSuperior = panelSuperior;
    }

    /**
     * This method is called from within the constructor to initixalize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCoordenadas = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMail = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCuit = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("DETALLE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 20;
        getContentPane().add(jLabel1, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ID:");
        jLabel2.setPreferredSize(new java.awt.Dimension(80, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel2, gridBagConstraints);

        txtID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtID.setText("jLabel3");
        txtID.setPreferredSize(new java.awt.Dimension(200, 16));
        jPanel1.add(txtID, new java.awt.GridBagConstraints());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Coordenadas:");
        jLabel4.setPreferredSize(new java.awt.Dimension(80, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel4, gridBagConstraints);

        txtCoordenadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCoordenadas.setText("jLabel5");
        txtCoordenadas.setPreferredSize(new java.awt.Dimension(200, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        jPanel1.add(txtCoordenadas, gridBagConstraints);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Direccion:");
        jLabel6.setPreferredSize(new java.awt.Dimension(80, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel6, gridBagConstraints);

        txtDireccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDireccion.setText("jLabel3");
        txtDireccion.setPreferredSize(new java.awt.Dimension(200, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        jPanel1.add(txtDireccion, gridBagConstraints);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Nombre:");
        jLabel8.setPreferredSize(new java.awt.Dimension(80, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel8, gridBagConstraints);

        txtNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNombre.setText("jLabel5");
        txtNombre.setPreferredSize(new java.awt.Dimension(200, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel1.add(txtNombre, gridBagConstraints);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Mail:");
        jLabel3.setPreferredSize(new java.awt.Dimension(80, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        jPanel1.add(jLabel3, gridBagConstraints);

        txtMail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMail.setText("jLabel5");
        txtMail.setPreferredSize(new java.awt.Dimension(200, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        jPanel1.add(txtMail, gridBagConstraints);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("CUIT:");
        jLabel7.setPreferredSize(new java.awt.Dimension(80, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel1.add(jLabel7, gridBagConstraints);

        txtCuit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCuit.setText("jLabel9");
        txtCuit.setPreferredSize(new java.awt.Dimension(200, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        jPanel1.add(txtCuit, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 50;
        getContentPane().add(jPanel1, gridBagConstraints);

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jButton1, gridBagConstraints);

        jButton2.setText("Iniciar Sesion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        getContentPane().add(jButton2, gridBagConstraints);

        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        getContentPane().add(jButton5, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        panelSuperior.crearModificarCliente(Integer.parseInt(txtID.getText()),txtNombre.getText(),txtDireccion.getText(),txtMail.getText(), txtCuit.getText(), coorX, coorY);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.panelSuperior.setCliente();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int eliminar = JOptionPane.showConfirmDialog(this,
            "Está seguro? Se cancelarán todos los pedidos no finalizados. Esta acción no puede revertirse",
            "Eliminar Cliente",JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if(eliminar == JOptionPane.OK_OPTION)
        {this.panelSuperior.eliminar(this.id);
        this.dispose();}
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtCoordenadas;
    private javax.swing.JLabel txtCuit;
    private javax.swing.JLabel txtDireccion;
    private javax.swing.JLabel txtID;
    private javax.swing.JLabel txtMail;
    private javax.swing.JLabel txtNombre;
    // End of variables declaration//GEN-END:variables
}
