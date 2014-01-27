package com.br.sst.model;

import java.util.List;

public class Grupo {
	private Long id;
	private String nome;
	private List<Usuario> listUsuario;
	private List<Posts> listPosts;
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Usuario> getListUsuario() {
		return listUsuario;
	}
	public void setListUsuario(List<Usuario> listUsuario) {
		this.listUsuario = listUsuario;
	}
	public List<Posts> getListPosts() {
		return listPosts;
	}
	public void setListPosts(List<Posts> listPosts) {
		this.listPosts = listPosts;
	}
	public Long getId() {
		return id;
	}
	
	
	
	
}
