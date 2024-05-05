package com.example.demo.veiculo;

import com.example.demo.conserto.DadosAtualizacaoConserto;
import com.example.demo.conserto.DadosCadastroConserto;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Veiculo {
    @Enumerated(EnumType.STRING)
    private Marca marca;
    private String modelo;
    private String ano;
    private String cor;

    public Veiculo(DadosCadastroVeiculo dados) {
        this.marca = dados.marca();
        this.modelo = dados.modelo();
        this.ano = dados.ano();
        this.cor = dados.cor();
    }

    public void atualizarInformacoes(DadosCadastroVeiculo dados) {
        if (dados.marca() != null) {
            this.marca = dados.marca();
        }
        if (dados.modelo() != null) {
            this.modelo = dados.modelo();
        }
        if (dados.ano() != null) {
            this.ano = dados.ano();
        }
        if (dados.cor() != null) {
            this.cor = dados.cor();
        }
    }
}
