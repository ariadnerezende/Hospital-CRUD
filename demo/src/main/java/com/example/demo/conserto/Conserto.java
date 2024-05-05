package com.example.demo.conserto;

import com.example.demo.mecanico.Mecanico;
import com.example.demo.veiculo.Veiculo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name= "conserto")
@Entity(name = "Conserto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Conserto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String dataentrada;
    private String datasaida;
    @Embedded
    private Mecanico mecanico;
    @Embedded
    private Veiculo veiculo;
    private Boolean ativo;

    public Conserto(DadosCadastroConserto dados) {
        this.ativo = true;
        this.dataentrada = dados.dataentrada();
        this.datasaida = dados.datasaida();
        this.mecanico = new  Mecanico(dados.mecanico());
        this.veiculo = new Veiculo(dados.veiculo());
    }

    public void atualizarInformacoes(DadosAtualizacaoConserto dados) {
        if (dados.dataentrada() != null) {
            this.dataentrada = dados.dataentrada();
        }
        if (dados.datasaida() != null) {
            this.datasaida = dados.datasaida();
        }
        if (dados.mecanico() != null) {
            this.mecanico.atualizarInformacoes(dados.mecanico());
        }
        if (dados.veiculo() != null) {
            this.veiculo.atualizarInformacoes(dados.veiculo());
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
