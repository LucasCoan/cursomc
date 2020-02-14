package com.lucascoan.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucascoan.cursomc.domain.Estado;

@Repository
//COM O OBJETO DESSE TIPO AQUI: CategoriaRepository, É CAPAZ DE REALIZAR OPERAÇÕES DE ACESSO A DADOS, COMO BUSCA, SALVAR, DELETA,
//REFERENTE AO OBJETO CATEGORIA QUE ESTÁ MAPEADO COM A TABELA CATEGORIA NO BANCO DE DADOS.
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

	
}


