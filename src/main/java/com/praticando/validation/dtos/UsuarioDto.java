package com.praticando.validation.dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;

@Data
public class UsuarioDto {

    @NotBlank
    private String nome;

    @PositiveOrZero
    private Integer idade;

    private String cep;

}
