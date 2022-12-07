package com.praticando.validation.services;

import com.praticando.validation.dtos.EstadoDto;
import com.praticando.validation.models.EstadoModel;

public interface EstadoService {
    EstadoModel salvar(EstadoDto estado);
}
