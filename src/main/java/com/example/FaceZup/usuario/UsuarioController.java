package com.example.FaceZup.usuario;

import com.example.FaceZup.mensagem.Mensagem;
import com.example.FaceZup.mensagem.MensagemService;
import com.example.FaceZup.mensagem.dtos.MensagemIDDTO;
import com.example.FaceZup.usuario.dtos.CadastroUsuarioDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping ("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    MensagemService mensagemService;
    @Autowired
    private ModelMapper modelMapper;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario cadastrarUsuario(@RequestBody @Valid CadastroUsuarioDTO usuarioDTO) {
        return usuarioService.cadastrarUsuario(modelMapper.map(usuarioDTO, Usuario.class));
    }

    @GetMapping("/pefil/{emailUsuario}")
    public List<MensagemIDDTO> pesquisarMensagemPorEmail(@RequestParam(required = false) String email)     {

            List<Mensagem> listaDeMensagens = mensagemService.pesquisarMensagemPor(email);
            List<MensagemIDDTO> listaDoTipoDto = listaDeMensagens.stream().map(mensagem -> modelMapper.map(mensagem, MensagemIDDTO.class)).collect(Collectors.toList());

            return listaDoTipoDto;
        }

    }




