package com.projeto.controller;

import com.projeto.model.Cliente;
import com.projeto.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    private Cliente cliente = new Cliente();

    @PostMapping
    public Cliente novo(@RequestBody Cliente cliente) {
        return clienteService.salvar(cliente);
    }

    @PutMapping(value = "/{codigocliente}")
    public Cliente alterar(@PathVariable(value = "codigocliente")Long codigocliente, @RequestBody Cliente cliente) {
        cliente.setCodigocliente(codigocliente);
        return clienteService.salvar(cliente);
    }

    @GetMapping()
    public List<Cliente> listar() {
        return this.clienteService.listar();
    }

    @GetMapping(value = "/{codigocliente}")
    public Cliente buscar(@PathVariable(value = "codigocliente") Long codigocliente){
        return this.clienteService.consultarporcodigo(codigocliente);
    }

    @DeleteMapping(value = "/{codigocliente}")
    public void excluir(@PathVariable(value = "codigocliente") Long codigocliente) {
        this.clienteService.excluir(codigocliente);
    }
}