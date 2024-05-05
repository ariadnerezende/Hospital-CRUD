package com.example.demo.conserto;

import com.example.demo.mecanico.DadosCadastroMecanico;
import com.example.demo.mecanico.Mecanico;
import com.example.demo.veiculo.DadosCadastroVeiculo;
import com.example.demo.veiculo.Veiculo;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoConserto(
        @NotNull
        Long id,
        String dataentrada,
        String datasaida,
        DadosCadastroMecanico mecanico,
        DadosCadastroVeiculo veiculo
) {
}
