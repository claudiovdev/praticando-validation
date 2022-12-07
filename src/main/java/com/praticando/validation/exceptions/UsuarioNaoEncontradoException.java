package com.praticando.validation.exceptions;

import java.util.UUID;

public class UsuarioNaoEncontradoException extends EntidadeNaoEncontradaException{

    public UsuarioNaoEncontradoException(String message) {
        super(message);
    }

    public UsuarioNaoEncontradoException(UUID id) {
        super(String
                .format("Não foi possivel encontrar um usuario com o id = %d", id));
    }
}
