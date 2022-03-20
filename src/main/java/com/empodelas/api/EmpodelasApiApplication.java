package com.empodelas.api;

import javax.annotation.PostConstruct;

import com.empodelas.api.model.ProdutoServico;
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

	@PostConstruct
	public void init(){
		for(int i = 0; i < 5; i++){

			ProdutoServico produtoServico = new ProdutoServico();

			produtoServico.setNome_produtoServico("Brigadeiro");
			produtoServico.setCodigo_produtoServico("1234");
			produtoServico.setTipo_produtoServico("Produto");
			produtoServico.setPreco_produtoServico(12);
			produtoServico.setDescricao_produtoServico("Ao seu gosto");
			produtoServico.setImagemURL_produtoServico("https://cdn.panelinha.com.br/receita/958014000000-Brigadeiro.jpg");

			produtoServicoRepo.save(produtoServico);
		}
	}
}
