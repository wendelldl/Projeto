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

    @PutMapping(value = "/{codigo_cliente}")
    public Cliente alterar(@PathVariable(value = "codigo_cliente")Long codigocliente, @RequestBody Cliente cliente) {
        cliente.setCodigocliente(codigocliente);
        return clienteService.alterar(cliente);
    }

    @GetMapping()
    public List<Cliente> listar() {
        return this.clienteService.listar();
    }

    @GetMapping(value = "/{codigo_cliente}")
    public Cliente buscar(@PathVariable(value = "codigo_cliente") Long codigocliente){
        return this.clienteService.consultarporcodigo(codigocliente);
    }

    @DeleteMapping(value = "/{codigo_cliente}")
    public void excluir(@PathVariable(value = "codigo_cliente") Long codigocliente) {
        this.clienteService.excluir(codigocliente);
    }
}