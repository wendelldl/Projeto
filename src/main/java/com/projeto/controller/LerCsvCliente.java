package com.projeto.controller;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.projeto.model.CsvCliente;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LerCsvCliente {

    public static void main(String[] args) throws IOException {

        Reader reader = Files.newBufferedReader(Paths.get("cliente.csv"));

        CsvToBean<CsvCliente> csvToBean = new CsvToBeanBuilder(reader)
                .withType(CsvCliente.class).build();

        List<CsvCliente> clientes = csvToBean.parse();

        for (CsvCliente cliente : clientes)
            System.out.println(cliente);
    }
}
