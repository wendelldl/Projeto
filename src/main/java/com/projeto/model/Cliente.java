package com.projeto.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name="cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="codigo_cliente")
    private Long codigo_cliente;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name="razaosocial")
    private String razaosocial;

    @Column(name="latitude")
    private String latitude;

    @Column(name="longitude")
    private String longitude;

    @ManyToOne
    @JoinColumn(name="codigo_vendedor")

    public Long getCodigo_cliente() {
        return codigo_cliente;
    }

    @NotNull(message = "CNPJ obrigatório ser informado!")
    public String getCnpj() {
        return cnpj;
    }

    @NotNull(message = "Razão social obrigatório ser informada!")
    public String getRazaosocial() {
        return razaosocial;
    }

    @NotNull(message = "Latitude obrigatório ser informada!")
    public String getLatitude() {
        return latitude;
    }

    @NotNull(message = "Longitude obrigatório ser informada!")
    public String getLongitude() {
        return longitude;
    }

    public void setCodigo_cliente(Long codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}




