package com.example.FaceZup.mensagem;

import com.example.FaceZup.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class MensagemService {

    private MensagemRepository mensagemRepository;
    private UsuarioService usuarioService;

    @Autowired

    public MensagemService(MensagemRepository mensagemRepository, UsuarioService usuarioService) {
        this.mensagemRepository = mensagemRepository;
        this.usuarioService = usuarioService;
    }

    public Mensagem cadastrarMensagem(Mensagem mensagem) {
        mensagem.setDataDeEnvio(LocalDate.now());
        mensagem.setVisualizado(false);
        return mensagemRepository.save(mensagem);

    }


}




