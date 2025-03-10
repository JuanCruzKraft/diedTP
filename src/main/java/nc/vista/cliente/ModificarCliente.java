/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nc.vista.cliente;

import nc.vista.initView.ClientesMenuPanel;

/**
 *
 * @author jereb
 */
public class ModificarCliente extends javax.swing.JFrame {

   ClientesMenuPanel panelSuperior;
   int id;
   String name, dir, mail, cuit;
   double coorX, coorY;
    public ModificarCliente() {
        initComponents();
    }
    public ModificarCliente(int id, String nombre, String direccion, String mail, String cuit, double coorX, double coorY, ClientesMenuPanel panelSuperior){
        initComponents();
        txtId.setText(String.valueOf(id));
        tfName.setText(nombre);
        tfDir.setText(direccion);
        tfMail.setText(mail);
        tfCuit.setText(cuit);
        tfCoorX.setText(String.valueOf(coorX));
        tfCoorY.setText(String.valueOf(coorY));
        this.panelSuperior= panelSuperior;
        this.id = id;
        this.name =nombre;
        this.dir = direccion;
        this.mail = mail;
        this.cuit = cuit;
        this.coorX = coorX;
        this.coorY = coorY;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tfName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfDir = new javax.swing.JTextField();
        tfMail = new javax.swing.JTextField();
        tfCuit = new javax.swing.JTextField();
        tfCoorX = new javax.swing.JTextField();
        tfCoorY = new javax.swing.JTextField();
        txtId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("ID: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setText("Nombre: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setText("Direccion: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        getContentPane().add(jButton1, gridBagConstraints);

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        getContentPane().add(jButton2, gridBagConstraints);

        tfName.setText("jTextField2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 110;
        gridBagConstraints.insets = new java.awt.Insets(0, 16, 0, 16);
        getContentPane().add(tfName, gridBagConstraints);

        jLabel4.setText("Mail:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setText("Cuit:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 0);
        getContentPane().add(jLabel5, gridBagConstraints);

        jLabel6.setText("Coordenadas: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 0);
        getContentPane().add(jLabel6, gridBagConstraints);

        tfDir.setText("jTextField3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 110;
        gridBagConstraints.insets = new java.awt.Insets(0, 16, 0, 16);
        getContentPane().add(tfDir, gridBagConstraints);

        tfMail.setText("jTextField4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 170;
        gridBagConstraints.insets = new java.awt.Insets(0, 16, 0, 16);
        getContentPane().add(tfMail, gridBagConstraints);

        tfCuit.setText("jTextField5");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 110;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 15);
        getContentPane().add(tfCuit, gridBagConstraints);

        tfCoorX.setText("jTextField6");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.insets = new java.awt.Insets(0, 16, 0, 16);
        getContentPane().add(tfCoorX, gridBagConstraints);

        tfCoorY.setText("jTextField7");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.insets = new java.awt.Insets(0, 16, 0, 16);
        getContentPane().add(tfCoorY, gridBagConstraints);

        txtId.setText("jLabel7");
        getContentPane().add(txtId, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        panelSuperior.modificar(id, tfName.getText(), tfDir.getText(), tfMail.getText(), tfCuit.getText(), Double.parseDouble(tfCoorX.getText()), Double.parseDouble(tfCoorY.getText()));
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tfCoorX;
    private javax.swing.JTextField tfCoorY;
    private javax.swing.JTextField tfCuit;
    private javax.swing.JTextField tfDir;
    private javax.swing.JTextField tfMail;
    private javax.swing.JTextField tfName;
    private javax.swing.JLabel txtId;
    // End of variables declaration//GEN-END:variables
}
