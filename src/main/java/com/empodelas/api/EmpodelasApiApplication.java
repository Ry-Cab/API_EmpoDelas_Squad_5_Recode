package com.empodelas.api;

import com.empodelas.api.repository.ProdutoServicoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmpodelasApiApplication {

	@Autowired
	ProdutoServicoRepository produtoServicoRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(EmpodelasApiApplication.class, args);
	}

}
