package com.praticando.validation.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.praticando.validation.enums.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode
@Table(name = "TB_USUARIOS")
@Entity
public class UsuarioModel {

    @EqualsAndHashCode.Exclude
    @Id
    private String id;

    @Column(nullable = false, length = 20)
    private String nome;

    @Column(nullable = false, length = 3)
    private Integer idade;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Embedded
    private Endereco endereco;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    private LocalDateTime dataDeCriacao;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    private LocalDateTime dataDeAtualizacao;
}
