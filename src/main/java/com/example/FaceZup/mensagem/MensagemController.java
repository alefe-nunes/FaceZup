package com.example.FaceZup.mensagem;

import com.example.FaceZup.mensagem.dtos.CadastroMensagemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
public class MensagemController {

    @Autowired
    private MensagemService mensagemService;


    @PostMapping
    public Mensagem cadastrarMensagem(@RequestBody CadastroMensagemDTO cadastroMensagemDTO) {
        return mensagemService.cadastrarMensagem(cadastroMensagemDTO.getMensagem(),
                cadastroMensagemDTO.getDestino(),
                cadastroMensagemDTO.getOrigem());

    }

    @RequestMapping("/usuario/perfil/{emailUsuario}”)
            public Mensagem
}
