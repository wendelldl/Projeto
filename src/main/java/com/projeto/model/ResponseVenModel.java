package com.projeto.model;

public class ResponseVenModel {

    private Long codigo_vendedor;
    private String mensagem;

    public ResponseVenModel(){}

    public ResponseVenModel(Long codigo_vendedor, String mensagem){
        this.codigo_vendedor = codigo_vendedor;
        this.mensagem = mensagem;
    }

    public Long getCodigo_vendedor() {
        return codigo_vendedor;
    }

    public void setCodigo_vendedor(Long codigo_vendedor) {
        this.codigo_vendedor = codigo_vendedor;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
