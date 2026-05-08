package org.example.controller;


import org.example.model.Produto;
import org.example.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(path = "/produtos")
@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;


    @GetMapping
    public List<Produto> findAll(){
        return produtoService.findAll();
    }


    @PostMapping
    public Produto criarProduto (Produto produto){
        return produtoService.criarProduto(produto);
    }

}
