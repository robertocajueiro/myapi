package com.roberto.api.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty(message = "Campo NOME é mandatório")
	@Length(min = 3, max = 100, message = "O nome deve ter entre 3 a 100 caracteres")
	private String nome;
	
	@NotEmpty(message = "Campo LOGIN é mandatório")
	@Length(min = 3, max = 100, message = "O nome deve ter entre 3 a 100 caracteres")
	private String login;
	
	@NotEmpty(message = "Campo Senha é Obrigatório")
	@Length(min = 3, max = 100, message = "O nome deve ter entre 3 a 100 caracteres")
	private String senha;

	public Usuario() {
		super();

	}

	public Usuario(Integer id, String nome, String login, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
