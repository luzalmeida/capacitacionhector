package com.almeida.co.service;

import org.springframework.stereotype.Service;

import com.almeida.co.dao.Alumno;

@Service
public class AlumnoService {
	
	Alumno al = new Alumno ();
	public Alumno devolverAlumno (Long id) {
		return al;
	}
}
