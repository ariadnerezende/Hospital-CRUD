package com.example.demo.conserto;

import com.example.demo.mecanico.Mecanico;
import com.example.demo.veiculo.Veiculo;

public record DadosDetalhamentoConserto(Long id, String dataentrada, String datasaida, Mecanico mecanico, Veiculo veiculo) {
    public DadosDetalhamentoConserto(Conserto conserto){
        this(conserto.getId(), conserto.getDataentrada(), conserto.getDatasaida(), conserto.getMecanico(), conserto.getVeiculo());
    }
}
