package com.gerenciamento.produtos.repositories;

import com.gerenciamento.produtos.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
