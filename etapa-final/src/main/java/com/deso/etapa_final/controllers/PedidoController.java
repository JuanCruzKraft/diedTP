package com.deso.etapa_final.controllers;

import com.deso.etapa_final.exception.NonExistentCarritoException;
import com.deso.etapa_final.exception.NonExistentException;
import com.deso.etapa_final.exception.NonSettedMetodoPagoException;
import com.deso.etapa_final.model.Pedido;
import com.deso.etapa_final.services.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private CarritoService carritoService;

    @GetMapping("/carrito/{clienteId}/{vendedorId}")
    public ResponseEntity<Long> obtenerCarrito(@PathVariable Long clienteId) throws NonExistentCarritoException {
        Long carritoId = carritoService.obtenerCarrito(clienteId);
        return new ResponseEntity<>(carritoId, HttpStatus.OK);
        
       
    }

    @PostMapping("/carrito/{clienteId}/agregarItem/{itemMenuId}/{cantidad}")
    public ResponseEntity<Void> agregarItem(@PathVariable Long clienteId, @PathVariable Long itemMenuId, @PathVariable int cantidad) throws NonExistentCarritoException, NonExistentException {
        carritoService.agregarItem(clienteId, itemMenuId, cantidad);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/carrito/{clienteId}/eliminarItem/{itemPedidoId}")
    public ResponseEntity<Void> eliminarItem(@PathVariable Long clienteId, @PathVariable Long itemPedidoId) throws NonExistentCarritoException, NonExistentException {
        carritoService.eliminarItem(clienteId, itemPedidoId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/carrito/{clienteId}/modificarCantidad/{itemPedidoId}/{cantidad}")
    public ResponseEntity<Void> modificarCantidad(@PathVariable Long clienteId, @PathVariable Long itemPedidoId, @PathVariable int cantidad) throws NonExistentCarritoException, NonExistentException {
        carritoService.modificarCantidad(clienteId, itemPedidoId, cantidad);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/carrito/{clienteId}/confirmar")
    public ResponseEntity<Void> confirmarPedido(@PathVariable Long clienteId) throws NonExistentCarritoException {
        carritoService.confirmarPedido(clienteId);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/carrito/{clienteId}/cancelar")
    public ResponseEntity<Void> cancelarPedido(@PathVariable Long clienteId) throws NonExistentCarritoException {
        carritoService.cancelarPedido(clienteId);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/carrito/{clienteId}/setMercadoPago")
    public ResponseEntity<Void> setMercadoPago(@PathVariable Long clienteId, @RequestParam String alias) throws NonExistentCarritoException {
        carritoService.setMercadoPago(clienteId, alias);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/carrito/{clienteId}/setTransferencia")
    public ResponseEntity<Void> setTransferencia(@PathVariable Long clienteId, @RequestParam String cbu, @RequestParam long cuit) throws NonExistentCarritoException {
        carritoService.setTransferencia(clienteId, cbu, cuit);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/carrito/{clienteId}/cerrar")
    public ResponseEntity<Void> cerrarPedido(@PathVariable Long clienteId) throws NonSettedMetodoPagoException, NonExistentCarritoException {
        carritoService.cerrarPedido(clienteId);
        return ResponseEntity.ok().build();
    }
}
