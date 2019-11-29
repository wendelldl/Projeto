package com.projeto.model;

public class CsvCliente {

    private Long codigo_cliente;
    private String cnpj;
    private String razaosocial;
    private String latitude;
    private String longitude;

    public String toString() {
        return "CsvCliente{Codigo_cliente: '" + codigo_cliente + "\', CNPJ: " + cnpj + ", Razão Social: '" + razaosocial + ", Latitude: '" + latitude +
    ", Longitude: '" + longitude + "\'}";
    }

    public Long getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(Long codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
