package com.example.evento.dto;

import com.example.evento.entities.Atividade;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class AtividadeDTO {
	
	private Long id;
	private String nome;
	private String descricao;
	private Double preco;
	
	public AtividadeDTO() {

	}
	
	
	
	public AtividadeDTO(Atividade a) {
		id = a.getId();
		nome = a.getNome();
		descricao = a.getDescricao();
		preco = a.getPreco() != null ? a.getPreco() : 0.0; 
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	
}
