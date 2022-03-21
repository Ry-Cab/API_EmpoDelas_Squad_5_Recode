package com.empodelas.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Afiliacao {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id_afiliacao;
	
	private String codigo_produtoServico;
	private String descricao_afiliacao;
	
	@ManyToOne
	@JoinColumn(name = "afiliada_id_afiliada")
	private Afiliada afiliada;
	
	@ManyToOne
	@JoinColumn(name = "produtoServico_id_produtoServico")
	private ProdutoServico produtoServico;
	
	
	public Afiliada getAfiliada() {
		return afiliada;
	}
	
	public void setAfiliada(Afiliada afiliada) {
		this.afiliada = afiliada;
	}
	public ProdutoServico getProdutoServico() {
		return produtoServico;
	}
	public void setProdutoServico(ProdutoServico produtoServico) {
		this.produtoServico = produtoServico;
	}
	public Long getId_afiliacao() {
		return id_afiliacao;
	}
	public void setId_afiliacao(Long id_afiliacao) {
		this.id_afiliacao = id_afiliacao;
	}
	public String getCodigo_produtoServico() {
		return codigo_produtoServico;
	}
	public void setCodigo_produtoServico(String codigo_produtoServico) {
		this.codigo_produtoServico = codigo_produtoServico;
	}
	public String getDescricao_afiliacao() {
		return descricao_afiliacao;
	}
	public void setDescricao_afiliacao(String descricao_afiliacao) {
		this.descricao_afiliacao = descricao_afiliacao;
	}
	
	
}
