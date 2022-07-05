package com.mx.WsEntidadesFederativas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.WsEntidadesFederativas.entidades.Estados;
import com.mx.WsEntidadesFederativas.entidades.Municipios;
import com.mx.WsEntidadesFederativas.servicio.MetodosMunicipio;

@RestController
@RequestMapping("WserviceMunicipios")
@CrossOrigin
public class WserviceMunicipios {

	@Autowired
	MetodosMunicipio metodosMunicipio;
	
	
	// http://localhost:9000/WserviceMunicipios/listar
	@GetMapping("listar")
	public List<Municipios> listar(){
		return metodosMunicipio.listar();
		
	}
	
	
	//No funciona, estaba haciendo pruebas con la cardinalidad del proyecto
	@GetMapping("listar/{idEstado}")
	public List<Municipios> listar(@PathVariable("idEstado") Integer idEstado) {
		return metodosMunicipio.BuscarLista(idEstado);
	}
}


