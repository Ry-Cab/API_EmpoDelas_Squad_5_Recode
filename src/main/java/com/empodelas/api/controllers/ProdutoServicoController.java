package com.empodelas.api.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empodelas.api.exception.ResourceNotFoundException;
import com.empodelas.api.model.ProdutoServico;
import com.empodelas.api.repository.ProdutoServicoRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/produto_servico")
public class ProdutoServicoController {
	
	@Autowired
	private ProdutoServicoRepository produtoServicoRepo;
	
	//Listando employees 
	@GetMapping("/")
	public List<ProdutoServico> getAllProdutoServico(){
		return produtoServicoRepo.findAll();
	}
	
	//Criando Employee
	
	@PostMapping("/")
	public ProdutoServico createProdutoServico(@RequestBody ProdutoServico produtoServico) {
		return produtoServicoRepo.save(produtoServico);
	}
	
	//Obtendo o employee por Id
	@GetMapping("/{id}")
	public ResponseEntity<ProdutoServico> getProdutoServicoById(@PathVariable Long id_produtoServico) {
		ProdutoServico produtoServico = produtoServicoRepo.findById(id_produtoServico)
				.orElseThrow(() -> new ResourceNotFoundException("Produto or Serviço not exist with id: " + id_produtoServico));
		return ResponseEntity.ok(produtoServico);
	}
	
	//Atualizando o Employee
	@PutMapping("/{id}")
	public ResponseEntity<ProdutoServico> updateProdutoServico(@PathVariable Long id_produtoServico, @RequestBody ProdutoServico produtoServicoDetails){
		ProdutoServico produtoServico = produtoServicoRepo.findById(id_produtoServico)
				.orElseThrow(() -> new ResourceNotFoundException("Produto or Serviço not exist with id: " + id_produtoServico));
		
		
		produtoServico.setNome_produtoServico(produtoServicoDetails.getNome_produtoServico());
		produtoServico.setDescricao_produtoServico(produtoServicoDetails.getDescricao_produtoServico());
		produtoServico.setPreco_produtoServico(produtoServicoDetails.getPreco_produtoServico());
		produtoServico.setTipo_produtoServico(produtoServicoDetails.getTipo_produtoServico());
		produtoServico.setCodigo_produtoServico(produtoServicoDetails.getCodigo_produtoServico());
		produtoServico.setImagemURL_produtoServico(produtoServicoDetails.getImagemURL_produtoServico());
		
		
		ProdutoServico updatedProdutoServico = produtoServicoRepo.save(produtoServico);
		
		return ResponseEntity.ok(updatedProdutoServico);
	}
	
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteProdutoServico(@PathVariable Long id_produtoServico){
		ProdutoServico produtoServico = produtoServicoRepo.findById(id_produtoServico)
				.orElseThrow(() -> new ResourceNotFoundException("Produto or Serviço not exist with id: " + id_produtoServico));
		
		 produtoServicoRepo.delete(produtoServico);
		 
		 Map<String, Boolean> response = new HashMap<>();
		 
		 response.put("deleted", Boolean.TRUE);
		 
		 return ResponseEntity.ok(response);
	}
}
