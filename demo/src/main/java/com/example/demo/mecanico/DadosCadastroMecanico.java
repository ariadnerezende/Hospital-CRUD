package com.example.demo.mecanico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroMecanico(
        @NotBlank
        String nome,
        @NotNull
        Integer anosexperiencia) {
}
