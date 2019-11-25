package com.projeto.model;

public class ResponseCliModel {

    private Long codigo_cliente;
    private String mensagem;

    public ResponseCliModel(){}

    public ResponseCliModel(Long codigo_cliente, String mensagem){
        this.codigo_cliente = codigo_cliente;
        this.mensagem = mensagem;
    }

    public Long getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(Long codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
