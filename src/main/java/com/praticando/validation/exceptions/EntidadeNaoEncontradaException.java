package com.praticando.validation.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.UUID;

@ResponseStatus(HttpStatus.NOT_FOUND)
public abstract class EntidadeNaoEncontradaException extends NegocioException{

    public EntidadeNaoEncontradaException(String message) {
        super(message);
    }

    public EntidadeNaoEncontradaException(UUID id){
        super(String
                .format("Não foi possivel encontrar uma entidade com o id = %d", id));
    }
}
