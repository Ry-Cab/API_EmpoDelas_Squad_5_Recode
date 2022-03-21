package com.empodelas.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ProdutoServico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_produtoServico;
	
	private String codigo_produtoServico;
	private String tipo_produtoServico;
	private String nome_produtoServico;
	private String descricao_produtoServico;
	private String imagemURL_produtoServico;
	private String linkURL_produtoServico;
	private double preco_produtoServico;
	
	@ManyToOne
	@JoinColumn(name = "autonoma_id_autonoma")
	private Autonoma autonoma;
	
	@JsonIgnore
	@OneToMany(mappedBy = "produtoServico")
	private List<Afiliacao> afiliacao = new ArrayList<Afiliacao>();
	
	
	public String getLinkURL_produtoServico() {
		return linkURL_produtoServico;
	}
	
	public void setLinkURL_produtoServico(String linkURL_produtoServico) {
		this.linkURL_produtoServico = linkURL_produtoServico;
	}
	
	public Autonoma getAutonoma() {
		return autonoma;
	}
	public void setAutonoma(Autonoma autonoma) {
		this.autonoma = autonoma;
	}
	public List<Afiliacao> getAfiliacao() {
		return afiliacao;
	}
	
	public Long getId_produtoServico() {
		return id_produtoServico;
	}
	public void setId_produtoServico(Long id_produtoServico) {
		this.id_produtoServico = id_produtoServico;
	}
	public String getCodigo_produtoServico() {
		return codigo_produtoServico;
	}
	public void setCodigo_produtoServico(String codigo_produtoServico) {
		this.codigo_produtoServico = codigo_produtoServico;
	}
	public String getTipo_produtoServico() {
		return tipo_produtoServico;
	}
	public void setTipo_produtoServico(String tipo_produtoServico) {
		this.tipo_produtoServico = tipo_produtoServico;
	}
	public String getNome_produtoServico() {
		return nome_produtoServico;
	}
	public void setNome_produtoServico(String nome_produtoServico) {
		this.nome_produtoServico = nome_produtoServico;
	}
	public String getDescricao_produtoServico() {
		return descricao_produtoServico;
	}
	public void setDescricao_produtoServico(String descricao_produtoServico) {
		this.descricao_produtoServico = descricao_produtoServico;
	}
	public String getImagemURL_produtoServico() {
		return imagemURL_produtoServico;
	}
	public void setImagemURL_produtoServico(String imagemURL_produtoServico) {
		this.imagemURL_produtoServico = imagemURL_produtoServico;
	}
	public double getPreco_produtoServico() {
		return preco_produtoServico;
	}
	public void setPreco_produtoServico(double preco_produtoServico) {
		this.preco_produtoServico = preco_produtoServico;
	}
	
	
	
}
