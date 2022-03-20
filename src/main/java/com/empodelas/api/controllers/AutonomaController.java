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
import com.empodelas.api.model.Autonoma;
import com.empodelas.api.repository.AutonomaRepository;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/autonoma")
public class AutonomaController {

	@Autowired
	private AutonomaRepository autonomaRepo;
	
	//Listando employees 
	@GetMapping("/")
	public List<Autonoma> getAllAutonoma(){
		return autonomaRepo.findAll();
	}
	
	//Criando Employee
	
	@PostMapping("/")
	public Autonoma createAutonoma(@RequestBody Autonoma autonoma) {
		return autonomaRepo.save(autonoma);
	}
	
	//Obtendo o employee por Id
	@GetMapping("/{id}")
	public ResponseEntity<Autonoma> getAutonomaById(@PathVariable Long id_autonoma) {
		Autonoma autonoma = autonomaRepo.findById(id_autonoma)
				.orElseThrow(() -> new ResourceNotFoundException("Produto or Serviço not exist with id: " + id_autonoma));
		return ResponseEntity.ok(autonoma);
	}
	
	//Atualizando o Employee
	@PutMapping("/{id}")
	public ResponseEntity<Autonoma> updateAutonoma(@PathVariable Long id_autonoma, @RequestBody Autonoma autonomaDetails){
		Autonoma autonoma = autonomaRepo.findById(id_autonoma)
				.orElseThrow(() -> new ResourceNotFoundException("Produto or Serviço not exist with id: " + id_autonoma));
		
		autonoma.setCategoriaNegocio_autonoma(autonomaDetails.getCategoriaNegocio_autonoma());
		autonoma.setCep_autonoma(autonomaDetails.getCep_autonoma());
		autonoma.setComprovanteResid_autonoma(autonomaDetails.getComprovanteResid_autonoma());
		autonoma.setContatoNegocio_autonoma(autonomaDetails.getContatoNegocio_autonoma());
		autonoma.setDataNasc_autonoma(autonomaDetails.getDataNasc_autonoma());
		autonoma.setDescricaoNegocio_autonoma(autonomaDetails.getDescricaoNegocio_autonoma());
		autonoma.setEmail_autonoma(autonomaDetails.getEmail_autonoma());
		autonoma.setEndereco_autonoma(autonomaDetails.getEndereco_autonoma());
		autonoma.setNome_autonoma(autonomaDetails.getNome_autonoma());
		autonoma.setNomeNegocio_autonoma(autonomaDetails.getNomeNegocio_autonoma());
		autonoma.setNumTelefone_autonoma(autonomaDetails.getNumTelefone_autonoma());
		
		
		Autonoma updatedAutonoma = autonomaRepo.save(autonoma);
		
		return ResponseEntity.ok(updatedAutonoma);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteAutonoma(@PathVariable Long id_autonoma){
		Autonoma autonoma = autonomaRepo.findById(id_autonoma)
				.orElseThrow(() -> new ResourceNotFoundException("Produto or Serviço not exist with id: " + id_autonoma));
		
		 autonomaRepo.delete(autonoma);
		 
		 Map<String, Boolean> response = new HashMap<>();
		 
		 response.put("deleted", Boolean.TRUE);
		 
		 return ResponseEntity.ok(response);
	}
}
