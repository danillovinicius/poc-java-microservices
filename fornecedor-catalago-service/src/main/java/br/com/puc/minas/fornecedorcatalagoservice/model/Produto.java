package br.com.puc.minas.fornecedorcatalagoservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;
	private String tipo;
	private String nome;
	private String unidade;

	public Produto() {
		
	}
	
	public Produto(Long codigo, String tipo, String nome, String unidade) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.nome = nome;
		this.unidade = unidade;
	}
	
	public Produto(String tipo, String nome, String unidade) {
		super();
		this.tipo = tipo;
		this.nome = nome;
		this.unidade = unidade;
	}

	public Long getId() {
		return codigo;
	}
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
}
