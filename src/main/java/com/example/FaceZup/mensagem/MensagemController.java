package com.example.FaceZup.mensagem;

import com.example.FaceZup.mensagem.dtos.CadastroMensagemDTO;
import com.example.FaceZup.mensagem.dtos.MensagemIDDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/chat")
public class MensagemController {

    @Autowired
    private MensagemService mensagemService;
    @Autowired
    private ModelMapper modelMapper;


    @PostMapping
    public Mensagem cadastrarMensagem(@RequestBody CadastroMensagemDTO cadastroMensagemDTO) {
        return mensagemService.cadastrarMensagem(cadastroMensagemDTO.getMensagem(),
                cadastroMensagemDTO.getDestino(),
                cadastroMensagemDTO.getOrigem());

    }

    @GetMapping ("/pefil/{emailUsuario}")
    public List <MensagemIDDTO> pesquisarMensagemPorEmail (@RequestParam (required = false) String emailUsuario,
                                                           @RequestParam (required = false) boolean visualizado) {

        List <Mensagem> listaDeMensagens = mensagemService.pesquisarMensagemPor(emailUsuario , visualizado);
        List <MensagemIDDTO> mensagemIDDTOS = listaDeMensagens.stream().map(mensagem -> modelMapper.map(mensagem, MensagemIDDTO.class)).collect(Collectors.toList());

        return mensagemIDDTOS;
    }

    @GetMapping("/{mensagemID}")
    public Mensagem visualizarMensagemPorID(@PathVariable int mensagemID) {
        return mensagemService.visualizarMensagemPorID(mensagemID);


    }


}
