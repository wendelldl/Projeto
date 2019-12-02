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

    @PostMapping
    public Vendedor novo(@RequestBody Vendedor vendedor) {
        vendedor.isCPF(vendedor.getCpf());
      return vendedorService.salvar(vendedor);
    }

    @PutMapping(value = "/{codigovendedor}")
    public Vendedor alterar(@PathVariable(value = "codigo_vendedor")Long codigovendedor,@RequestBody Vendedor vendedor) {
        vendedor.setCodigovendedor(codigovendedor);
        return vendedorService.salvar(vendedor);
    }

    @GetMapping()
    public List<Vendedor> listar() {
        return this.vendedorService.listar();
    }

    @RequestMapping(value = "/{codigovendedor}",  method = RequestMethod.GET)
    public Vendedor buscar(@PathVariable(value = "codigovendedor") Long codigovendedor){
        return this.vendedorService.consultarporcodigo(codigovendedor);
    }

    @DeleteMapping(value = "/{codigovendedor}")
    public void excluir(@PathVariable(value = "codigovendedor") Long codigovendedor) {
        this.vendedorService.excluir(codigovendedor);
    }
}
