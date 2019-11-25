package com.projeto.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name="vendedor")
public class Vendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="codigo_vendedor")
    private Long codigo_vendedor;

    @Column(name = "cpf")
    private String cpf;

    @Column(name="nomevendedor")
    private String nomevendedor;

    @Column(name="latitude")
    private String latitude;

    @Column(name="longitude")
    private String longitude;

    @OneToMany
    @JoinColumn(name="codigo_cliente")
    private List<Cliente> clientes;

    public Long getCodigo_vendedor() {
        return codigo_vendedor;
    }

    @NotNull(message = "CPF Obrigatório!")
    public String getCpf() {
        return cpf;
    }

    @NotNull(message = "Nome do vendedor obrigatório")
    public String getNomevendedor() {
        return nomevendedor;
    }

    @NotNull(message = "Latitude obrigatório ser informada!")
    public String getLatitude() {
        return latitude;
    }

    @NotNull(message = "Longitude obrigatório ser informada!")
    public String getLongitude() {
        return longitude;
    }

    public void setCodigo_vendedor(Long codigo_vendedor) {
        this.codigo_vendedor = codigo_vendedor;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNomevendedor(String nomevendedor) {
        this.nomevendedor = nomevendedor;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

}
