package com.almeida.co.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.almeida.co.dao.Alumno;

@RestController
public class AlumnoController {
	

	@GetMapping 
	public ResponseEntity <Alumno> consultarAlumno (){
		Alumno al = new Alumno ();
		return new ResponseEntity <>(HttpStatusCode.valueOf(200));
	}
}