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
import com.empodelas.api.repository.AfiliadaRepository;
import com.empodelas.api.model.Afiliada;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/afiliada")
public class AfiliadaController {

    @Autowired
	private AfiliadaRepository afiliadaRepo;
	
	
	@GetMapping("/")
	public List<Afiliada> getAllAfiliada(){
		return afiliadaRepo.findAll();
	}
	
	
	
	@PostMapping("/")
	public Afiliada createAfiliada(@RequestBody Afiliada afiliada) {
		return afiliadaRepo.save(afiliada);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Afiliada> getAfiliadaById(@PathVariable Long id_afiliada) {
		Afiliada afiliada = afiliadaRepo.findById(id_afiliada)
				.orElseThrow(() -> new ResourceNotFoundException("Produto or Serviço not exist with id: " + id_afiliada));
		return ResponseEntity.ok(afiliada);
	}
	
	
	@PutMapping("/{id}")
	public ResponseEntity<Afiliada> updateAfiliada(@PathVariable Long id_afiliada, @RequestBody Afiliada afiliadaDetails){
		Afiliada afiliada = afiliadaRepo.findById(id_afiliada)
				.orElseThrow(() -> new ResourceNotFoundException("Produto or Serviço not exist with id: " + id_afiliada));
		
		
		
		
		Afiliada updatedAfiliada = afiliadaRepo.save(afiliada);
		
		return ResponseEntity.ok(updatedAfiliada);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteAfiliada(@PathVariable Long id_afiliada){
		Afiliada afiliada = afiliadaRepo.findById(id_afiliada)
				.orElseThrow(() -> new ResourceNotFoundException("Produto or Serviço not exist with id: " + id_afiliada));
		
		 afiliadaRepo.delete(afiliada);
		 
		 Map<String, Boolean> response = new HashMap<>();
		 
		 response.put("deleted", Boolean.TRUE);
		 
		 return ResponseEntity.ok(response);
	}
}
