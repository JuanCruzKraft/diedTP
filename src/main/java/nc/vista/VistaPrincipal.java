/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package nc.vista;

import java.awt.CardLayout;

/**
 *
 * @author nicol
 */
public class VistaPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form VistaPrincipal
     */
    CardLayout layout;
    public VistaPrincipal() {
        initComponents();
        this.layout = (CardLayout) this.getLayout();
        layout.show(this, "card3");
    }
    public void setVendedores(){
        layout.show(this, "card2");
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vendoresFrame1 = new nc.vista.VendoresFrame();
        firstFrame1 = new nc.vista.FirstFrame(this);
        clientesFrame1 = new nc.vista.ClientesFrame();

        setLayout(new java.awt.CardLayout());
        add(vendoresFrame1, "card2");
        add(firstFrame1, "card3");
        add(clientesFrame1, "card4");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private nc.vista.ClientesFrame clientesFrame1;
    private nc.vista.FirstFrame firstFrame1;
    private nc.vista.VendoresFrame vendoresFrame1;
    // End of variables declaration//GEN-END:variables
}
