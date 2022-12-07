package com.praticando.validation.exceptions;

import java.util.UUID;

public class EntidadeNaoEncontradaException extends NegocioException{

    public EntidadeNaoEncontradaException(String message) {
        super(message);
    }

    public EntidadeNaoEncontradaException(UUID id){
        super(String
                .format("Não foi possivel encontrar uma entidade com o id = %d", id));
    }
}
