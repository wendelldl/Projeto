package com.projeto.service;

import com.projeto.model.Cliente;
import com.projeto.model.Vendedor;
import com.projeto.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@CrossOrigin(origins  = "http://localhost:4200")
@Service
public class VendedorService{

    @Autowired
    private VendedorRepository vendedorRepository;

    public Vendedor salvar(Vendedor vendedor) {
        return vendedorRepository.save(vendedor);
    }

    public Vendedor alterar(Vendedor vendedor) {
        return vendedorRepository.save(vendedor);
    }

    public void excluir(Long codigo_vendedor){
        vendedorRepository.deleteById(codigo_vendedor);
    }

    public Vendedor importar(Vendedor vendedor){
        return null;
    }

    public List<Vendedor> listar(){
        return vendedorRepository.findAll();
    }

    public Vendedor consultarporNomeVendedor(String nomevendedor){
        return vendedorRepository.findByNomevendedor(nomevendedor);
    }

    public Vendedor consultarporcodigo(Long codigo_vendedor){
        return vendedorRepository.getOne(codigo_vendedor);
    }
}
