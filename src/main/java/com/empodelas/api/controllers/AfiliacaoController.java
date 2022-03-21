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
import com.empodelas.api.model.Afiliacao;
import com.empodelas.api.repository.AfiliacaoRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/afiliacao")
public class AfiliacaoController {

    @Autowired
	private AfiliacaoRepository afiliacaoRepo;
	
	
	@GetMapping("/")
	public List<Afiliacao> getAllAfiliacao(){
		return afiliacaoRepo.findAll();
	}
	
	
	
	@PostMapping("/")
	public Afiliacao createAfiliacao(@RequestBody Afiliacao afiliacao) {
		return afiliacaoRepo.save(afiliacao);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Afiliacao> getAfiliacaoById(@PathVariable Long id_afiliacao) {
		Afiliacao afiliacao = afiliacaoRepo.findById(id_afiliacao)
				.orElseThrow(() -> new ResourceNotFoundException("Afiliiacao not exist with id: " + id_afiliacao));
		return ResponseEntity.ok(afiliacao);
	}
	
	
	@PutMapping("/{id}")
	public ResponseEntity<Afiliacao> updateAfiliacao(@PathVariable Long id_afiliacao, @RequestBody Afiliacao afiliacaoDetails){
		Afiliacao afiliacao = afiliacaoRepo.findById(id_afiliacao)
				.orElseThrow(() -> new ResourceNotFoundException("Afiliação not exist with id: " + id_afiliacao));
		
		
		Afiliacao updatedAfiliacao = afiliacaoRepo.save(afiliacao);
		
		return ResponseEntity.ok(updatedAfiliacao);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteAfiliada(@PathVariable Long id_afiliacao){
		Afiliacao afiliacao = afiliacaoRepo.findById(id_afiliacao)
				.orElseThrow(() -> new ResourceNotFoundException("Afiliação not exist with id: " + id_afiliacao));
		
		 afiliacaoRepo.delete(afiliacao);
		 
		 Map<String, Boolean> response = new HashMap<>();
		 
		 response.put("deleted", Boolean.TRUE);
		 
		 return ResponseEntity.ok(response);
	}
}
