package com.almeida.co.dao;


public class Alumno {

	private Long id;
	private String nombre;
	
	
	public Alumno(Long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public Alumno() {
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
