/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nc.util.compareStategies.itemPedido.implementations;

import nc.modelo.ItemPedido;
import nc.util.compareStrategies.itemPedido.CompareItemPedidoStrategyInterface;

public class PedidoPriceComp implements CompareItemPedidoStrategyInterface {
    private ItemPedido self;
    private boolean ascendente;
    
    public PedidoPriceComp(ItemPedido self, boolean ascendente){
        this.self=self;
        this.ascendente = ascendente;
    }
    
    @Override
    public int compareTo(ItemPedido otherPedido) {
        if(ascendente){
            if(self.getPedido().getPrecio() > otherPedido.getPedido().getPrecio())
                return 1;
            else if(self.getPedido().getPrecio() < otherPedido.getPedido().getPrecio())
                return -1;
            else return 0;
        }else{
            if(self.getPedido().getPrecio() < otherPedido.getPedido().getPrecio())
                return 1;
            else if(self.getPedido().getPrecio() > otherPedido.getPedido().getPrecio())
                return -1;
            else return 0;
        }
    }
    
}
