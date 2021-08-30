package com.example.FaceZup.mensagem.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class CadastroMensagemDTO {

    private Integer id;
    private String mensagem;
    @Email(message = "{validacao.mensagem.destino}")
    private String destino;
    @Email (message = "{validacao.mensagem.origem}")
    private String origem;

    public CadastroMensagemDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }


}

