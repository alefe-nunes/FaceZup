package com.example.FaceZup.usuario.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class CadastroUsuarioDTO {

    @Min(value = 3, message = "{validacao.nome.usuario.minimo}")
    @Max(value = 20, message = "{validacao.nome.usuario.maximo}")
    private String nome;
    @Min(value = 3, message = "{validacao.sobrenome.usuario.minimo}")
    @Max(value = 20, message = "{validacao.sobrenome.usuario.maximo}")
    private String sobrenome;
    @Email (message = "{validacao.email.usuario}")
    private String email;
    private String cargo;

    public CadastroUsuarioDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
