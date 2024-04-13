package com.example.demo.controller;

import com.example.demo.conserto.Conserto;
import com.example.demo.conserto.ConsertoRepository;
import com.example.demo.conserto.DadosCadastroConserto;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("conserto")
public class ConsertoController {
    @Autowired
    private ConsertoRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroConserto dados){

        repository.save(new Conserto(dados));
    }
}
