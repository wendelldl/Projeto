package com.projeto.repository;

import com.projeto.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
    Cliente findByRazaosocial(String razaosocial);

}
