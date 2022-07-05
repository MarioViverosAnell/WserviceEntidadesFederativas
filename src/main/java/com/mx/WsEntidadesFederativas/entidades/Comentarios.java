package com.mx.WsEntidadesFederativas.entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comentarios")
public class Comentarios {
	@Id
	private int id;
	private int estados_municipios_id;
	private String comentario;
	private Date fecha;
	
	public Comentarios() {
	}

	public Comentarios(int id) {
		this.id = id;
	}

	public Comentarios(int id, int estados_municipios_id, String comentario, Date fecha) {
		this.id = id;
		this.estados_municipios_id = estados_municipios_id;
		this.comentario = comentario;
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Comentarios [id=" + id + ", estados_municipios_id=" + estados_municipios_id + ", comentario="
				+ comentario + ", fecha=" + fecha + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEstados_municipios_id() {
		return estados_municipios_id;
	}

	public void setEstados_municipios_id(int estados_municipios_id) {
		this.estados_municipios_id = estados_municipios_id;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	

}
