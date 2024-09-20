package br.com.consultagithub.modelo;

import br.com.consultagithub.record.RecordJson;

public class UserModel {
	
	//Atributos
	private String id;
	private String nome;
	private String login;
	private int seguidores;
	private int repositorios;
	
	
	
	//Construtor
	public UserModel(String id, String nome, String login, int seguidores, int repositorios) {
		setId(id);
		setNome(nome);
		setLogin(login);
		setSeguidores(seguidores);
		setRepositorios(repositorios);
	}
	
	public UserModel(RecordJson usuario) {
		setId(usuario.id());
		setNome(usuario.name());
		setLogin(usuario.login());
		setSeguidores(usuario.followers());
		setRepositorios(usuario.public_repos());
	}

	//Getters e Setters
	private String getId() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
	}

	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private String getLogin() {
		return login;
	}

	private void setLogin(String login) {
		this.login = login;
	}

	private int getSeguidores() {
		return seguidores;
	}

	private void setSeguidores(int seguidores) {
		this.seguidores = seguidores;
	}

	private int getRepositorios() {
		return repositorios;
	}

	private void setRepositorios(int repositorios) {
		this.repositorios = repositorios;
	}

	@Override
	public String toString() {
		return "\n\n--> Dados do usuário: " + 
				"\nId = " + id + 
				"\nNome = " + nome + 
				"\nLogin = " + login + 
				"\nSeguidores = " + seguidores + 
				"\nRepositorios = " + repositorios;
	}
}
