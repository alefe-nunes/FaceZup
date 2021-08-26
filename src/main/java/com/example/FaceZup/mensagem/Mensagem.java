package com.example.FaceZup.mensagem;

import com.example.FaceZup.usuario.Usuario;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table (name = "chat")
public class Mensagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String mensagem;
    private String destino;
    private String origem;
    private LocalDate dataDeEnvio;
    private boolean visualizado;

    public Mensagem() {
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

    public LocalDate getDataDeEnvio() {
        return dataDeEnvio;
    }

    public void setDataDeEnvio(LocalDate dataDeEnvio) {
        this.dataDeEnvio = dataDeEnvio;
    }

    public boolean isVisualizado() {
        return visualizado;
    }

    public void setVisualizado(boolean visualizado) {
        this.visualizado = visualizado;
    }
}