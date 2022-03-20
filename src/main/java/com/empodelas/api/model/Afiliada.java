package com.empodelas.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Afiliada {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id_afiliada;
	private String nome_afiliada; 
	private String sobrenome_afiliada;
	private String email_afiliada;
	private String dataNasc_afiliada;
	private String numTelefone_afiliada;
	private String endereco_afiliada;
	private String cep_afiliada;
	private String descricao_afiliada;
	private String comprovanteResid_afiliada;
	
	@JsonIgnore
	@OneToMany(mappedBy = "afiliada")
	private List<Afiliacao> afiliacao = new ArrayList<Afiliacao>();

	
	public List<Afiliacao> getAfiliacao() {
		return afiliacao;
	}
	
	
	public Long getId_afiliada() {
		return id_afiliada;
	}
	public void setId_afiliada(Long id_afiliada) {
		this.id_afiliada = id_afiliada;
	}
	public String getNome_afiliada() {
		return nome_afiliada;
	}
	public void setNome_afiliada(String nome_afiliada) {
		this.nome_afiliada = nome_afiliada;
	}
	public String getSobrenome_afiliada() {
		return sobrenome_afiliada;
	}
	public void setSobrenome_afiliada(String sobrenome_afiliada) {
		this.sobrenome_afiliada = sobrenome_afiliada;
	}
	public String getEmail_afiliada() {
		return email_afiliada;
	}
	public void setEmail_afiliada(String email_afiliada) {
		this.email_afiliada = email_afiliada;
	}
	public String getDataNasc_afiliada() {
		return dataNasc_afiliada;
	}
	public void setDataNasc_afiliada(String dataNasc_afiliada) {
		this.dataNasc_afiliada = dataNasc_afiliada;
	}
	public String getNumTelefone_afiliada() {
		return numTelefone_afiliada;
	}
	public void setNumTelefone_afiliada(String numTelefone_afiliada) {
		this.numTelefone_afiliada = numTelefone_afiliada;
	}
	public String getEndereco_afiliada() {
		return endereco_afiliada;
	}
	public void setEndereco_afiliada(String endereco_afiliada) {
		this.endereco_afiliada = endereco_afiliada;
	}
	public String getCep_afiliada() {
		return cep_afiliada;
	}
	public void setCep_afiliada(String cep_afiliada) {
		this.cep_afiliada = cep_afiliada;
	}
	public String getDescricao_afiliada() {
		return descricao_afiliada;
	}
	public void setDescricao_afiliada(String descricao_afiliada) {
		this.descricao_afiliada = descricao_afiliada;
	}
	public String getComprovanteResid_afiliada() {
		return comprovanteResid_afiliada;
	}
	public void setComprovanteResid_afiliada(String comprovanteResid_afiliada) {
		this.comprovanteResid_afiliada = comprovanteResid_afiliada;
	}
	
	
}
