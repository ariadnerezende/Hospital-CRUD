package com.example.demo.veiculo;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class Veiculo {
    @Enumerated(EnumType.STRING)
    private Marca marca;
    private String modelo;
    private Integer ano;

    public Veiculo(DadosCadastroVeiculo dados) {
        this.marca = dados.marca();
        this.modelo = dados.modelo();
        this.ano = dados.ano();
    }
}
