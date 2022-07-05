package com.mx.WsEntidadesFederativas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.WsEntidadesFederativas.entidades.Comentarios;
import com.mx.WsEntidadesFederativas.servicio.MetodosComentarios;

import lombok.Getter;

@RestController
@RequestMapping("WserviceComentarios")
@CrossOrigin
public class WserviceComentarios {
	
	

	@Autowired
	MetodosComentarios metodosComentarios;
	
//  http://localhost:9000/WserviceComentarios/listar
	
	@GetMapping("listar")
	public List<Comentarios> listar(){
		return metodosComentarios.listar();
	}
	
	//   http://localhost:9000/WserviceComentarios/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Comentarios comentario) {
		metodosComentarios.guardar(comentario);
	}
	
	
}
