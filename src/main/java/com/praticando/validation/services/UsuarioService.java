package com.praticando.validation.services;

import com.praticando.validation.dtos.UsuarioDto;
import com.praticando.validation.models.UsuarioModel;

public interface UsuarioService {
    UsuarioModel salvarUsuario(UsuarioDto usuario);
}
