package com.example.FaceZup.mensagem;

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
    public Mensagem cadastrarMensagem (@RequestBody Mensagem mensagem) {
      return   mensagemService.cadastrarMensagem(mensagem);

    }


}
