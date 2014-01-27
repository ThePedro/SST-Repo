package com.br.sst.model;

public class Posts {
	private Long id;
	private String titulo;
	private String texto;
	
	//Getters and Setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Long getId() {
		return id;
	}
}
