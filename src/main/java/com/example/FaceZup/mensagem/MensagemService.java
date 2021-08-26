package com.example.FaceZup.mensagem;

import com.example.FaceZup.mensagem.dtos.CadastroMensagemDTO;
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

    public Mensagem cadastrarMensagem(String origem , String destino, String mensagem) {

        Mensagem mensagemDTO = new Mensagem();

        mensagemDTO.setOrigem(origem);
        mensagemDTO.setDestino(destino);
        mensagemDTO.setMensagem(mensagem);
        mensagemDTO.setDataDeEnvio(LocalDate.now());
        mensagemDTO.setVisualizado(false);

        return mensagemRepository.save(mensagemDTO);

    }

        public void pesquisarUsuariopeloEmail (String origem, String destino){
        Usuario usuarioDestino = usuarioService.buscarUsuarioPeloEmail(destino);
        Usuario usuarioOrigem = usuarioService.buscarUsuarioPeloEmail(origem);

        }





}





