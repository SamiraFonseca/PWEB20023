package br.edu.ifgoiano.apicontatos.entity;

import br.edu.ifgoiano.apicontatos.enumerator.AreaDoConhecimento;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String senha;
	
	@Column(unique = true, nullable = false)
	private String email;
	
	@Enumerated
	@Column(nullable = false)
	private AreaDoConhecimento areadoconhecimento;
	
	public AreaDoConhecimento getAreadoconhecimento() {
		return areadoconhecimento;
	}
	public void setAreadoconhecimento(AreaDoConhecimento areadoconhecimento) {
		this.areadoconhecimento = areadoconhecimento;
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
