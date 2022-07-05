package com.mx.WsEntidadesFederativas.servicio;

import java.util.List;

import com.mx.WsEntidadesFederativas.entidades.Comentarios;

public interface MetodosComentarios {

	public void guardar(Comentarios comentario);
	public List<Comentarios> listar();
}
