package com.aluracursos.Challengue.Foro.Hub.usuario;

import jakarta.validation.constraints.NotBlank;
import org.springframework.context.annotation.Bean;


public record DatosAutenticacion(
        @NotBlank String login,
        @NotBlank String contrasena) {

}
