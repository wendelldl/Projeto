package com.projeto.model;

import javax.persistence.*;

@Table(name="cliente")
@Entity
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="codigo_cliente")
    private int codigo_cliente;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name="razaosocial")
    private String razaosocial;

    @Column(name="latitude")
    private String latitude;

    @Column(name="longitude")



