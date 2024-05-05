package com.example.demo.mecanico;

import com.example.demo.conserto.DadosAtualizacaoConserto;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Mecanico {
    private String nome;
    private Integer anosexperiencia;

    public Mecanico(DadosCadastroMecanico dados) {
        this.nome = dados.nome();
        this.anosexperiencia = dados.anosexperiencia();
    }

    public void atualizarInformacoes(DadosCadastroMecanico dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.anosexperiencia() != null) {
            this.anosexperiencia = dados.anosexperiencia();
        }
    }
}
