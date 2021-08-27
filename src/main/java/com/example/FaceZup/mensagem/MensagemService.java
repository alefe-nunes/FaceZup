package com.example.FaceZup.mensagem;

import com.example.FaceZup.usuario.Usuario;
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

  public Mensagem cadastrarMensagem(Usuario usuario) {

        Mensagem objetoMensagem = new Mensagem();

        objetoMensagem.setUsuario(usuario);
        objetoMensagem.setDestinoUsuario(destino);
        objetoMensagem.setMensagem(mensagem);
        objetoMensagem.setDataDeEnvio(LocalDate.now());
        objetoMensagem.setVisualizado(false);

        return mensagemRepository.save(objetoMensagem);

    }

    public void pesquisarUsuariopeloEmail(String origem, String destino) {
        Usuario usuarioDestino = usuarioService.buscarUsuarioPeloEmail(destino);
        Usuario usuarioOrigem = usuarioService.buscarUsuarioPeloEmail(origem);

    }


}





