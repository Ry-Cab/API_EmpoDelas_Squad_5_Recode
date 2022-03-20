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
public class Autonoma {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id_autonoma;
	private String nome_autonoma;
	private String email_autonoma;
	private String dataNasc_autonoma;
	private String numTelefone_autonoma;
	private String endereco_autonoma;
	private String cep_autonoma;
	private String nomeNegocio_autonoma;
	private String contatoNegocio_autonoma;
	private String categoriaNegocio_autonoma;
	private String descricaoNegocio_autonoma;
	private String comprovanteResid_autonoma;
	
	@JsonIgnore
	@OneToMany(mappedBy = "autonoma")
	private List<ProdutoServico> produtoServico = new ArrayList<ProdutoServico>();
	
	
	public List<ProdutoServico> getProdutoServico() {
		return produtoServico;
	}
	
	public Long getId_autonoma() {
		return id_autonoma;
	}
	public void setId_autonoma(Long id_autonoma) {
		this.id_autonoma = id_autonoma;
	}
	public String getNome_autonoma() {
		return nome_autonoma;
	}
	public void setNome_autonoma(String nome_autonoma) {
		this.nome_autonoma = nome_autonoma;
	}
	public String getEmail_autonoma() {
		return email_autonoma;
	}
	public void setEmail_autonoma(String email_autonoma) {
		this.email_autonoma = email_autonoma;
	}
	public String getDataNasc_autonoma() {
		return dataNasc_autonoma;
	}
	public void setDataNasc_autonoma(String dataNasc_autonoma) {
		this.dataNasc_autonoma = dataNasc_autonoma;
	}
	public String getNumTelefone_autonoma() {
		return numTelefone_autonoma;
	}
	public void setNumTelefone_autonoma(String numTelefone_autonoma) {
		this.numTelefone_autonoma = numTelefone_autonoma;
	}
	public String getEndereco_autonoma() {
		return endereco_autonoma;
	}
	public void setEndereco_autonoma(String endereco_autonoma) {
		this.endereco_autonoma = endereco_autonoma;
	}
	public String getCep_autonoma() {
		return cep_autonoma;
	}
	public void setCep_autonoma(String cep_autonoma) {
		this.cep_autonoma = cep_autonoma;
	}
	public String getNomeNegocio_autonoma() {
		return nomeNegocio_autonoma;
	}
	public void setNomeNegocio_autonoma(String nomeNegocio_autonoma) {
		this.nomeNegocio_autonoma = nomeNegocio_autonoma;
	}
	public String getContatoNegocio_autonoma() {
		return contatoNegocio_autonoma;
	}
	public void setContatoNegocio_autonoma(String contatoNegocio_autonoma) {
		this.contatoNegocio_autonoma = contatoNegocio_autonoma;
	}
	public String getCategoriaNegocio_autonoma() {
		return categoriaNegocio_autonoma;
	}
	public void setCategoriaNegocio_autonoma(String categoriaNegocio_autonoma) {
		this.categoriaNegocio_autonoma = categoriaNegocio_autonoma;
	}
	public String getDescricaoNegocio_autonoma() {
		return descricaoNegocio_autonoma;
	}
	public void setDescricaoNegocio_autonoma(String descricaoNegocio_autonoma) {
		this.descricaoNegocio_autonoma = descricaoNegocio_autonoma;
	}
	public String getComprovanteResid_autonoma() {
		return comprovanteResid_autonoma;
	}
	public void setComprovanteResid_autonoma(String comprovanteResid_autonoma) {
		this.comprovanteResid_autonoma = comprovanteResid_autonoma;
	}
	
}
