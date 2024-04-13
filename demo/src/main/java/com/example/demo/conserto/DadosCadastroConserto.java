package com.example.demo.conserto;

import com.example.demo.mecanico.DadosCadastroMecanico;
import com.example.demo.veiculo.DadosCadastroVeiculo;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroConserto(
        @NotBlank
        @Pattern(regexp = "\\b(0?[1-9]|[12]\\d|3[01])/(0?[1-9]|1[0-2])/\\d{4}\\b")
        String dataentrada,
        @NotBlank
        @Pattern(regexp = "\\b(0?[1-9]|[12]\\d|3[01])/(0?[1-9]|1[0-2])/\\d{4}\\b")
        String datasaida,
        @NotNull
        @Valid
        DadosCadastroMecanico mecanico,
        @NotNull
        @Valid
        DadosCadastroVeiculo veiculo) {
}
