package com.example.demo.controller;

import com.example.demo.conserto.Conserto;
import com.example.demo.conserto.ConsertoRepository;
import com.example.demo.conserto.DadosCadastroConserto;
import com.example.demo.conserto.DadosListagemConserto;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping
    public Page<Conserto> listar(Pageable paginacao){
        return repository.findAll(paginacao);
    }

    @GetMapping
    @RequestMapping("algunsdados")
    public List<DadosListagemConserto> listarDadosSelecionados(){
        return repository.findAll().stream().map(DadosListagemConserto::new).toList();
    }
}
