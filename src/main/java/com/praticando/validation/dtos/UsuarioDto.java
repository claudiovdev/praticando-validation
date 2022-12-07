package com.praticando.validation.dtos;

import com.praticando.validation.models.EstadoModel;
import com.praticando.validation.validation.Groups;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.groups.ConvertGroup;
import javax.validation.groups.Default;

@Data
public class UsuarioDto {

    @NotBlank
    private String nome;

    @PositiveOrZero
    private Integer idade;

    private String cep;

    @Valid
    @ConvertGroup(from = Default.class, to = Groups.EstadoId.class)
    @NotNull
    private Long estadoId;

}
