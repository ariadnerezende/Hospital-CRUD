package com.example.demo.mecanico;

public class Mecaninco {
    private String nome;
    private Integer anosExperiencia;

    public Mecaninco(DadosCadastroMecanico dados) {
        this.nome = dados.nome();
        this.anosExperiencia = dados.anosExperiencia();
    }
}
