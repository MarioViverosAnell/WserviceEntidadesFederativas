package com.mx.WsEntidadesFederativas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.WsEntidadesFederativas.entidades.Estados;
import com.mx.WsEntidadesFederativas.servicio.MetodosEstado;

@RestController
@RequestMapping("WServiceEstados")
@CrossOrigin
public class WServiceEstados {
	
	@Autowired
	MetodosEstado metodosEstado;
	
	// http://localhost:9000/WServiceEstados/listar
	
	@GetMapping("listar")
	public List<Estados> listar() {
		return metodosEstado.lista();
		
	}

}
