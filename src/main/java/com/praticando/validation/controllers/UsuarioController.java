package com.praticando.validation.controllers;

import com.praticando.validation.dtos.UsuarioDto;
import com.praticando.validation.models.UsuarioModel;
import com.praticando.validation.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public UsuarioModel cadastrarUsuario(@RequestBody @Valid UsuarioDto usuario){
        UsuarioModel usuarioModel = usuarioService.salvarUsuario(usuario);
        return usuarioModel;
    }

    @GetMapping
    public List<UsuarioModel> listarUsuarios(){
        return usuarioService.listar();
    }


}
