package com.praticando.validation.services.impl;

import com.praticando.validation.dtos.EstadoDto;
import com.praticando.validation.models.EstadoModel;
import com.praticando.validation.repositories.EstadoRepository;
import com.praticando.validation.services.EstadoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoServiceImpl implements EstadoService {

    @Autowired
    EstadoRepository estadoRepository;

    @Override
    public EstadoModel salvar(EstadoDto estado) {
        EstadoModel estadoModel = new EstadoModel();
        BeanUtils.copyProperties(estado, estadoModel);
        estadoModel = estadoRepository.save(estadoModel);
        return estadoModel;
    }
}
