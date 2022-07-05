package com.mx.WsEntidadesFederativas.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.WsEntidadesFederativas.dao.EstadosDao;
import com.mx.WsEntidadesFederativas.entidades.Estados;

@Service
public class EstadosServicio implements MetodosEstado{
	
	@Autowired
	EstadosDao estadosDao;

	@Override
	public List<Estados> lista() {
		// TODO Auto-generated method stub
		return (List<Estados>) estadosDao.findAll();
	}
}
