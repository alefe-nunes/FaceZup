package com.example.FaceZup.mensagem;

import com.example.FaceZup.usuario.Usuario;
import com.example.FaceZup.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class MensagemService {

    private MensagemRepository mensagemRepository;
    private UsuarioService usuarioService;

    @Autowired
    public MensagemService(MensagemRepository mensagemRepository, UsuarioService usuarioService) {
        this.mensagemRepository = mensagemRepository;
        this.usuarioService = usuarioService;
    }

    public Mensagem cadastrarMensagem(String mensagem, String origem, String destino) {

        Usuario usuarioDestino = usuarioService.buscarUsuarioPeloEmail(destino);
        Usuario usuarioOrigem = usuarioService.buscarUsuarioPeloEmail(origem);

        Mensagem objetoMensagem = new Mensagem();

        objetoMensagem.setUsuario(usuarioOrigem);
        objetoMensagem.setDestinoUsuario(usuarioDestino);
        objetoMensagem.setMensagem(mensagem);
        objetoMensagem.setDataDeEnvio(LocalDate.now());
        objetoMensagem.setVisualizado(false);

        return mensagemRepository.save(objetoMensagem);

    }

    public Mensagem visualizarMensagemPorID(int id) {
        Mensagem mensagem = pesquisarMensagemPorID(id);

        mensagem.setVisualizado(true);
        mensagemRepository.save(mensagem);
        return mensagem;
    }

    public Mensagem pesquisarMensagemPorID(int id) {
        Optional<Mensagem> mensagemOptional = mensagemRepository.findById(id);

        if (mensagemOptional.isPresent()) {
            return mensagemOptional.get();
        }
        throw new RuntimeException("Mensagem não encontrada");
    }


}





