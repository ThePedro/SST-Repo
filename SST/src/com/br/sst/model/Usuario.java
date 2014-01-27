package com.br.sst.model;

public class Usuario {
	private Long id;
	private String nome;
	private String email;
	private String curso;
	private Grupo nomeGrupo;
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public Grupo getNomeGrupo() {
		return nomeGrupo;
	}
	public void setNomeGrupo(Grupo nomeGrupo) {
		this.nomeGrupo = nomeGrupo;
	}
	public Long getId() {
		return id;
	}
	
	
	
}
