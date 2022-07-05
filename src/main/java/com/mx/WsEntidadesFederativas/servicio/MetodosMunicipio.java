package com.mx.WsEntidadesFederativas.servicio;

import java.util.List;

import com.mx.WsEntidadesFederativas.entidades.Municipios;

public interface MetodosMunicipio {
	
	public List<Municipios> BuscarLista(int id_estado);
	
	public List<Municipios> listar();
}
