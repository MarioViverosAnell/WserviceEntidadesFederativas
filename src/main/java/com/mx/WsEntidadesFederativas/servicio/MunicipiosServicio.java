package com.mx.WsEntidadesFederativas.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.WsEntidadesFederativas.dao.EstadosDao;
import com.mx.WsEntidadesFederativas.dao.EstadosMunicipiosDao;
import com.mx.WsEntidadesFederativas.dao.MunicipiosDao;
import com.mx.WsEntidadesFederativas.entidades.Estados;
import com.mx.WsEntidadesFederativas.entidades.Municipios;

@Service
public class MunicipiosServicio implements MetodosMunicipio {
	
	@Autowired
	MunicipiosDao municipiosDao;
	
	@Autowired
	EstadosMunicipiosDao estadosMuniciosDao;
	
	@Autowired
	EstadosDao estadosDao;
	
	public List<Municipios> BuscarLista(int id_estado){
		
		
		// NO SIRVE, ESTABA REALIZANDO PRUEBAS
//		
//		estadosMuniciosDao.findByEstados_id(id_estado);
		
//		Optional<Estados> estado = estadosDao.findById(id_estado);
//		if(estado.isPresent()) {
//			return estado.get().getLista();
//		}
		
		return null;
	}
//	
	public List<Municipios> listar() {
		// TODO Auto-generated method stub
		return (List<Municipios>) municipiosDao.findAll();
	}

}
