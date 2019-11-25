package com.projeto.repository;

import com.projeto.model.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendedorRepository extends JpaRepository <Vendedor, Long>{

    Vendedor findByNomevendedor(String nomevendedor);
}
