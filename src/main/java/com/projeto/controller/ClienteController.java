package com.projeto.controller;

import com.projeto.model.Cliente;
import com.projeto.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    private Cliente cliente = new Cliente();

    @RequestMapping(value = "/novo", method = RequestMethod.POST)
    public void novo() {
        cliente = new Cliente();
    }

    @RequestMapping(value = "/alterar", method = RequestMethod.PUT)
    public void alterar() {
        clienteService.salvar(cliente);
        cliente = new Cliente();
    }

    @GetMapping(value = "/clientes")
    public @ResponseBody List<Cliente> clientes() {
        return this.clienteService.listar();
    }

    @RequestMapping(value = "/excluir", method = RequestMethod.DELETE)
    public void excluir() {
        clienteService.excluir(cliente.getCodigo_cliente());
        cliente = new Cliente();
    }

    @RequestMapping(value = "/adicionar", method = RequestMethod.POST)
    public void adicionar() {
        clienteService.salvar(cliente);
        cliente = new Cliente();
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