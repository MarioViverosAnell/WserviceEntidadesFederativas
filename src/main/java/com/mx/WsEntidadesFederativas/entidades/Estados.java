package com.mx.WsEntidadesFederativas.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name = "estados")
public class Estados {
	@Id
	private int id;
	private String estado;

	@ManyToMany(mappedBy = "estados")
	List<Municipios> lista = new ArrayList<Municipios>();

	public Estados() {

	}

	public Estados(int id, String estado, List<Municipios> lista) {
		this.id = id;
		this.estado = estado;
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Estados [id=" + id + ", estado=" + estado + ", lista=" + lista + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
