package com.praticando.validation.services.impl;

import com.praticando.validation.configs.RestTamplateEndereco;
import com.praticando.validation.dtos.UsuarioDto;
import com.praticando.validation.enums.Status;
import com.praticando.validation.mappers.UsuarioMapper;
import com.praticando.validation.models.Endereco;
import com.praticando.validation.models.UsuarioModel;
import com.praticando.validation.repositories.UsuarioRepository;
import com.praticando.validation.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository repository;

    @Autowired
    UsuarioMapper mapper;

    @Autowired
    RestTamplateEndereco restTemplate;

    @Override
    public UsuarioModel salvarUsuario(UsuarioDto usuario) {
       Endereco endereco = restTemplate.buscarCep(usuario.getCep());
        UsuarioModel usuarioModel = mapper.convertToModel(usuario);
        usuarioModel.setEndereco(endereco);
        return repository.save(usuarioModel);
    }
}
