package com.praticando.validation.services;

import com.praticando.validation.dtos.UsuarioDto;
import com.praticando.validation.models.UsuarioModel;

import java.util.List;

public interface UsuarioService {

    UsuarioModel salvarUsuario(UsuarioDto usuario);

    List<UsuarioModel> listar();
}
