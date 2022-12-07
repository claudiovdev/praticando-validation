package com.praticando.validation.models;

import com.praticando.validation.validation.Groups;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@EqualsAndHashCode
@Entity
@Table(name = "TB_ESTADOS")
public class EstadoModel {

    //Foi adicionado o @NotBlanc com um grupo para que não desse algum problema na hora de cadastrar um novo Estado
    @NotBlank(groups = Groups.EstadoId.class)
    @EqualsAndHashCode.Exclude
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String nome;
}
