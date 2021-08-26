package com.example.FaceZup.usuario;

import com.example.FaceZup.usuario.dtos.CadastroUsuarioDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private ModelMapper modelMapper;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario cadastrarUsuario (@RequestBody CadastroUsuarioDTO usuarioDTO) {
        return usuarioService.cadastrarUsuario(modelMapper.map(usuarioDTO , Usuario.class));
    }


}
