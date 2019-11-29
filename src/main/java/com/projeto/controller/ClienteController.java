package com.projeto.controller;

import com.projeto.model.Cliente;
import com.projeto.model.ResponseCliModel;
import com.projeto.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.InputMismatchException;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    private Cliente cliente = new Cliente();

    @RequestMapping(method = RequestMethod.POST)
    public Cliente novo(@RequestBody Cliente cliente) {
        return clienteService.salvar(cliente);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Cliente alterar(@RequestBody Cliente cliente) {
        return clienteService.salvar(cliente);
    }

    @GetMapping
    public List<Cliente> clientes() {
        return this.clienteService.listar();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public Cliente excluir() {
       return clienteService.excluir(cliente.getCodigo_cliente());
    }

    public ClienteService getClienteService() {
        return clienteService;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setClienteService(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}