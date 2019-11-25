package com.projeto.controller;

import com.projeto.model.Vendedor;
import com.projeto.service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/vendedor")
public class VendedorController {

    @Autowired
    private VendedorService vendedorService;

    private Vendedor vendedor = new Vendedor();

    @RequestMapping(value = "/vendedor/novo", method = RequestMethod.POST)
    public void novo() {
        vendedor = new Vendedor();
    }

    @RequestMapping(value = "/vendedor/alterar", method = RequestMethod.PUT)
    public void alterar() {
        vendedorService.salvar(vendedor);
        vendedor = new Vendedor();
    }

    @RequestMapping(value = "/vendedor/excluir", method = RequestMethod.DELETE)
    public void excluir() {
        vendedorService.excluir(vendedor.getCodigo_vendedor());
        vendedor = new Vendedor();
    }

    @RequestMapping(value = "/vendedor/adicionar", method = RequestMethod.POST)
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
