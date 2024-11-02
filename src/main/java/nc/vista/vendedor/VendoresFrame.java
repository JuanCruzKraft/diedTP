/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package nc.vista.vendedor;

import nc.vista.VistaPrincipal;

/**
 *
 * @author nicol
 */
public class VendoresFrame extends javax.swing.JPanel {

    /**
     * Creates new form VendoresFrame
     */
    VistaPrincipal upperFrame;
    @SuppressWarnings("")
    public VendoresFrame() {
        initComponents();
        pedidosMenuPanelVendedor1.setFrameSuperior(this);
        jTabbedPane1.setEnabledAt(jTabbedPane1.indexOfComponent(itemPedidoPanel1), false);
    }
    public void setFrameSuperior(VistaPrincipal vista){
        upperFrame = vista;
    }
    public void setPedido(int IDPedido){
        itemPedidoPanel1.setPedido(IDPedido);
        jTabbedPane1.setEnabledAt(jTabbedPane1.indexOfComponent(itemPedidoPanel1), true);

    }
    public void setVendedor(int ID){
        this.itemMenuPanelVendedor1.setID(ID);
        this.pedidosMenuPanelVendedor1.setVendedor(ID);
        this.itemMenuPanelVendedor1.updateModel();
    }
    public void goBack(){
        this.itemMenuPanelVendedor1.setID(-1);
        this.pedidosMenuPanelVendedor1.setVendedor(-1);
        upperFrame.volverInicio();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        itemMenuPanelVendedor1 = new nc.vista.vendedor.ItemMenuPanelVendedor();
        pedidosMenuPanelVendedor1 = new nc.vista.vendedor.PedidosMenuPanelVendedor();
        itemPedidoPanel1 = new nc.vista.vendedor.ItemPedidoPanel();

        setLayout(new java.awt.BorderLayout());

        jTabbedPane1.addTab("Mi Menu", itemMenuPanelVendedor1);
        jTabbedPane1.addTab("Mis Pedidos", pedidosMenuPanelVendedor1);
        jTabbedPane1.addTab("Detalle Pedido", itemPedidoPanel1);

        add(jTabbedPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private nc.vista.vendedor.ItemMenuPanelVendedor itemMenuPanelVendedor1;
    private nc.vista.vendedor.ItemPedidoPanel itemPedidoPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private nc.vista.vendedor.PedidosMenuPanelVendedor pedidosMenuPanelVendedor1;
    // End of variables declaration//GEN-END:variables
}
