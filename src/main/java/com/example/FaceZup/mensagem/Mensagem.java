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
    @ManyToOne
    @JoinColumn (name = "destino" , nullable = false)
    private Usuario destinoUsuario;
    @ManyToOne
    @JoinColumn (name = "origem" , nullable = false)
    private Usuario usuario;
    private LocalDate dataDeEnvio;
    private Boolean visualizado;

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

    public Usuario getDestinoUsuario() {
        return destinoUsuario;
    }

    public void setDestinoUsuario(Usuario destinoUsuario) {
        this.destinoUsuario = destinoUsuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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