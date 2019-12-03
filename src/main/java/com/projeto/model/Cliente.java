package com.projeto.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@SequenceGenerator(name="codcliente_sequence", allocationSize = 1)
@Table(name="cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "codcliente_sequence")
    @Column(name="codigo_cliente")
    private Long codigocliente;
    @Column(name = "cnpj")
    private String cnpj;
    @Column(name="razaosocial")
    private String razaosocial;
    @Column(name="latitude")
    private String latitude;
    @Column(name="longitude")
    private String longitude;

    @ManyToOne
    @JoinColumn(name = "codigo_vendedor")
    private Vendedor vendedor;

    public Long getCodigocliente() {
        return codigocliente;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setCodigocliente(Long codigocliente) {
        this.codigocliente = codigocliente;
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




