package com.projeto.service;

import com.projeto.model.Cliente;
import com.projeto.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.InputMismatchException;
import java.util.List;

@CrossOrigin(origins  = "http://localhost:4200")
@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente alterar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void excluir(Long codigocliente) {
        clienteRepository.deleteById(codigocliente);
    }

    public Cliente importar(Cliente cliente) {
        return null;
    }

    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    public Cliente consultarporRazaoSocial(String razaosocial) {
        return clienteRepository.findByRazaosocial(razaosocial);
    }

    public Cliente consultarporcodigo(Long codigocliente) {
        return clienteRepository.getOne(codigocliente);
    }

}
