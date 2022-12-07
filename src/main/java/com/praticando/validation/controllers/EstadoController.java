package com.praticando.validation.controllers;

import com.praticando.validation.dtos.EstadoDto;
import com.praticando.validation.models.EstadoModel;
import com.praticando.validation.services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("estados")
public class EstadoController {

    @Autowired
    EstadoService estadoService;

    @PostMapping
    public EstadoModel cadastrarEstado(@RequestBody EstadoDto estado){
        return estadoService.salvar(estado);
    }
}
