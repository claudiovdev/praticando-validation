package com.praticando.validation.controllers;

import com.praticando.validation.dtos.UsuarioDto;
import com.praticando.validation.models.UsuarioModel;
import com.praticando.validation.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public UsuarioModel cadastrarUsuario(@RequestBody UsuarioDto usuario){
        UsuarioModel usuarioModel = usuarioService.salvarUsuario(usuario);
        return usuarioModel;
    }


}
