package com.example.FaceZup.usuario;

import com.example.FaceZup.exceptions.UsuarioNaoEncontradoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario cadastrarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario buscarUsuarioPeloEmail(String email) {
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(email);

        if (usuarioOptional.isPresent()) {
            return usuarioOptional.get();
        }

        throw new UsuarioNaoEncontradoException ("Usuário não encontrado");
    }

}


