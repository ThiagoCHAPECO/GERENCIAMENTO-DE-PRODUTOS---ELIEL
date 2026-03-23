package com.gerenciamento.produtos.services;

import com.gerenciamento.produtos.models.Produto;
import com.gerenciamento.produtos.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }

    public Produto findById(Long id) {
        return produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado com id: " + id));
    }

    public Produto save(Produto produto){
        return produtoRepository.save(produto);
    }

    public void delete(@PathVariable Long id){
        produtoRepository.deleteById(id);
    }
}
