package com.praticando.validation.mappers.impl;

import com.praticando.validation.dtos.UsuarioDto;
import com.praticando.validation.enums.Status;
import com.praticando.validation.mappers.UsuarioMapper;
import com.praticando.validation.models.UsuarioModel;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.UUID;

@Component
public class UsuarioMapperImpl implements UsuarioMapper {
    @Override
    public UsuarioModel convertToModel(UsuarioDto usuario) {
        UsuarioModel usuarioModel = new UsuarioModel();
        BeanUtils.copyProperties(usuarioModel, usuario);
        usuarioModel.setId(UUID.randomUUID().toString());
        usuarioModel.setStatus(Status.ATIVO);
        usuarioModel.setDataDeCriacao(LocalDateTime.now(ZoneId.of("UTC")));
        usuarioModel.setDataDeAtualizacao(LocalDateTime.now(ZoneId.of("UTC")));
        return usuarioModel;
    }
}
