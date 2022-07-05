package com.mx.WsEntidadesFederativas.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.WsEntidadesFederativas.dao.ComentariosDao;
import com.mx.WsEntidadesFederativas.entidades.Comentarios;

@Service
public class ComentariosServicio implements MetodosComentarios{

	@Autowired
	ComentariosDao comentariosDao;

	@Override
	public void guardar(Comentarios comentario) {
		// TODO Auto-generated method stub
		comentariosDao.save(comentario);
		
	}

	@Override
	public List<Comentarios> listar() {
		// TODO Auto-generated method stub
		return (List<Comentarios>) comentariosDao.findAll();
	}
	
	
	

}
