package com.praticando.validation.repositories;

import com.praticando.validation.models.UsuarioModel;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;

@Registered
public interface UsuarioRepository extends JpaRepository<UsuarioModel, String> {
}
