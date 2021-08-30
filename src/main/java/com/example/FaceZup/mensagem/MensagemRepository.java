package com.example.FaceZup.mensagem;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MensagemRepository extends CrudRepository<Mensagem, Integer> {

    List<Mensagem> findByDestinoUsuarioAndVisualizadoFalse(String email);


}
