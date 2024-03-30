package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("concertos")
public class ConsertoController {
    @PostMapping
    public void cadastrar(@RequestBody String dados){
        System.out.println(dados);
    }
}
