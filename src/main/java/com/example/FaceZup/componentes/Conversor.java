package com.example.FaceZup.componentes;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

public class Conversor {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}

