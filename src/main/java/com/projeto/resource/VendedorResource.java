package com.projeto.resource;

import com.projeto.model.Vendedor;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class VendedorResource {

    private Map<Long, Vendedor> vendedorModelMap;

    public VendedorResource(){
        vendedorModelMap = new HashMap<Long, Vendedor>();
    }
}
