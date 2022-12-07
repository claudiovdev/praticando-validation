package com.praticando.validation.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;

public class UsuarioDto {

    @NotBlank
    private String nome;

    @PositiveOrZero
    private Integer idade;


}
