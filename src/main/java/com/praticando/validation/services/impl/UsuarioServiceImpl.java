package com.praticando.validation.services.impl;

import com.praticando.validation.dtos.UsuarioDto;
import com.praticando.validation.enums.Status;
import com.praticando.validation.mappers.UsuarioMapper;
import com.praticando.validation.models.UsuarioModel;
import com.praticando.validation.repositories.UsuarioRepository;
import com.praticando.validation.services.UsuarioService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository repository;

    @Autowired
    UsuarioMapper mapper;

    @Override
    public UsuarioModel salvarUsuario(UsuarioDto usuario) {
        UsuarioModel usuarioModel = mapper.convertToModel(usuario);
        return repository.save(usuarioModel);
    }
}
