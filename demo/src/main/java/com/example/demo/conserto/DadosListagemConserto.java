package com.example.demo.conserto;

import com.example.demo.mecanico.Mecanico;
import com.example.demo.veiculo.Marca;

public record DadosListagemConserto(
        String dataentrada,
        String datasaida,
        String nome,
        Marca marca,
        String modelo
) {
    public DadosListagemConserto(Conserto conserto){
        this(conserto.getDataentrada(), conserto.getDatasaida(),
                conserto.getMecanico().getNome(),
                conserto.getVeiculo().getMarca(),
                conserto.getVeiculo().getModelo());
    }
}
