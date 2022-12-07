package com.praticando.validation.exceptions;

import java.util.UUID;

public class EstadoNaoEncontradoException extends EntidadeNaoEncontradaException{
    public EstadoNaoEncontradoException(String message) {
        super(message);
    }

    public EstadoNaoEncontradoException(Long id) {
        super(String.
                format("Não foi possivel encontrar um estado com o Id: %d", id));
    }
}
