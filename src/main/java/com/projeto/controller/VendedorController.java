package com.projeto.controller;

import com.projeto.model.Vendedor;
import com.projeto.service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendedors")
public class VendedorController {

    @Autowired
    private VendedorService vendedorService;

    private Vendedor vendedor = new Vendedor();

    @RequestMapping(method = RequestMethod.POST)
    public Vendedor novo(@RequestBody Vendedor vendedor) {
      return vendedorService.salvar(vendedor);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Vendedor alterar(@RequestBody Vendedor vendedor) {
       return vendedorService.salvar(vendedor);
    }

    @GetMapping()
    public List<Vendedor> vendedores() {
        return this.vendedorService.listar();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public Vendedor excluir() {
       return vendedorService.excluir(vendedor.getCodigo_vendedor());
    }

    public VendedorService getVendedorService() {
        return vendedorService;
    }

    public void setVendedorService(VendedorService vendedorService) {
        this.vendedorService = vendedorService;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
}
