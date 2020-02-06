package com.lucascoan.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucascoan.cursomc.domain.Categoria;
import com.lucascoan.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired //QUANDO É DECLARADO UMA DEPENDENCIA DENTRO DE UMA CLASSE USANDO O @Autowired, ESSA DEPENDENCIA VAI SER AUTOMATICAMENTE INSTANCIADA PELO SPRING. 
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	
	}
}
