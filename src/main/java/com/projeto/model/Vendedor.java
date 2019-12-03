package com.projeto.model;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="codvendedor_sequence", allocationSize = 1)
@Table(name="vendedor")
public class  Vendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "codvendedor_sequence")
    @Column(name="codigo_vendedor")
    private Long codigovendedor;
    @Column(name="cpf")
    private String cpf;
    @Column(name="nomevendedor")
    private String nomevendedor;
    @Column(name="latitude")
    private String latitude;
    @Column(name="longitude")
    private String longitude;

    public Long getCodigovendedor() {
        return codigovendedor;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNomevendedor() {
        return nomevendedor;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setCodigovendedor(Long codigovendedor) {
        this.codigovendedor = codigovendedor;
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
