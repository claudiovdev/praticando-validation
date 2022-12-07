package com.praticando.validation.mappers;

import com.praticando.validation.dtos.UsuarioDto;
import com.praticando.validation.models.UsuarioModel;

public interface UsuarioMapper {

    public UsuarioModel convertToModel(UsuarioDto dto);
}
