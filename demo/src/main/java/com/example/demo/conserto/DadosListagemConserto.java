package com.example.demo.conserto;

import com.example.demo.mecanico.Mecanico;
import com.example.demo.veiculo.Marca;

public record DadosListagemConserto(
        Long id,
        String dataentrada,
        String datasaida,
        String nome,
        Marca marca,
        String modelo
) {
    public DadosListagemConserto(Conserto conserto){
        this(conserto.getId(), conserto.getDataentrada(), conserto.getDatasaida(),
                conserto.getMecanico().getNome(),
                conserto.getVeiculo().getMarca(),
                conserto.getVeiculo().getModelo());
    }
}
