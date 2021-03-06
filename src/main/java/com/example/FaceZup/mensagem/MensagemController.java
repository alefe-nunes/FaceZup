package com.example.FaceZup.mensagem;

import com.example.FaceZup.mensagem.dtos.CadastroMensagemDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/chat")
public class MensagemController {

    @Autowired
    private MensagemService mensagemService;
    @Autowired
    private ModelMapper modelMapper;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mensagem cadastrarMensagem(@RequestBody @Valid CadastroMensagemDTO cadastroMensagemDTO) {
        return mensagemService.cadastrarMensagem(cadastroMensagemDTO.getMensagem(),
                cadastroMensagemDTO.getDestino(),
                cadastroMensagemDTO.getOrigem());
    }


    @GetMapping("/{mensagemID}")
    public Mensagem visualizarMensagemPorID(@PathVariable int mensagemID) {
        return mensagemService.visualizarMensagemPorID(mensagemID);

    }

    @GetMapping("/usuario/perfil/{emailUsuario}")
    public int descobrirNumeroDeMensagensNaoLidas(@RequestParam(required = false) String email) {
        return mensagemService.descobrirNumeroDeMensagensNaoLidas(email);

    }


}
