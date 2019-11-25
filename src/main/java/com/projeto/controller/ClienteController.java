package com.projeto.controller;

import com.projeto.model.Cliente;
import com.projeto.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/service")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    private Cliente cliente = new Cliente();

    public List<Cliente> listar(){
        return clienteService.listar();
    }

    public void novo(){
        cliente = new Cliente();
    }

    public void adicionar(){
        clienteService.salvar(cliente);
    }

    public void alterar(){
        clienteService.salvar(cliente);
    }

    public void excluir(){
        clienteService.excluir(cliente);
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