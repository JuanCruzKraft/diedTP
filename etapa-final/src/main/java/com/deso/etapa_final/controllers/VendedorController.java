package com.deso.etapa_final.controllers;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.deso.etapa_final.model.Vendedor;
import com.deso.etapa_final.services.ItemMenuService;
import com.deso.etapa_final.services.PedidoService;
import com.deso.etapa_final.services.VendedorService;

import jakarta.persistence.EntityNotFoundException;

@Controller
@RequestMapping("/vendedores")
public class VendedorController {
    
    @Autowired
    private VendedorService vendedorService;

    @Autowired
    private ItemMenuService itemMenuService;

    @Autowired
    private PedidoService pedidoService;


    @PostMapping("/add")
    public String addVendedor(
        @RequestParam String nombre,
        @RequestParam String direccion,
        @RequestParam double latitud,
        @RequestParam double longitud,
        RedirectAttributes redirectAttributes) {
        
        vendedorService.addVendedor(nombre, direccion, latitud, longitud);

        return "redirect:/vendedores/getAll";
    }

    @GetMapping("/getAll")
    public String getVendedores(Model model) {
        Iterable<Vendedor> vendedores =  vendedorService.getVendedores();
        model.addAttribute("vendedores", vendedores );
        return "vendedores-listado";

    }
    @GetMapping("/search")
    public String searchVendedores(Model model, @RequestParam("search") String searchable, @RequestParam("orderBy") String orderBy, @RequestParam("orderDirection") String orderDirection) {
        Iterable<Vendedor> vendedores =  vendedorService.generalSearch(searchable, orderBy, orderDirection);
        model.addAttribute("vendedores", vendedores );
        return "vendedores-listado";
    }

    @GetMapping("/agregar-vendedor")
    public String mostrarFormularioAgregar() {
        return "agregar-vendedor";
    }

    @GetMapping("/getById")
    public Vendedor getVendedorById(@RequestParam long id) {
        return vendedorService.getVendedorById(id);
    }

    @PostMapping("/update")
    public ResponseEntity<Vendedor> updateVendedor(
            @RequestParam long id,
            @RequestParam String nombre,
            @RequestParam String direccion,
            @RequestParam double latitud,
            @RequestParam double longitud) {
        Vendedor updatedVendedor = vendedorService.updateVendedor(id, nombre, direccion, latitud, longitud);
        return ResponseEntity.ok(updatedVendedor);
    }

    @DeleteMapping("/delete-api")
    public ResponseEntity<?> deleteVendedorAPI(@RequestParam long id) {
        try {
            vendedorService.deleteVendedor(id);
            return ResponseEntity.ok("Vendedor eliminado con éxito");
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
    @PostMapping("/delete")
    public String deleteVendedor(@RequestParam Long id) {
        pedidoService.eliminarAllPedidosPorVendedor(id);
        itemMenuService.eliminarItemsMenuPorVendedor(id);
        vendedorService.deleteVendedor(id);
        return "redirect:/vendedores/getAll";
    }

    @GetMapping("/getDistancia")
    @ResponseBody
    public String distancia(@RequestParam Long vendedorid, @RequestParam Long clienteid) {
        double distancia = vendedorService.distancia(vendedorid, clienteid);
        return "La distancia entre el vendedor y el cliente es: " + distancia;
    }

}
