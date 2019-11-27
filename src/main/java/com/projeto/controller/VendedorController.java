package com.projeto.controller;

import com.projeto.model.Vendedor;
import com.projeto.service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/vendedor")
public class VendedorController {

    @Autowired
    private VendedorService vendedorService;

    private Vendedor vendedor = new Vendedor();

    @RequestMapping(value = "/novo", method = RequestMethod.POST)
    public void novo() {
        vendedor = new Vendedor();
    }

    @RequestMapping(value = "/alterar", method = RequestMethod.PUT)
    public void alterar() {
        vendedorService.salvar(vendedor);
        vendedor = new Vendedor();
    }

    @GetMapping(value = "/vendedors")
    public @ResponseBody List<Vendedor> vendedores() {
        return this.vendedorService.listar();
    }

    @RequestMapping(value = "/excluir", method = RequestMethod.DELETE)
    public void excluir() {
        vendedorService.excluir(vendedor.getCodigo_vendedor());
        vendedor = new Vendedor();
    }

    @RequestMapping(value = "/adicionar", method = RequestMethod.POST)
    public void adicionar() {
        vendedorService.salvar(vendedor);
        vendedor = new Vendedor();
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
