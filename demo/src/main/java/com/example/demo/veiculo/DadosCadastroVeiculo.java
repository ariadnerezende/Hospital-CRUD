package com.example.demo.veiculo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroVeiculo(
        @NotNull
        Marca marca,
        @NotBlank
        String modelo,
        @NotBlank
        @Pattern(regexp = "\\d{4}")
        String ano) {
}
