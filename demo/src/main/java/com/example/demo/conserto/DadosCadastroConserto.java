package com.example.demo.conserto;

import com.example.demo.mecanico.DadosCadastroMecanico;
import com.example.demo.veiculo.DadosCadastroVeiculo;

public record DadosCadastroConserto(String dataentrada, String datasaida, DadosCadastroMecanico mecanico, DadosCadastroVeiculo veiculo) {
}
